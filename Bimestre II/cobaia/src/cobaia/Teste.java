package cobaia;

public class Teste {

	public static void main(String[] args) {
		
		String[] nomes = {"Thaylles", "Erick", "Yuri", "Caroline"};
		
		int i = 0;
		print(i, nomes);
		
		//quebra(i);
		
		int r = multiplica(4, 3);
		System.out.println(r);
		
		}
		
		// RECURSIVIDADE: (método que chama a si)
		private static void print(int i, String[] nomes) {
			if (i < nomes.length) {
			System.out.println(nomes[i]);
			print(i+1, nomes);
			}
			
		}
		
		private static void quebra(int i) {
			System.out.println(i);
			if (i < 100) quebra(i+1);
		}
		
		private static int multiplica (int a, int b) {
			if (b == 0) return 0;
			return a + multiplica (a, b -1);
		}

}
