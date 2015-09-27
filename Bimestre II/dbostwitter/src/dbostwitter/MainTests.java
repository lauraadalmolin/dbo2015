package dbostwitter;

import toolkit.Date;

public class MainTests {

	public static void main(String[] args) {
		
		Usuario u = new Usuario("marilene_ola", "marilene_ola@gmail.com", "123456a" );
		Date d = new Date(7,1,1999);
				
		 u.getPerfil().setNome("Marilene");
		 u.getPerfil().setSexo("Feminino");
		 u.getPerfil().setDataNascimento(d);
		 u.getPerfil().setDescricao("una persona");
		 
		 Usuario u2 = new Usuario("salvio_vinho", "salvio.tainha@gmail.com", "12346b" );
		 Usuario u3 = new Usuario("felix_adao", "yuri.joao.thiago@gmail.com", "12346c" );
		 
		 u.newPostagem("primeira postagem");
		 u2.getPostagem(u, 0).like(u2);
		 
		 System.out.println(u2.getPostagem(u, 0).getTexto().equals("primeira postagem"));
		 System.out.println(u2.getPostagem(u, 0).getLikes() == 1);
		 System.out.println(u2.getPostagem(u, 0).getDislikes() == 0);
		 
		 u3.getPostagem(u, 0).dislike(u3);
		 
		 System.out.println(u2.getPostagem(u, 0).getDislikes() == 1);
		 
		 u2.newPostagem("Ola Marilene! A noite, tainha, vinho... e muito...");
		 u.getPostagem(u2, 0).like(u);
		 u.repost(u2, 0);
		 
		 System.out.println(u.getRepostagens().size() == 1);
		 
		 u.getPostagem(u2, 0).comment("Ola Salvio! Estou aguardando...", u);
		 
		 System.out.println(u.getPostagem(u2, 0).getComentario(0).equals("Ola Salvio! Estou aguardando..."));
		 System.out.println(u3.getPostagens().size() == 0);
		 System.out.println(u3.getRepostagens().size() == 0);
		 u3.newPostagem("Fui ao banheiro");
		 u.getPostagem(u3, 0).dislike(u);
		 u2.getPostagem(u3, 0).dislike(u2);
		 System.out.println(u3.getPostagem(0).getDislikes() == 2);
		 
	
		 
		 
		 
		 
		 
		 
		 
	}

}
