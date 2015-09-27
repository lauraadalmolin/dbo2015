package twiterr;

import toolkit.*;

public class Comunidade {
	
	private String descricao;
	private List<Usuario> membros = new List<Usuario>();
	private Date data;
	private String nome;
	private List<Postagem> postagens = new List<Postagem>();
	public Comunidade(Date data, String nome) {
		this.data = data;
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public List<Usuario> getMembros() {
		return membros;
	}
	public Date getData() {
		return data;
	}
	public String getNome() {
		return nome;
	}
	public List<Postagem> getPostagens() {
		return postagens;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
