package web;

import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;
import controlador.ExcluiControlador;
import controlador.ListaControlador;
import controlador.NovoControlador;
import controlador.PaginaInicialControlador;
import controlador.SalvaControlador;

public class Main {

	public static void main(String[] args) {
		

		// precisa de um package publico (pub)
		// onde ficam os css, js, imgs, conte�do fixo
		Spark.staticFileLocation("/publico");
		
		// precisa de um package apresentacao (views)
		// onde ficam os HTML's
		MustacheTemplateEngine engine = 
				new MustacheTemplateEngine("apresentacao");
		
		PaginaInicialControlador paginaInicial =
				new PaginaInicialControlador();
		
		// get ou post (get ler informa��es, post submeter informa��es)
		Spark.get("/", paginaInicial, engine);
		
		NovoControlador novoControlador = 
				new NovoControlador();
		
		// abrir o form
		Spark.get("/novo", novoControlador, engine);
		
		SalvaControlador salvaControlador =
				new SalvaControlador();
		
		// submiss�o do form
		Spark.post("/salva", salvaControlador, engine);
		
		ListaControlador listaControlador =
				new ListaControlador();
		
		Spark.get("/lista", listaControlador, engine);
		
		ExcluiControlador excluiControlador = 
				new ExcluiControlador();
		
		Spark.get("/exclui/:numero", excluiControlador, engine);
		
				
	}
}
