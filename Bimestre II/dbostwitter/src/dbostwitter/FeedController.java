package dbostwitter;

import model.*;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateViewRoute;

public class FeedController {
	
	private Feed feed = new Feed();
	
	private Login login = new Login();
	
	public final Route newUser = new NewUser();
	public final Route logado = new Logado();
	public final TemplateViewRoute showUsers = new ShowUsers();
	public final TemplateViewRoute openLog = new OpenLog();
	public final TemplateViewRoute newPost = new NewPost();
	public final Route postagem = new Postagem();
	public final TemplateViewRoute erro = new Erro();
	
	public class Erro implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request arg0, Response arg1) {
			return new ModelAndView(login, "logado_mensagem_erro.html");
		}


		
	}
	
	
	public class NewPost implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request arg0, Response arg1) {
			return new ModelAndView(feed, "new_post.html");
		}
		
	}
	
	public class OpenLog implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request arg0, Response arg1) {
			return new ModelAndView(login, "logado.html");
		}
		
	}
	
	public class Postagem implements Route {

		@Override
		public Object handle(Request req, Response res) throws Exception {
			String s = req.queryParams("post");
			char[] a = s.toCharArray();
			if (a.length <= 140 ) {
				login.u.newPostagem(s);
				res.redirect("/logado");
				return null;
			}
			res.redirect("/logado_mensagem_erro");
			return null;
		}
		
	}

	
	public class NewUser implements Route {

		@Override
		public Object handle(Request req, Response res) throws Exception {
			String s = req.queryParams("nome");
			String s2 = req.queryParams("email");
			String s3 = req.queryParams("login");
			String s4 = req.queryParams("senha");
			feed.addUser(s, s2, s3, s4);
			res.redirect("/feed");
			return null;
		}
		
	}
	
	public class ShowUsers implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request arg0, Response arg1) {
			return new ModelAndView(feed, "feed.html");
		}
		
	}
	
	public class Logado implements Route {

		public Object handle(Request req, Response res) throws Exception {
			if (feed.logado == true) {
				res.redirect("/login"); 
				return null;
			}
			String s = req.queryParams("login");
			String s2 = req.queryParams("senha");
			for(int i = 0; i < feed.getUsuarioSize(); i++) {
				if (feed.get(i).getLogin().equals(s)) {
					if (feed.get(i).compareSenha(s2)) {
						feed.u = feed.get(i);
						login.u = feed.get(i);
						login.setLogin(s);
						login.setSenha(s2);
						feed.logado = true;
						res.redirect("/login");
						return null;
					}
				}
			}
			res.redirect("/erro.html");
			return null;
		}
		
	}
}
