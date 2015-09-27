package toolkit;

public class Random implements IRandom {
	
	private long semente;
	private long ret;
	
	public Random() {
		semente = 1434323064396L;
		String s = semente + "";
		char[] a = s.toCharArray();
		String b = "";
		for (int i = a.length - 12; i < a.length; i++) {
			if (a[i] == '0') b =  b + 2;
			else b =  b + a[i];
		}
		semente = Strings2.toInt(b);
	}
	
	
	public void newRandom() {
		semente = 1434323064396L;
		String s = semente + "";
		char[] a = s.toCharArray();
		String b = "";
		for (int i = a.length - 12; i < a.length; i++) {
			if (a[i] == '0') b =  b + 2;
			else b =  b + a[i];
		}
		semente = Strings2.toInt(b);
		
	}
	
	public Random (long s) {
		String a = s + "";
		char[] b = a.toCharArray();
		if (b.length < 12) {
			char[] seed = new char[12];
			int i;
			for (i = 0; i < b.length; i++) seed[i] = b[i];
			for (; i < 12; i++) seed[i] = 7;
		}
		else {
			if (b.length >= 12) {
				String x = "";
				for (int i = 0; i < 12; i++) {
					x =  x + b[i];
				}
				semente = Strings2.toInt(x);
			}
		}
	}
	
	/**
     * Gera o próximo número aleatório.
     * O valor não é alterado até esse método ser invocado.
     */
	
    public void next() {
    	if (semente > 1000000000000l) {
    		for (; semente > 1000000000000l; semente/=10);
    	}
    	if (semente == 0) this.newRandom(); 
    	String a = semente + "";
    	char[] b = a.toCharArray();
    	char[] seed = new char[6];
    	for (int i = 3, j = 0; j < 6; i++) {
    		seed[j] = b[i];
    		j++;
    	}
    	String seed2 = new String(seed);
    	ret = Strings2.toInt(seed2) / 1000000;
    	seed = seed2.toCharArray();
    	for(int i = 0; i < 6; i++) if (seed[i] == '0') seed[i] = '2';
    	String seed3 = new String(seed);
    	long ret2 = Strings2.toInt(seed3)/1000000;
    	semente = ret2 * ret2;
    	    	
    }

    /**
     * Retorna o último valor gerado.
     * Este método pode ser chamado diversas vezes não
     * deverá ter seu valor alterado com exceção se next() for invocado.
     *
     * @return double número aleatório >= 0 e < 1
     */
    public double get() {
       	return ret / 1000000.0;
    }
	
	
}
