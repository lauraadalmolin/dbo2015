package cobaia;
import java.io.*;
import java.util.Scanner;

public class Ler {

	public static void main(String[] args) {
		
		File file = new File("d:/teste.txt");
		System.out.println(file.exists());
		
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não existe");
		}
		
		
	}
}
