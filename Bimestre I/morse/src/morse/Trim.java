package morse;

// 	Criar os métodos trimLeft, trimRight e trim.
//  Lidar com casos que fogem do padrão.

public class Trim {
	
	public static String trimLeft (String x) {

		char[] a = x.toCharArray();
		int k = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] == ' ' || a[i] == '\r' || a[i] == '\n' || a[i] == '\t') { k++;
			} else { i = a.length + 1; }
		}
		char[] b = new char[a.length - k];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[k]; 
			k++;
		}
		String y = new String(b);
		return y;
	}

	public static String trimRight (String x) {
		char[] a = x.toCharArray();
		int k = a.length;
		for(int i = a.length - 1; i >= 0; i--) {
			if (a[i] == ' ' || a[i] == '\r' || a[i] == '\n' || a[i] == '\t') { k--;
			} else { i = 0; }
		}
		char[] b = new char[k];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i]; 
		}
		String y = new String(b);
		return y;
	}

	public static String trim (String x) {
		x = trimRight(x);
		x = trimLeft(x);
		return x;
	}


}




