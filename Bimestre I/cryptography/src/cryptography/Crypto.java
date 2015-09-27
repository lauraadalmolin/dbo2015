package cryptography;

public class Crypto {
	
	public final String key;
	public final int code;

	public Crypto (String k) {
	if (this.test(k)) key = k;
	else throw new IllegalArgumentException("Entrada invalida. Por favor tente novamente com outra entrada.");
	code = this.n();
	}

	public boolean test (String k) {
		char[] a = k.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 32 || a[i] > 126) return false;
		}
		return true;
	}

	public int n () {
		int x = 0;
		char[] a = key.toCharArray();
		for (int i = 0; i < a.length; i++) {
			x = x + a[i];			
		}
		x = x % (126 - 32);
		return x;
	}

	public String encrypt (String k) {
		
		char[] a = k.toCharArray();
		char[] r = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 126 == 0) r[i] = 32;
			else r[i] = a[i]; r[i] +=code;
		}
		return new String(r);
	}

	public String decrypt (String k) {
		char[] a = k.toCharArray();
		char[] r = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 32) r[i] = 126;
			else r[i] = a[i]; r[i]-=code;
		}
		return new String(r);
	}

	public String digest (String k) {
		char[] r = new char[64];
		char[] a = k.toCharArray();
		for (int i = 0; i < a.length && i < 64; i++) {
			r[i] = a[i];
			r[i] += code;
			r[i] %= 94;
		}
		int n = a[a.length-1];
		for (int i = a.length-1; i < 64; i++) {
			int n2 = n + code;
			r[i] += n2;
			r[i] %= 94;
		}
		return new String(r);
	}

	public String toString(Crypto c) {
		return key;
	}

}