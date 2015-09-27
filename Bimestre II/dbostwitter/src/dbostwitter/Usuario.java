package dbostwitter;

import java.util.*;

public class Usuario {
	
	private String login;
	private String senha;
	private String email;
	private ArrayList<Postagem> postagens = new  ArrayList<Postagem>();
	private ArrayList<Repostagem> repostagens = new ArrayList<Repostagem>();
	private Perfil perfil = new Perfil();
	
	public Usuario (String s, String s2, String s3, String s4) {
		perfil.setNome(s);
		email = s2;
		login = s3;
		senha = s4;
	}
	
	public ArrayList<Repostagem> getRepostagens () {
		return repostagens;
	}
	
	public ArrayList<Postagem> getPostagens () {
		return postagens;
	}
	
	public Perfil getPerfil() {
		return perfil;
	}

	public Usuario(String login, String senha, String email) {
		this.login = login;
		this.senha = senha;
		this.email = email;
	}
	
	public Postagem getPostagem(Usuario u, int i) {
		return u.getPostagem(i);
	}

	public Postagem getPostagem(int i){
		return postagens.get(i);
	}
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void newPostagem(String a) {
		Postagem p = new Postagem(a, new Date());
		postagens.add(p);
	}
	
	public void repost(Usuario u2, int i){
		Postagem p1 = u2.getPostagem(i);
		Date d = new Date();
		Repostagem r = new Repostagem(p1, d);
		repostagens.add(r);
	}
	
	public String toString() {
		return "Nome: " + perfil.getNome() + " - Login: " + login;		
	}

	public boolean compareSenha(String s2) {
		return s2.equals(senha);
	}
	
	
	

}
