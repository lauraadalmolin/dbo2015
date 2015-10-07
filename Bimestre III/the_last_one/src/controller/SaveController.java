package controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import persistence.PostDAO;
import model.Post;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class SaveController implements TemplateViewRoute {
	
	PostDAO dao = new PostDAO();
	
	@Override
	public ModelAndView handle(Request req, Response res) {
		Post post = new Post();
		post.setTitle(req.queryMap("title").value());
		post.setText(req.queryMap("text").value());
		if (post.getTitle().length() < 15) { // inválido
			res.redirect("/new?error=" + "Title must have at least 15 chars");
		} else { 
			if (post.getText().length() < 100) {
				res.redirect("/new?error=" + "Text must have at least 100 chars");
			}
			else {
				dao.save(post);
				res.redirect("/list");
			}
		}
		return null;
	}

}
