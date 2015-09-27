package dbostwitter;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;


public class Main {

	public static void main(String[] args) {
	
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		
		Spark.staticFileLocation("/pub");
		
		FeedController feedController = new FeedController();
		
		Route newUser = feedController.newUser;
		
		TemplateViewRoute openLog = feedController.openLog;
		
		Route login = feedController.logado;
		
		TemplateViewRoute erro = feedController.erro;
		
		TemplateViewRoute newPost = feedController.newPost;
				
		// Route mostraMensagens = mural.mostraMensagens;
		// vai para um template
		
		TemplateViewRoute showUsers = feedController.showUsers;
		
		Route postagem = feedController.postagem;
		
		Spark.get("/new_post", newPost, engine);
		
		Spark.post("/feed", newUser);
		
		Spark.get("/feed", showUsers, engine);
		
		Spark.get("/login", openLog, engine);
		
		Spark.get("/usuarios", showUsers, engine);
		
		Spark.post("/logado", login);
		
		Spark.get("/logado", login);
		
		Spark.get("/logado_mensagem_erro", erro, engine);
		
		Spark.post("/refreshlogado", postagem);
		
		
		
	}

}
