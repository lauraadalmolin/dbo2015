package intro;
// para compilar: via terminal/prompt
// na pasta do projeto (ex.: intro) digita:
// javac -d bin -cp bin src/intro/Main.java
// cp = class path
// d = destination
// para executar:
// java -cp bin intro.Main
//          pacote.Classe

public class Main {
	// main tab
	public static void main(String[] args) {
		// pl tab
		System.out.println("Live long and prosper.");

		int n = 45;
		boolean primo = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) { primo = false; } 	}

		if(primo) { System.out.println("Este numero e primo."); }
			else { System.out.println("Este numero nao e primo."); }
	}
}