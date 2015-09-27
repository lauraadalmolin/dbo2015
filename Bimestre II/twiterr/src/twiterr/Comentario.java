package twiterr;

import toolkit.*;

public class Comentario {
	
	private String texto;
	private Usuario perfil;
	private Date data;
	private List<Avaliacao> likes = new List<Avaliacao>();
	private List<Avaliacao> dislikes = new List<Avaliacao>();
	
	public Comentario(String texto, Usuario perfil, Date data) {
		this.texto = texto;
		this.perfil = perfil;
		this.data = data;
	}
	
	

	public String getTexto() {
		return texto;
	}



	public Usuario getPerfil() {
		return perfil;
	}



	public Date getData() {
		return data;
	}



	public List<Avaliacao> getLikes() {
		return likes;
	}

	public int getNumLikes(){
		return likes.count();
	}

	public List<Avaliacao> getDislikes() {
		return dislikes;
	}


	public int getNumDislikes(){
		return dislikes.count();
	}

	@Override
	public String toString() {
		return "Comentario [texto=" + texto + ", perfil=" + perfil + ", data="
				+ data;
	}
	
}
