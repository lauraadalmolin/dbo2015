package cobaia;

import java.io.*;

public class Apagar {
	
	public static void main(String[] args) {
		
		File arq = new File("professores/1810497.csv");
		
		if (arq.exists()) {
			arq.delete();
			System.out.println("Ok");
		} else {
			System.out.println("Arquivo não existe");
		}
		
		
	}

}
