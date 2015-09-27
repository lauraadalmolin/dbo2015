package cobaia;

import java.io.File;
import java.util.Arrays;

public class Ler3 {
	
	public static void main(String[] args) {
		
		File dir = new File("professores");
		
		File[] arqs = dir.listFiles();
		
		System.out.println(Arrays.toString(arqs));
	}
	
}
