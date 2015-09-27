package um_para_muitos;

public class Main {

	public static void main(String[] args) {
		
		Imovel i1 = new Imovel("Coronel Sampaio, 23345");
		Imovel i2 = new Imovel("Alfredo Huch, 97435");
		Imovel i3 = new Imovel("Val Porto, 36556");
		Imovel i4 = new Imovel("Camara, 2333212");

		Proprietario p1 = new Proprietario("Nelson Freitas");
		Proprietario p2 = new Proprietario("Manuel Almeida");
		Proprietario p3 = new Proprietario("Tereza Rodrigues");

		System.out.println('1');
		System.out.println(i1.getProprietario() == null);
		System.out.println('2');
		System.out.println(i2.getProprietario() == null);
		System.out.println('3');
		System.out.println(i3.getProprietario() == null);

		// o método imoveis devolve um vetor de Imovel (Imovel[])
		System.out.println(p1.imoveis().length == 0);

		p1.addImovel(i1);
		
		System.out.println('4');
		System.out.println(p1.imoveis().length == 1);
		System.out.println('5');
		System.out.println(p1.imoveis()[0].equals(i1));
		System.out.println('6');
		System.out.println(p1.imoveis(0).equals(i1));
		System.out.println('7');
		System.out.println(i1.getProprietario().equals(p1));

		p2.addImovel(i2);
		p2.addImovel(i3);
		
		System.out.println('8');
		System.out.println(p2.imoveis().length == 2);
		System.out.println('9');
		System.out.println(p2.imoveis()[0].equals(i2));
		System.out.println("10");
		System.out.println(p2.imoveis(1).equals(i3));
		System.out.println("11");
		System.out.println(p2.imoveis(2) == null);
		System.out.println("12");
		System.out.println(i2.getProprietario().equals(i3.getProprietario()));

		i4.setProprietario(p3);
		
		System.out.println("13");
		System.out.println(p3.imoveis().length == 1);
		System.out.println("14");
		System.out.println(p3.imoveis()[0].equals(i4));
		System.out.println("15");
		System.out.println(i4.getProprietario().equals(p3));

		i4.setProprietario(p2); // rejeitar
		//p2.addImovel(i4); // rejeitar

		p3.vendeImovelPara(0, p2);
		System.out.println("16");
		System.out.println(p3.imoveis().length == 0);
		System.out.println("17");
		System.out.println(p2.imoveis().length);
		Imovel[] a = p2.imoveis();
		for (int i = 0; i < a.length; i++) System.out.println(a[i]);
		System.out.println("18");
		System.out.println(p2.imoveis(2).equals(i4));
		System.out.println("19");
		System.out.println(i4.getProprietario().equals(p2));

		i1.vendePara(p2);
		System.out.println("20");
		System.out.println(p1.imoveis().length == 0);
		System.out.println("21");
		System.out.println(p2.imoveis().length == 4);
		System.out.println("22");
		System.out.println(p2.imoveis(3).equals(i1));
		System.out.println("23");
		System.out.println(i1.getProprietario().equals(p2));

	}

}
