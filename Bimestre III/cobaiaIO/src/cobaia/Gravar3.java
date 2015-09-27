package cobaia;

import java.io.*;

public class Gravar3 {
	
	public static void main(String[] args) throws IOException {
		
		//banco.csv 
		File banco = new File("banco.csv");
		
		FileWriter writer = new FileWriter(banco, true);
		
		//writer.append("Laura Dalmolin\n");
		//writer.append("Laura Gomes\n");
		
		//writer.append("Beatriz da Costa\n");
		//writer.append("Yuri Garcia\n");
		
		
		
		writer.close();
		
		System.out.println("Ok");
		
	}
}
