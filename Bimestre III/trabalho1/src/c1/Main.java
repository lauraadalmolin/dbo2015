package c1;

public class Main {
	
	public static void main(String[] args) {
		
		boolean b1 = isNegative(1);
		boolean b2 = isNegative(0);
		boolean b3 = isNegative(-1);
		boolean b4 = isNegative(2147483647);
		boolean b5 = isNegative(-2147483648);
	
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
				
	}

	public static boolean isNegative(int i) {
		if(Math.max(i, 0) == i || i == 0) return false;
		return true;
	}

}
