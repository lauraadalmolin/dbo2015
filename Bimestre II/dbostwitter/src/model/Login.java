package model;

import java.util.ArrayList;

import dbostwitter.Postagem;
import dbostwitter.Usuario;

public class Login {

	private String login;
	private String senha;
	public Usuario u;
	
	public Usuario getUsuario() {
		return u;
	}
	
	public ArrayList<Postagem> getPostagens() {
		return u.getPostagens();
	}
	
	public Login (String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Login() {
		
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String s) {
		login = s;
		
	}

	public void setSenha(String s2) {
		senha = s2;
		
	}
	
	
	
		
}
