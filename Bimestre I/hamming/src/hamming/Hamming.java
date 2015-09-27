package hamming;

public class Hamming {
	
	public static int distance (String x, String y) {

		int dist = 0;

		char[] a = x.toCharArray();
		char[] b = y.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) dist++;
		}

		return dist;
	}
}