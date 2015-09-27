package persistence;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
					// Persistência: dados persistidos (não temporário)
				// Gravado e Lido independente da execução do programa
				
				// Padrão de Arquitetura chamado Data Access Object (DAO)
				// Modelo (objeto de negócio, ex.: Aluno, Pedido, Livro, ...)
				
				DAO<Musica> dao = new MusicaDAO();
				
				Musica f1 = new Musica();
				f1.setNumero(1);
				f1.setNome("Stairway to heaven");
				f1.setAndamento("Lenta");
				f1.setAno(1990);
				f1.setBanda("Led Zeppelin");
				
				Musica f2 = new Musica();
				f2.setNumero(2);
				f2.setNome("Let it Be");
				f2.setAndamento("Lenta");
				f2.setAno(1980);
				f2.setBanda("The Beatles");
				
				Musica f3 = new Musica();
				f3.setNumero(3);
				f3.setNome("Champagne Supernova");
				f3.setAndamento("Embalada");
				f3.setAno(1990);
				f3.setBanda("Oasis");
				
				Musica f4 = new Musica();
				f4.setNumero(4);
				f4.setNome("Sleep like a baby tonight");
				f4.setAndamento("Lenta");
				f4.setAno(2013);
				f4.setBanda("U2");
				
				Musica f5 = new Musica();
				f5.setNumero(5);
				f5.setNome("Little Wonders");
				f5.setAndamento("Lenta");
				f5.setAno(1990);
				f5.setBanda("Meet the Robinsons");
				
				Musica f6 = new Musica();
				f6.setNumero(6);
				f6.setNome("Hotel California");
			
				
				Musica f7 = new Musica();
				f7.setNumero(1);
				f7.setNome("Blackbird");
					
				
				dao.store(f1);
				dao.store(f2);
				dao.store(f3);
				dao.store(f4);
				dao.store(f5);
				dao.store(f6);
				dao.store(f7); // este deve falhar
				
//				dao.delete(f2);
//				dao.delete(f4);
//				dao.delete(f6);
				
				
				Musica a = dao.load(3);
				System.out.println(a != null);
				System.out.println(a.getNumero() == 3);
				System.out.println(a.getNome().equals("Champagne Supernova"));
				System.out.println(a.getAndamento().equals("Embalada"));
				System.out.println(a.getAno() == 1990);
				System.out.println();
				Musica b = dao.load(11); // número não encontrado: NULL
				System.out.println(b == null);
				
				Musica c = dao.load(1);
				System.out.println(c.equals(f1));
				
				System.out.println();
				
				dao.delete(f1);
				Musica d = dao.load(1);
				System.out.println(d);
				
				ArrayList<Musica> todos = dao.list();
				System.out.println(todos.size() == 5);
				System.out.println(todos.get(0).getNome().equals("Let it Be"));
				
				todos.get(0).setAndamento("Moderada");
				dao.update(todos.get(0));
				
				Musica e = dao.load(2);
				System.out.println(e.getNome().equals("Let it Be"));
				System.out.println(e.getAndamento().equals("Moderada"));
				
				
		

	}

}
