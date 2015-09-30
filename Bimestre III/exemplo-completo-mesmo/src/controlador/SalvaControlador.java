package controlador;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import modelo.Filme;
import persistencia.FilmeDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class SalvaControlador implements TemplateViewRoute {
	
	private FilmeDAO dao = new FilmeDAO();
	
/*	@Override
	public ModelAndView handle(Request req, Response res) {
		Filme f = new Filme();
		
		f.setNumero(req.queryMap("numero").integerValue());
		f.setTitulo(req.queryMap("titulo").value());
		f.setAno(req.queryMap("ano").integerValue());
		f.setGenero(req.queryMap("genero").value());
		if (f.getTitulo().length() < 3) { // inv�lido
			res.redirect("/novo?erro=T�tulo deve ter pelo menos 3 caracteres.");
		}
		else {
			// v�lido
			dao.save(f);
			res.redirect("/lista");
		}
		if (f.getTitulo().length() < 3) { // inv�lido
			Spark.halt(400, "T�tulo deve ter pelo menos 3 caracteres.");
		}
		else {
			// v�lido
			dao.save(f);
			res.redirect("/lista");
		}
		return null;
	}*/
	@Override
	public ModelAndView handle(Request req, Response resp) {		
		Filme filme = new Filme();
		filme.setNumero(req.queryMap("numero").integerValue());
		filme.setTitulo(req.queryMap("titulo").value());
		filme.setAno(req.queryMap("ano").integerValue());
		filme.setGenero(req.queryMap("genero").value());
		if (filme.getTitulo().length() < 3) { // inv�lido
			String erro = "";
			try {
				erro = URLEncoder.encode("T�tulo deve ter pelo menos 3 caracteres", "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			resp.redirect("/novo?erro=" + erro);
		} else { // v�lido
			dao.save(filme);	
			resp.redirect("/lista");
		}
//		if (filme.getTitulo().length() < 3) { // inv�lido
//			Spark.halt(400, "T�tulo deve ter pelo menos 3 caracteres");
//		} else { // v�lido
//			dao.save(filme);	
//			resp.redirect("/lista");
//		}
		return null;
	}
}
