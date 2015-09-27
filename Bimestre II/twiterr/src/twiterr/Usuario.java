package twiterr;

import toolkit.*;

public class Usuario {

	private String usuario;
	private String senha;
	private String nome;
	private Date nascimento;
	private String sexo;
	private String email;
	private List<Postagem> postagens = new List<Postagem>();
	private List<Usuario> seguidores = new List<Usuario>();
	private List<Comunidade> comunidades = new List<Comunidade>();
	
	public Usuario(String u, String senha, String n, Date nasc, String s, String e){
		usuario = u;
		this.senha = senha;
		nome = n;
		nascimento = nasc;
		sexo = s;
		email = e;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public List<Usuario> getSeguidores() {
		return seguidores;
	}

	public List<Comunidade> getComunidades() {
		return comunidades;
	}
	
	public void addSeguidor(Usuario p){
		seguidores.append(p);
	}
	
	public void addPostagem(String s,Date d){
		Postagem p = new Postagem(s,this,d);
		postagens.append(p);
	}

	public void like(Postagem p){
		p.getLikes().append(new Avaliacao(true, this));
	}
	
	public void dislike(Postagem p){
		p.getDislikes().append(new Avaliacao(false, this));
	}
	
	public void like(Comentario c){
		c.getLikes().append(new Avaliacao(true, this));
	}
	
	public void dislike(Comentario c){
		c.getDislikes().append(new Avaliacao(false, this));
	}
	
	public void comentar(Postagem p, String t, Date d){
		p.getComentarios().append(new Comentario(t,this,d));
	}
	
	public void seguirComunidade(Comunidade c){
		comunidades.append(c);
		c.getMembros().append(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comunidades == null) ? 0 : comunidades.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((postagens == null) ? 0 : postagens.hashCode());
		result = prime * result
				+ ((seguidores == null) ? 0 : seguidores.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Usuario other = (Usuario) obj;
		if (comunidades == null) {
			if (other.comunidades != null)
				return false;
		} else if (!comunidades.equals(other.comunidades))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (postagens == null) {
			if (other.postagens != null)
				return false;
		} else if (!postagens.equals(other.postagens))
			return false;
		if (seguidores == null) {
			if (other.seguidores != null)
				return false;
		} else if (!seguidores.equals(other.seguidores))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	
	
	
}
