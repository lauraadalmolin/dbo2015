package trabalho_5;

public class Main3 {
	
	public static void main(String[] args) {
			
			System.out.println("// 1ra parte 0.1 pt ---------------------------------");
			// 6.7 em dois inteiros
			Nota n1 = new Nota(6, 7);
			System.out.println(n1.toString().equals("6.7"));
			System.out.println(n1.toDouble() == 6.7);
			Nota n2 = new Nota(8, 7);
			System.out.println(n2.toString().equals("8.7"));
			System.out.println(n2.toDouble() == 8.7);
			Nota n3 = new Nota(9, 1);
			System.out.println(n3.toString().equals("9.1"));
			System.out.println(n3.toDouble() == 9.1);
			Nota n4 = new Nota(4, 5);
			System.out.println(n4.toString().equals("4.5"));
			System.out.println(n4.toDouble() == 4.5);

			Nota n5 = new Nota(4, 5);

			System.out.println(n4.equals(n5)  == true);
			System.out.println(n5.equals(n4)  == true);
			System.out.println(n5.equals(n3)  == false);
			// n5 > n4?
			System.out.println(n5.greater(n4)  == false);
			// n5 < n4?
			System.out.println(n5.less(n4)  == false);
			System.out.println(n1.greater(n5)  == true);
			System.out.println(n1.greater(n2)  == false);

			Nota n6 = new Nota(3);
			System.out.println(n6.toString().equals("3.0"));

			// padrão zero
			Nota n7 = new Nota();
			System.out.println(n7.toString().equals("0.0"));


			System.out.println("// 2da parte 0.6 pt ---------------------------------");
			Disciplina d = new Disciplina("DBO");
			d.nota(1, n1);
			// T:Total (somatório das notas dos 4 bimestres)
			// M:Média
			// E:Nota do exame
			// F:Média Final (inclui o exame)
			//System.out.println(d.toString().equals("DBO 1:6.7 2:0.0 3:0.0 4:0.0 T:6.7 M:1.7 E:0.0 F:0.0 REP"));

			// notas são instâncias de Nota
			// (bimestre, nota)
			d.nota(2, n2);
			d.nota(3, n3);
			d.nota(4, n4);

			// testes de nota
			System.out.println(d.nota(1).equals(n1));
			System.out.println(d.nota(1).toDouble() == 6.7);
			System.out.println(d.nota(1).toString().equals("6.7"));
			System.out.println(d.nota(2).equals(n2));
			System.out.println(d.nota(3).equals(n3));
			System.out.println(d.nota(4).equals(n4));
			/*
			System.out.println(d.pontos().equals(new Nota(29)));
			System.out.println(d.pontos().toDouble() == 29.0);
			System.out.println(d.media().equals(new Nota(7, 3))); // arredondamento de banqueiro (0.5+ ^)
			System.out.println(d.media().toDouble() == 7.3);
			System.out.println(d.notaNecessariaExame().toDouble() == 0.0);
			// aprovado por média
			System.out.println(d.toString().equals("DBO 1:6.7 2:8.7 3:9.1 4:4.5 T:29.0 M:7.3 E:0.0 F:0.0 APR"));
			System.out.println(d.estaAprovado() == true);
			System.out.println(d.estaReprovado() == false);

			d.nota(3, new Nota(5.5));
			System.out.println(d.pontos().equals(new Nota(25, 4)));
			System.out.println(d.pontos().toDouble() == 25.4);
			System.out.println(d.media().equals(new Nota(6, 4)));
			System.out.println(d.media().toDouble() == 6.4);
			System.out.println(d.estaAprovado() == false);
			System.out.println(d.estaReprovado() == true);
			// ((notas * 6 / 4) + (exame * 4)) / 10.0 >= 5.0
			System.out.println(d.notaNecessariaExame().equals(new Nota(3)));
			System.out.println(d.notaNecessariaExame().toDouble() == 3.0);
			// sem exame reprovado temporariamente
			System.out.println(d.toString().equals("DBO 1:6.7 2:8.7 3:5.5 4:4.5 T:25.4 M:6.4 E:0.0 F:0.0 REP"));

			d.exame(new Nota(2, 5));
			System.out.println(d.pontos().equals(new Nota(25, 4)));
			System.out.println(d.pontos().toDouble() == 25.4);
			System.out.println(d.media().equals(new Nota(6, 4)));
			System.out.println(d.media().toDouble() == 6.4);
			System.out.println(d.notaNecessariaExame().toDouble() == 3.0);
			System.out.println(d.exame().toDouble() == 2.5);
			System.out.println(d.final().equals(new Nota(4, 8)));
			System.out.println(d.final().toDouble() == 4.8);
			// média final < 5 então reprovado
			System.out.println(d.toString().equals("DBO 1:6.7 2:8.7 3:5.5 4:4.5 T:25.4 M:6.4 E:2.5 F:4.8 REP"));
			System.out.println(d.estaAprovado() == false);
			System.out.println(d.estaReprovado() == true);

			d.exame(new Nota(4));
			System.out.println(d.pontos().toDouble() == 25.4);
			System.out.println(d.media().toDouble() == 6.4);
			System.out.println(d.notaNecessariaExame().toDouble() == 3.0);
			System.out.println(d.estaAprovado() == false);
			System.out.println(d.estaReprovado() == true);
			System.out.println(d.exame().toDouble() == 4.0);
			System.out.println(d.final().toDouble() == 5.4);
			// média final > 5 então aprovado
			System.out.println(d.toString().equals("DBO 1:6.7 2:8.7 3:5.5 4:4.5 T:25.4 M:6.4 E:4.0 F:5.4 APR"));
			System.out.println(d.estaAprovado() == true);
			System.out.println(d.estaReprovado() == false);

			d = new Disciplina("Matematica II");
			Nota n = new Nota(7);
			d.nota(1, n);
			d.nota(2, n);
			d.nota(3, n);
			d.nota(4, n);
			System.out.println(d.toString().equals("Matematica II 1:7.0 2:7.0 3:7.0 4:7.0 T:28.0 M:7.0 E:0.0 F:0.0 APR"));
			*/
		}	
}
