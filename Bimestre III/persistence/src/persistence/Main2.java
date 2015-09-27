package persistence;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		/*
		// AQUI ESTÁ A DIFERENÇA, é usado o MusicaDAO em vez de DAO<Musica>
		MusicaDAO<Musica> dao = new MusicaDAO();

		// estes testes básicos deve funcionar
		// esses códigos não podem ser alterados
		Musica m1 = new Musica("Legião Urbana", "Pais e Filhos", 1989, new Duracao(4, 39));
		Musica m2 = new Musica("Legião Urbana", "Será", 1985, new Duracao(2, 37));
		Musica m3 = new Musica("Os Paralamas do Sucesso", "Meu Erro", 1984, new Duracao(3, 15));
		Musica m4 = new Musica("Os Paralamas do Sucesso", "O Calibre", 2001, new Duracao(3, 24));
		Musica m5 = new Musica("Nenhum de Nós", "O Astronauta de Mármore", 1989, new Duracao(3, 16));
		// verificando os atributos
		System.out.println(m2.getArtista().equals("Legião Urbana"));
		System.out.println(m2.getTitulo().equals("Pais e Filhos"));
		System.out.println(m2.getCodigo() == 2);
		System.out.println(m2.getAno() == 1985);
		System.out.println(m2.getDuracao().equals(new Duracao(2, 37)));
		System.out.println(m2.getDuracao().toString().equals("2:37"));
		System.out.println(m2.getDuracao().getMinutos() == 2);
		System.out.println(m2.getDuracao().getSegundos() == 37);
		// persistindo todos
		dao.save(m1); dao.save(m2); dao.save(m3); dao.save(m4); dao.save(m5);

		// testes específicos
		Musica m = null;
		// findByTitulo
		m = dao.findByTitulo("Será");
		System.out.println(m.equals(m2));
		m = dao.findByTitulo("Meu Erro");
		System.out.println(m.getArtista().equals("Os Paralamas do Sucesso"));
		System.out.println(m.equals(m3));
		// findByAno
		ArrayList<Musica> todas1989 = dao.findAllByAno(1989);
		System.out.println(todas1989.size() == 2);
		System.out.println(todas1989.get(0).equals(m1));
		System.out.println(todas1989.get(1).equals(m5));
		// findAllByArtista
		ArrayList<Musica> todasLegiao = dao.findAllByArtista("Legião Urbana");
		System.out.println(todasLegiao.size() == 2);
		System.out.println(todasLegiao.get(0).equals(m1));
		System.out.println(todasLegiao.get(1).equals(m2));
		// findAllBetweenAno
		ArrayList<Musica> todasEntre85e89 dao.findAllBetweenAno(1985, 1989);
		System.out.println(todasEntre85e89.size() == 3);
		System.out.println(todasEntre85e89.get(0).equals(m1));
		System.out.println(todasEntre85e89.get(1).equals(m2));
		System.out.println(todasEntre85e89.get(2).equals(m3));
		// deleteAll
		dao.deleteAll();
		System.out.println(dao.findAll().isEmpty() == true);
		System.out.println(dao.findAll().size() == 0);
*/
	}

}
