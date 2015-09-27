package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ListaControlador implements TemplateViewRoute {

	private FilmeDAO dao = new FilmeDAO();
	
	@Override
	public ModelAndView handle(Request req, Response res) {
		ArrayList<Filme> filmes = dao.findAll();
		HashMap mapa = new HashMap();
				//variável HTML - o primeiro nome é válido para HTML e o segundo para Java 
		mapa.put("filmes", filmes);
		return new ModelAndView(mapa, "filme_lista.html");
	}
	
	
		
}
