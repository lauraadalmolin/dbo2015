package secret;

public class Main {

	public static void main(String[] args) {
		
		Matrix a = new DenseMatrix(3, 3);
		Matrix b = new DenseMatrix(3, 3);
		
		Matrix c = a.times(b);
		
		System.out.println(c);

	}

}
