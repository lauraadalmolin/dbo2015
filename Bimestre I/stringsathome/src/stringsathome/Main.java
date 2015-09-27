package stringsathome;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Strings.toInt("abc") == 0);
		System.out.println(Strings.toInt(" 3") == 3);
		System.out.println(Strings.toInt("a3") == 0);
		System.out.println(Strings.toInt("3a") == 0);
		System.out.println(Strings.toInt("3  ") == 3);
		System.out.println(Strings.toInt("3 5 ") == 0);
		System.out.println(Strings.toInt("76543") == 76543);
		System.out.println(Strings.toInt(" 76543") == 76543);
		System.out.println(Strings.toInt(" 76543   ") == 76543);
		System.out.println();
		System.out.println(Strings.fromInt(0).equals("0"));
		System.out.println(Strings.fromInt(1).equals("1"));
		System.out.println(Strings.fromInt(2).equals("2"));
		System.out.println(Strings.fromInt(3).equals("3"));
		System.out.println(Strings.fromInt(4).equals("4"));
		System.out.println(Strings.fromInt(5).equals("5"));
		System.out.println(Strings.fromInt(6).equals("6"));
		System.out.println(Strings.fromInt(7).equals("7"));
		System.out.println(Strings.fromInt(8).equals("8"));
		System.out.println(Strings.fromInt(9).equals("9"));
		System.out.println(Strings.fromInt(99981).equals("99981"));
		System.out.println(Strings.fromInt(78928371).equals("78928371"));
		System.out.println(Strings.fromInt(Integer.MAX_VALUE).equals("2147483647"));
		

	}
}