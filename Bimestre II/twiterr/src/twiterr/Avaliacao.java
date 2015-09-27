package twiterr;

import toolkit.*;

public class Avaliacao {
	
	private boolean likes;
	private boolean dislikes;
	private Usuario perfil;
	
	public Avaliacao(boolean av, Usuario perfil) {
		if(av == true){
			likes = true;
			dislikes = false;
		}else{
			likes = false;
			dislikes = true;
		}
		this.perfil = perfil;
	}
	
	
}