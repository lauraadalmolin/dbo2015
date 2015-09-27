package bissexto;

public class Main {

	public static boolean bissexto (int n) {
		boolean b = false;
		if (n < 1582) throw new IllegalArgumentException("Invalid year! Please type a year greater than 1581.");
			if (n % 4 == 0) { 
				if (n % 100 != 0) b = true;
				if (n % 100 == 0 && n % 400 == 0) b = true; 
			}
		return b;
	}

	public static void main(String[] args) {
	
	System.out.println(bissexto(1996) == true);
	System.out.println(bissexto(1997) == false);
	System.out.println(bissexto(1998) == false);
	System.out.println(bissexto(1900) == false);
	System.out.println(bissexto(2400) == true);

	}
}