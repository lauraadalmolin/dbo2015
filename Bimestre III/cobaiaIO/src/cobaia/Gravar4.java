package cobaia;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class Gravar4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception  {
	
		//banco.csv 
		File alunos = new File("alunos.csv");
		// Comma Separated Values
		// Ex.:
		// 11030226, Ana Flávia, Moraes, 07/02/1999
				
		FileWriter writer = new FileWriter(alunos, true);
		
		Aluno a = new Aluno();
		a.setId(11030226);
		a.setNome("Ana Flávia");
		a.setSobrenome("Moraes");
		a.setDataNascimento(new Date("07/02/1999"));
			
		writer.append(a.toCSV()+ "\n");
		
		Aluno a2 = new Aluno();
		a2.setId(11030235);
		a2.setNome("Laura");
		a2.setSobrenome("Dalmolin");
		a2.setDataNascimento(new Date("09/11/1999"));
		
		writer.append(a2.toCSV()+ "\n");
		
		writer.flush();
		writer.close();
		System.out.println("Ok");
	}

}
