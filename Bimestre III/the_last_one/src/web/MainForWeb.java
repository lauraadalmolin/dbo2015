package web;

import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;
import controller.HomeController;
import controller.ListController;
import controller.NewController;
import controller.SaveController;

public class MainForWeb {

	public static void main(String[] args) {
		
		// precisa de um package publico (pub)
		// onde ficam os css, js, imgs, conte�do fixo
		Spark.staticFileLocation("/pub");
		// precisa de um package apresentacao (views)
		// onde ficam os HTML's
		MustacheTemplateEngine engine = new MustacheTemplateEngine("pub");
	
		HomeController homeController = new HomeController();
	
		// get ou post (get ler informa��es, post submeter informa��es)
		Spark.get("/", homeController, engine);
				
		NewController newController = new NewController();
				
		// abrir o form
		Spark.get("/new", newController, engine);
				
		SaveController saveController =	new SaveController();
				
		// submiss�o do form
		Spark.post("/save", saveController, engine);
				
		ListController listController =	new ListController();
				
		Spark.get("/list", listController, engine);
				



	}

}
