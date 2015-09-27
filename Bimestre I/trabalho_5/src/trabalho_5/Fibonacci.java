package trabalho_5;

public class Fibonacci {
	
	private int value;
	private int scnd;
	private int frst;
	private int n_next = 0;

	public Fibonacci (int n) {
		this.under(n);
	}

	public Fibonacci () {
		value = 0;
		scnd = 0;
		frst = 1;
	}

	public int value () {
		return value;
	}

	public String toString () {
		return value + "";
	}

	public int next () {
		
		value = scnd + frst;
        frst = scnd;
        scnd = value;
       	n_next++;

       	return value;

    }
	
	public int previous () {
		n_next--;
		frst = 1;
		scnd = 0;
		value = 0;
		for (int i = 0; i < n_next; i++) {
            value = scnd + frst;
            frst = scnd;
            scnd = value;
        }
        return value;
	}

	public int previous (int n) {
		if (n < 0) return value;
		n_next -= n;
		frst = 1;
		scnd = 0;
		value = 0;
		if (n_next < 0) {
			n_next = 0;
			return value;
		}
		for (int i = 0; i < n_next; i++) {
            value = scnd + frst;
            frst = scnd;
            scnd = value;
        }
        return value;
	}

	public int next (int n) {
		if (n < 0) return value;
		n_next += n;
		for (int i = 0; i < n_next; i++) {
			this.next();
			n_next--;
		}
		return value;

    }

    public void reset () {
    	value = 0;
    	frst = 1;
    	scnd = 0;
    }

    public boolean equals (Fibonacci n) {
    	return this.value == n.value;
    }

 	public int near (int n) {
 		value = 0;
 		frst = 1;
 		scnd = 0;
 		int antes = 0, depois = 0;
 		for (int i = 0;; i++) {
 			this.next();
 			n_next--;
 			if (value <= n && value >= antes) antes = value;
 			if (value >= n) {
 				depois = value;
 				break;
 			}
 		}
 		int int_antesn = n - antes;
 		int int_depoisn = depois - n;
 		if (int_depoisn == int_antesn)  {
 			value = antes;
 			return antes;
 		}
 		if (int_depoisn > int_antesn) {
 			value = antes;
 			return antes;
 		}
 		value = depois;
 		return depois;
 	}

 	public int under (int n) {
 		value = 0;
 		frst = 1;
 		scnd = 0;
 		int n2 = 0;
 		for (int i = 0; ; i++) {
 			this.next();
 			if (value <= n) n2 = value;
 			if (value > n) break; 
 		}
 		value = n2;
 		return n2;
 	}

 	public int above (int n) {
 		value = 0;
 		frst = 1;
 		scnd = 0;
 		int n2 = 0;
 		for (int i = 0; ; i++) {
 			this.next();
 			if (value > n) break;
 		}

 		return value; 
 	}

 	public boolean greater (Fibonacci n) {
 		return value > n.value;
 	}

 	public boolean less (Fibonacci n) {
 		return value < n.value;
 	}
}

