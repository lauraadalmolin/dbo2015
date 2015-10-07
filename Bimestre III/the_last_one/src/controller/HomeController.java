package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class HomeController implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response res) {
		res.redirect("index.html");
		return null;
	}

}
