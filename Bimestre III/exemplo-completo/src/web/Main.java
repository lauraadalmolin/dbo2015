package web;

import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;
import controlador.ListaControlador;
import controlador.NovoControlador;
import controlador.PaginaInicialControlador;
import controlador.SalvaControlador;

public class Main {

	public static void main(String[] args) {
		
		// precisa de um package static
		// onde ficam os css, javascript, imgs, conte�do fixo
		Spark.staticFileLocation("/publico");
		
		// precisa de um package apresenta��o (views)
		// onde ficam os HTML'S
		MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao");
		
		PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
		NovoControlador novoControlador = new NovoControlador();
		SalvaControlador salvaControlador = new SalvaControlador();
		ListaControlador listaControlador = new ListaControlador();
		// get ou post
		// get quando vai ler informa��es, post submeter informa��es
		
		Spark.get("/", paginaInicial, engine);
		// abrir o form (ABRIR COISAS = GET)
		Spark.get("/novo", novoControlador, engine);
		// submiss�o do form (SALVAR, ALTERAR COISAS = POST)
		Spark.post("/salva", salvaControlador, engine);
		Spark.get("/lista", listaControlador, engine);
		
		
		
	}

}
