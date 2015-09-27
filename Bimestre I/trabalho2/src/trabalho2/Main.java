package trabalho2;

public class Main {

	public static void main(String[] args) {
			
		System.out.println(Strings.reverse("dbo").equals("obd"));
		System.out.println(Strings.reverse("").equals(""));
		System.out.println(Strings.reverse(" ko").equals("ok "));
		System.out.println();
		System.out.println(Strings.count("dbo", 'd') == 1);
		System.out.println(Strings.count("dbo", 'h') == 0);
		System.out.println(Strings.count("desenvolvimento baseado em objetos", 'e') == 6);
		System.out.println(Strings.count("desenvolvimento baseado em objetos", ' ') == 3);
		System.out.println();
		System.out.println(Strings.hasChar("dbo", 'd') == true);
		System.out.println(Strings.hasChar("dbo", 'a') == false);
		System.out.println(Strings.hasChar("desenvolvimento baseado em objetos", ' ') == true);
		System.out.println(Strings.hasChar("desenvolvimento baseado em objetos", 'h') == false);
		System.out.println(Strings.hasChar("", 'h') == false);
		System.out.println();
		System.out.println(Strings.startsWith("dbo", "d") == true);
		System.out.println(Strings.startsWith("dbo", "b") == false);
		System.out.println(Strings.startsWith("dbo", "db") == true);
		System.out.println(Strings.startsWith("dbo", "dbo") == true);
		System.out.println(Strings.startsWith("dbo", "dboo") == false);
		System.out.println(Strings.startsWith("desenvolvimento", "desenv") == true);
		System.out.println();
		System.out.println(Strings.endsWith("dbo", "o") == true);
		System.out.println(Strings.endsWith("dbo", "b") == false);
		System.out.println(Strings.endsWith("dbo", "bo") == true);
		System.out.println(Strings.endsWith("dbo", "dbo") == true);
		System.out.println(Strings.endsWith("dbo", "ddbo") == false);
		System.out.println(Strings.endsWith("desenvolvimento", "mento") == true);
		System.out.println();
		System.out.println(Strings.toInt('a') == 0);
		System.out.println(Strings.toInt(' ') == 0);
		System.out.println(Strings.toInt(' ') == 0);
		System.out.println(Strings.toInt('0') == 0);
		System.out.println(Strings.toInt('1') == 1);
		System.out.println(Strings.toInt('2') == 2);
		System.out.println(Strings.toInt('3') == 3);
		System.out.println(Strings.toInt('4') == 4);
		System.out.println(Strings.toInt('5') == 5);
		System.out.println(Strings.toInt('6') == 6);
		System.out.println(Strings.toInt('7') == 7);
		System.out.println(Strings.toInt('8') == 8);
		System.out.println(Strings.toInt('9') == 9);
	
	}

}