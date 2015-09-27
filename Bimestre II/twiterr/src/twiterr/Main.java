package twiterr;

import toolkit.*;

public class Main {

	public static void main(String[] args) {
		
		Usuario pedro = new Usuario("pedro", "123","pedro",new Date(4,3,1990),"masculino","12345@yahoo.com");
		Usuario ana = new Usuario("ana", "123", "ana",new Date(16,8,1995),"feminino","123456@yahoo.com");
		
		pedro.addSeguidor(ana);
		System.out.println(pedro.getSeguidores().get(0).equals(ana));
		System.out.println(ana.getSeguidores().get(0) == null);
		
		pedro.addPostagem("xablau", new Date(15, 5, 2010));
		System.out.println(pedro.getPostagens().get(0));

		ana.like(pedro.getPostagens().get(0));
		System.out.println(pedro.getPostagens().get(0).getNumLikes()==1);
		
		ana.dislike(pedro.getPostagens().get(0));
		System.out.println(pedro.getPostagens().get(0).getNumDislikes()==1);
		
		ana.comentar(pedro.getPostagens().get(0), "ola", new Date(19, 10, 2010));
		System.out.println(pedro.getPostagens().get(0).getComentarios().get(0));
		
		pedro.like(pedro.getPostagens().get(0).getComentario(0));
		System.out.println(pedro.getPostagens().get(0).getComentario(0).getNumLikes() == 1);
		
		
	}

}
