package twiterr;

import toolkit.*;

public class Postagem {

	private String texto;
	private Usuario perfil;
	private Date data;
	private List<Avaliacao> likes = new List<Avaliacao>();
	private List<Avaliacao> dislikes = new List<Avaliacao>();
	private Usuario origem;
	private List<Comentario> comentarios = new List<Comentario>();
	
	public Postagem(String t, Usuario p, Date d){
		if(t.toCharArray().length > 120) throw new IllegalArgumentException();
		else{
			texto = t;
			perfil = p;
			data = d;
		}
		
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

	public int getNumLikes(){
		return likes.count();
	}

	
	public List<Avaliacao> getLikes() {
		return likes;
	}

	public Comentario getComentario(int index){
		return comentarios.get(index);
	}

	public List<Avaliacao> getDislikes() {
		return dislikes;
	}

	public int getNumDislikes(){
		return dislikes.count();
	}


	public Usuario getOrigem() {
		return origem;
	}



	public List<Comentario> getComentarios() {
		return comentarios;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comentarios == null) ? 0 : comentarios.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((dislikes == null) ? 0 : dislikes.hashCode());
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Postagem other = (Postagem) obj;
		if (comentarios == null) {
			if (other.comentarios != null)
				return false;
		} else if (!comentarios.equals(other.comentarios))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (dislikes == null) {
			if (other.dislikes != null)
				return false;
		} else if (!dislikes.equals(other.dislikes))
			return false;
		if (likes == null) {
			if (other.likes != null)
				return false;
		} else if (!likes.equals(other.likes))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Postagem [texto=" + texto + ", perfil=" + perfil + ", data="
				+ data + ", likes=" + likes + ", dislikes=" + dislikes
				+ ", origem=" + origem + ", comentarios=" + comentarios + "]";
	}
	
	
	
}
