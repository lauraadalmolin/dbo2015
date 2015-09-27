package cobaia;

import java.io.*;
import java.util.*;

public class Ler2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File alunos = new File("alunos.csv");
		// ctrl+ shift + o = import automático
		Scanner scan = new Scanner(alunos);
		ArrayList<Aluno> lista = new ArrayList();
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			Aluno a = new Aluno();
			a.fromCSV(line);
			lista.add(a);
			// criar um aluno com a line
		}
		System.out.println(lista);
		scan.close();
	}
}
