package web;

import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;
import controlador.AdicionaProdutoControlador;
import controlador.CarrinhoControlador;
import controlador.ExcluiControlador;
import controlador.FotoControlador;
import controlador.ListaControlador;
import controlador.NovoControlador;
import controlador.PaginaInicialControlador;
import controlador.ProdutosControlador;
import controlador.SalvaControlador;

public class Main {

	public static void main(String[] args) {
		

		// precisa de um package publico (pub)
		// onde ficam os css, js, imgs, conteúdo fixo
		Spark.staticFileLocation("/pub");
		
		// precisa de um package apresentacao (views)
		// onde ficam os HTML's
		MustacheTemplateEngine engine = 
				new MustacheTemplateEngine("apresentacao");
		
		PaginaInicialControlador paginaInicial =
				new PaginaInicialControlador();
		
		// get ou post (get ler informações, post submeter informações)
		Spark.get("/", paginaInicial, engine);
		
		NovoControlador novoControlador = 
				new NovoControlador();
		
		// abrir o form
		Spark.get("/novo", novoControlador, engine);
		
		SalvaControlador salvaControlador =
				new SalvaControlador();
		
		// submissão do form
		Spark.post("/salva", salvaControlador, engine);
		
		ListaControlador listaControlador =
				new ListaControlador();
		
		Spark.get("/lista", listaControlador, engine);
		
		ExcluiControlador excluiControlador = 
				new ExcluiControlador();
		
		Spark.get("/exclui/:numero", excluiControlador, engine);
		
		FotoControlador upador = new FotoControlador();
		
		Spark.post("/recebefoto", upador);
		
		ProdutosControlador produtos = new ProdutosControlador();
		
		Spark.get("/produtos", produtos, engine);
		
		AdicionaProdutoControlador adiciona = new AdicionaProdutoControlador();
		
		Spark.get("/adiciona/:codigo", adiciona);
		
		CarrinhoControlador carrinho = new CarrinhoControlador();
		
		Spark.get("/carrinho", carrinho, engine);
		
		
		
				
	}
}
