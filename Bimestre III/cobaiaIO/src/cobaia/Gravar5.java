package cobaia;

import java.io.*;

public class Gravar5 {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("professores");
		if ( ! dir.exists()) { 
			dir.mkdir(); // make directory;
		}
		
		Professor p = new Professor();
		//p.setId(1810497);
		//p.setNome("Marcio");
		p.setId(23993);
		p.setNome("Stefan");
		
		File file = new File("professores/" + p.getId() + ".csv");
		
		FileWriter writer = new FileWriter(file);
		
		writer.write(p.toCSV());
		
		writer.flush();
		writer.close();
		
	}

}
