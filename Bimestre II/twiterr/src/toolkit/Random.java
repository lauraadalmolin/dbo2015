package toolkit;

public class Random{
	
	private long valor;
	private double n;
	
	public Random(){
		valor = System.currentTimeMillis()/10000000;
		n = 0;
	}
	public Random(int semente){
		valor = semente;
		n  = 0;
	}
	public void next(){
		if(valor == 0.0){
			//System.out.println("Random.next()");
			double n2 = n;
			new Random();
			n = n2;
		}
		int num_casas = 1;
		valor *= valor;
		for (long i = 10; i < valor;i = i * 10){ 
			num_casas++;
		}
		if (num_casas % 2 != 0){
			valor /= 10;
			num_casas--;
		}
		for (int i = 0; i < (num_casas-6)/2; i++) valor /= 10;
		valor %= 1000000;
		n = 0.000001 * valor;
	}
	public double get(){
		return n;
	}
}
