package web2;

import spark.*;

import java.util.*;

import model.Mural;

public class MuralController {

	private Mural mural = new Mural();

	public final Route novaMensagem = new NovaMensagem();
	public final TemplateViewRoute mostraMensagens = new MostraMensagens();

	public class NovaMensagem implements Route {

		@Override
		public Object handle(Request req, Response res) throws Exception {
			String m = req.queryParams("mensagem");
			mural.addMensagem(m);
			res.redirect("/mural");
			return null;
		}

	}

	public class MostraMensagens implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request req, Response res) {
			return new ModelAndView(mural, "mural.html");
		}

	}

}
