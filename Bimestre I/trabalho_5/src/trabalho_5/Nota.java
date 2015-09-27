package trabalho_5;

public class Nota {
	
	public int i;
	public int d;


	public Nota () {
		this(0,0);
	}

	public Nota (int x) {
		this(x, 0);
	}

	public Nota (int x, int y) {
		i = x;
		d = y;
	}

	public String toString() {
		return i + "." + d;
	}

	public double toDouble () {
		double r = i + (double)d/10;
		return r;
	}

	public boolean equals (Nota n) {
		return (i == n.i && d == n.d);
	}

	public boolean greater (Nota n) {
		if (i > n.i) return true;
		if (i == n.i && d > n.d) return true;
		return false;
	}

	public boolean less (Nota n) {
		if (i < n.i) return true;
		if (i == n.i && d < n.d) return true;
		return false;
	}
}	
