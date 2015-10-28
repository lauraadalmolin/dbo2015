package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Produto;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ProdutosControlador implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response res) {
		
		HashMap mapa = new HashMap();
		mapa.put("produtos", Produto.produtos);
		return new ModelAndView(mapa, "produtos.html");
	}
	
	
}
