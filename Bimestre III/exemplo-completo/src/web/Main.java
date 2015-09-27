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
		// onde ficam os css, javascript, imgs, conteúdo fixo
		Spark.staticFileLocation("/publico");
		
		// precisa de um package apresentação (views)
		// onde ficam os HTML'S
		MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao");
		
		PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
		NovoControlador novoControlador = new NovoControlador();
		SalvaControlador salvaControlador = new SalvaControlador();
		ListaControlador listaControlador = new ListaControlador();
		// get ou post
		// get quando vai ler informações, post submeter informações
		
		Spark.get("/", paginaInicial, engine);
		// abrir o form (ABRIR COISAS = GET)
		Spark.get("/novo", novoControlador, engine);
		// submissão do form (SALVAR, ALTERAR COISAS = POST)
		Spark.post("/salva", salvaControlador, engine);
		Spark.get("/lista", listaControlador, engine);
		
		
		
	}

}
