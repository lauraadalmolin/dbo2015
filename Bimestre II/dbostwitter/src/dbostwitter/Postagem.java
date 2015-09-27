package dbostwitter;

import java.util.ArrayList;
import java.util.Date;

public class Postagem {

	private String texto;
	private Date data_horario;
	private int n_repostagens;
	private int n_likes;
	private int n_dislikes;
	private ArrayList<Like> likes = new ArrayList<Like>();
	private ArrayList<Dislike> dislikes = new ArrayList<Dislike>();
	private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Postagem (String texto, Date d) {
		if (texto.length() < 140) {
		this.texto = texto;
		this.data_horario = d; }
	}
	
	public void like(Usuario u){
		n_likes++;
		Like l = new Like (u);
		likes.add(l);
	}
	
	public void dislike(Usuario u){
		n_dislikes++;
		Dislike l = new Dislike (u);
		dislikes.add(l);		
	}

	public void comment(String string, Usuario usuario) {
		Comentario c = new Comentario(string, usuario);
		comentarios.add(c);
		
	}
	public String getTexto (){
		return texto;
	}
	
	public int getLikes() {
		return n_likes;
	}
	
	public int getDislikes() {
		return n_dislikes;
	}
	
	public String getComentario (int i) {
		return comentarios.get(i).getTexto();
	}
	
	public ArrayList<Comentario> getComentarios () {
		return comentarios;
	}
	
}
