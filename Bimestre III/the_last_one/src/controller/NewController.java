package controller;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class NewController implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response res) {
		HashMap map = new HashMap();
		if (req.queryParams("error") != null) { // existe um parâmetro erro
			map.put("error", req.queryParams("error"));
		}
		return new ModelAndView(map, "new_post.html");
	}

}
