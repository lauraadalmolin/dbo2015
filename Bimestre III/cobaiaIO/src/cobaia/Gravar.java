package cobaia;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class Gravar {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// caminho absoluto (fixo)
		// caminho relativo (conta a partir do local do programa)
		
		//try {
			//URI uri = Gravar.class.getResource(".").toURI();
			//System.out.println(uri);
			
		//} catch (URISyntaxException e) {
			//e.printStackTrace();
		//}
		
		File f = new File("d:/dbo/meuarquivo.txt");
		// System.out == imprime no console/terminal
		System.out.println("alguma coisa");
	
		PrintStream fileOut = 
				new PrintStream(f);
				// new PrintStream("d:/dbo/meuarquivo.txt")
		
		// sobrepõe o arquivo
		fileOut.println("Outra coisa");
		fileOut.println();
		fileOut.println();
		fileOut.println("Mais uma coisa");
		
		
		fileOut.flush();
		
		fileOut.close();
		
		
		
	}

}