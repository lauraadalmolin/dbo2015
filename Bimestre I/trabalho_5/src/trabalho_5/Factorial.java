package trabalho_5;

public class Factorial {

	private long number;
	private long value;
	private final long max;
	private long c;

	public Factorial (int m) {
		max = m;
		number = 0;
		value = 1;
		c = 0;
	}

	public boolean next () {
		if (c < max) {
			number++;
			value *= number;
			c++;
			return true;
		}
		return false;
	}

	public long value () {
		return value; 
	}

	public long number () {
		return number;
	}

	public void begin () {
		c = 0;
		number = 0;
		value = 1;
	}

	public void end () {
		this.begin();
		for (int i = 0; i < max; i++) {
			this.next();
		}
	}

	public static long of (int n) {
		long res = 1;
		for (; n > 0; n--) {
			res *= n;
		}
		return res;
	}


}
