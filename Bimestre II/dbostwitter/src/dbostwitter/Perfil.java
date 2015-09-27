package dbostwitter;

import java.util.ArrayList;
import toolkit.*;

public class Perfil {
	
	private String nome;
	private ArrayList<Usuario> seguidores = new ArrayList<Usuario>();
	private ArrayList<Usuario> seguindo = new ArrayList<Usuario>();
	private Date data_nascimento;
	private String sexo;
	private String descricao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascimento(Date d) {
		this.data_nascimento = d;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
	public void setDescricao(String d) {
		this.descricao = d;
	}
	public void addSeguidor(Usuario u){
		seguidores.add(u);
	}
	public void addSeguindo(Usuario u){
		seguindo.add(u);
	}
	public String getNome() {
		return nome;
	}
}
