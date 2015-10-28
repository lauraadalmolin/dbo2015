package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Produto;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class CarrinhoControlador implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response res) {
		ArrayList<Produto> carrinho = req.session().attribute("carrinho");
		HashMap mapa = new HashMap();
		mapa.put("carrinho", carrinho);		
		return new ModelAndView(mapa, "carrinho.html");
	}
	
		
	
}
