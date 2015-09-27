package persistence;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// usar a interface DAO da última aula disponível aqui:
		// https://github.com/marciojrtorres/dbo-2015/blob/master/persistencia/src/persistencia/DAO.java

		DAO<Musica> dao = new MusicaDAO();

		// esses códigos não podem ser alterados
		Musica m1 = new Musica("Legião Urbana", "Pais e Filhos", 1989, new Duracao(4, 39), 1);
		Musica m2 = new Musica("Legião Urbana", "Será", 1985, new Duracao(2, 37), 2);
		Musica m3 = new Musica("Os Paralamas do Sucesso", "Meu Erro", 1984, new Duracao(3, 15), 3);
		Musica m4 = new Musica("Os Paralamas do Sucesso", "O Calibre", 2001, new Duracao(3, 24), 4);
		Musica m5 = new Musica("Nenhum de Nós", "O Astronauta de Mármore", 1989, new Duracao(3, 16), 5);
		
		// verificando os atributos
		System.out.println(m2.getArtista().equals("Legião Urbana"));
		System.out.println(m2.getTitulo().equals("Será"));
		System.out.println(m2.getCodigo() == 2);
		System.out.println(m2.getAno() == 1985);
		System.out.println(m2.getDuracao().equals(new Duracao(2, 37)));
		System.out.println(m2.getDuracao().toString().equals("2:37"));
		System.out.println(m2.getDuracao().getMinutos() == 2);
		System.out.println(m2.getDuracao().getSegundos() == 37);
		
		// persistindo todos
		dao.save(m1);
		dao.save(m2);
		dao.save(m3); 
		dao.save(m4);
		dao.save(m5);
		
		// testando a leitura
		Musica m = dao.load(1);
		System.out.println(m.getArtista().equals(m1.getArtista()));
		System.out.println(m.equals(m1));
		
		m = dao.load(5);
		System.out.println(m.equals(m5));
		System.out.println(m.getDuracao().equals(new Duracao(3, 16)));
		
		m = dao.load(6);
		System.out.println(m == null);
		
		// testando a atualização
		m = dao.load(4);
		System.out.println(m.equals(m4));
		m.setAno(2002);
		dao.update(m);
		
		
		// testando a listagem
		ArrayList<Musica> todas = dao.findAll();
		System.out.println();
		System.out.println(todas.size() == 5);
		System.out.println(todas.get(0).equals(m1));
		System.out.println(todas.get(1).getDuracao().equals(m2.getDuracao()));
		System.out.println(todas.get(3).getTitulo().equals("O Calibre"));
		System.out.println(todas.get(3).getAno()); // verificando se atualizou
		
		// testando a exclusão
		dao.delete(dao.load(5));
		System.out.println(dao.findAll().size() == 4);
		System.out.println(dao.load(5) == null);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	


	}

}
