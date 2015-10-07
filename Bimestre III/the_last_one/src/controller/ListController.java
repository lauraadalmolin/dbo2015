package controller;

import java.util.ArrayList;
import java.util.HashMap;

import model.Post;
import persistence.PostDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ListController implements TemplateViewRoute {
	
	PostDAO dao = new PostDAO();
	
	public ModelAndView handle(Request req, Response res) {
		ArrayList<Post> posts = dao.findAll();
		HashMap map = new HashMap();
				//variável HTML - o primeiro nome é válido para HTML e o segundo para Java 
		map.put("posts", posts);
		return new ModelAndView(map, "list_posts.html");
	}

}
