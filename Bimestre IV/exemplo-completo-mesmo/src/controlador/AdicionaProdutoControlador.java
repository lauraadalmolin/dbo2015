package controlador;

import java.util.ArrayList;

import modelo.Produto;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Session;

public class AdicionaProdutoControlador implements Route {

	@Override
	public Object handle(Request req, Response res) throws Exception {
		int codigo = Integer.parseInt(req.params("codigo"));
		Produto produtoAdicionar = null;
		for (Produto p : Produto.produtos) {
			if (p.getCodigo() == codigo) {
				produtoAdicionar = p;
			}
		}
		
		Session sessao = req.session();
		if(sessao.isNew()) {
			ArrayList<Produto> carrinho = new ArrayList<Produto>();
			carrinho.add(produtoAdicionar);
			sessao.attribute("carrinho", carrinho);
		}
		else {
			ArrayList<Produto> carrinho = sessao.attribute("carrinho");
			carrinho.add(produtoAdicionar);
		}
		
		
		return "Produto adicionado com sucesso";
	}
	
	
	
}
