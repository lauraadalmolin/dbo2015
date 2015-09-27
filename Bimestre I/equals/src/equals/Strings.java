package equals;

public class Strings {

	public static boolean eq (String a, String b) {
		if (a == null && b == null) return true;
		if (a == null || b == null) return false;

		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		if (aChar.length != bChar.length) return false;
		for (int i = 0; i < aChar.length; i++) {
			if (aChar[i] != bChar[i]) return false;
		}
	return true;
	}

}
