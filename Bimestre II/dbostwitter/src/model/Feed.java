package model;

import java.util.ArrayList;

import dbostwitter.Usuario;

public class Feed {
	
	public boolean logado = false;
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public Usuario u;
	
	
	public void addUser(String s, String s2, String s3, String s4) {
		Usuario u = new Usuario(s, s2, s3, s4);
		usuarios.add(u);
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public String toString() {
		ArrayList<String> usuarioString = new ArrayList<String>();
		for (int i = 0; i < usuarios.size(); i++) {
			usuarioString.add(usuarios.get(i).toString());
		}
		return usuarioString.toString();
	}

	public Usuario get(int i) {
		return usuarios.get(i);
	}

	public int getUsuarioSize() {
		return usuarios.size();
	}
	
	
	
}
