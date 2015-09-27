package persistencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Persist�ncia: dados persistidos (n�o tempor�rio)
		// Gravado e Lido independente da execu��o do programa
		
		// Padr�o de Arquitetura chamado Data Access Object (DAO)
		// Modelo (objeto de neg�cio, ex.: Aluno, Pedido, Livro, ...)
		
		DAO<Filme> dao = new FilmeDAO();
		
		Filme f1 = new Filme();
		f1.setNumero(1);
		f1.setTitulo("O Guia do Mochileiro das Gal�xias");
		f1.setGenero("Sci-fi");
		f1.setAno(2005);
		
		Filme f2 = new Filme();
		f2.setNumero(2);
		f2.setTitulo("Avatar");
		f2.setGenero("Fic��o");
		f2.setAno(2009);
		
		Filme f3 = new Filme();
		f3.setNumero(3);
		f3.setTitulo("Exterminador do Futuro: G�nesis");
		f3.setGenero("A��o");
		f3.setAno(2015);
		
		Filme f4 = new Filme();
		f4.setNumero(4);
		f4.setTitulo("A Entidade");
		f4.setGenero("Terror");
		f4.setAno(2012);
		
		Filme f5 = new Filme();
		f5.setNumero(5);
		f5.setTitulo("TED 2");
		f5.setGenero("Com�dia");
		f5.setAno(2015);
		
		Filme f6 = new Filme();
		f6.setNumero(6);
		f6.setTitulo("Star Wars: Epis�dio III a Vingan�a dos Sith");
		
		Filme f7 = new Filme();
		f7.setNumero(5);
		f7.setTitulo("N�o deve ser salvo");			
		
		dao.save(f1);
		dao.save(f2);
		dao.save(f3);
		dao.save(f4);
		dao.save(f5);
		dao.save(f6);
		dao.save(f7); // este deve falhar
		
//		dao.delete(f2);
//		dao.delete(f4);
//		dao.delete(f6);
		
		
		Filme a = dao.load(3);
		System.out.println(a != null);
		System.out.println(a.getNumero() == 3);
		System.out.println(a.getTitulo().equals("Exterminador do Futuro: G�nesis"));
		System.out.println(a.getGenero().equals("A��o"));
		System.out.println(a.getAno() == 2015);
		
		Filme b = dao.load(11); // n�mero n�o encontrado: NULL
		System.out.println(b == null);
		
		Filme c = dao.load(1);
		System.out.println(c.equals(f1));
		System.out.println();
		dao.delete(c);
		Filme d = dao.load(1);
		System.out.println(d == null);
		
		ArrayList<Filme> todos = dao.findAll();
		System.out.println(todos.size() == 5);
		System.out.println(todos.get(0).getTitulo().equals("Avatar"));
		
		todos.get(0).setGenero("A��o");
		dao.update(todos.get(0));
		
		Filme e = dao.load(2);
		System.out.println(e.getTitulo().equals("Avatar"));
		System.out.println(e.getGenero().equals("A��o"));
		
		
	}

}
