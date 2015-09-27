package controlador;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class SalvaControlador implements TemplateViewRoute {
	
	private FilmeDAO dao = new FilmeDAO();
	
	@Override
	public ModelAndView handle(Request req, Response res) {
		Filme f = new Filme();
		
		f.setNumero(req.queryMap("numero").integerValue());
		f.setTitulo(req.queryMap("titulo").value());
		f.setAno(req.queryMap("ano").integerValue());
		f.setGenero(req.queryMap("genero").value());
		
		
		dao.save(f);
		res.redirect("/lista");
		return null;
	}

}
