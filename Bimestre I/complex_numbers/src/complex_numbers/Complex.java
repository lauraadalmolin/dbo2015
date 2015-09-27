package complex_numbers;

public class Complex {
	
	public final double real;
	public final double imaginary;

	public Complex (double a, double b) {
		this.real = a;
		this.imaginary = b;
	}

	public Complex (double a) {
		this.imaginary = a;
		this.real = 0;
	}

	public Complex () {
		this.imaginary = 0;
		this.real = 0;
	}

	public Complex sum (Complex number) {
		return new Complex (this.real + number.real, this.imaginary + number.imaginary);
	} 

	public Complex conjugate () {
		return new Complex (this.real, this.imaginary * -1);
	}

	public Complex minus (Complex number) {
		return new Complex (this.real - number.real, this.imaginary - number.imaginary);
	}

	public Complex times (Complex number) {
		double mr = this.real * number.real + (this.imaginary * number.imaginary * -1);
		double mi = this.imaginary * number.real + this.real * number.imaginary;
		return new Complex (mr, mi);
	}

	public String over (Complex number) {
		if (number.real == 0 && number.imaginary == 0) throw new IllegalArgumentException();
		Complex n = this.times(number.conjugate());
		Complex d = number.times(number.conjugate());
		return new String ("(" + n.toString() + ")" + "/" + "(" + d.toString() + ")");
	}

	public String toString () {
		if (real == 0 && imaginary == 0) return "0";
		if (real == 0) return imaginary + "i";
		if (imaginary == 0) return real + "";
		return real + " " + ((imaginary < 0) ? "- " + imaginary*-1 : "+ " + imaginary) + "i";
	}

	public boolean isPure () {
		if (real == 0 && imaginary != 0) return true;
		return false;
	}

	public boolean isReal () {
		if (imaginary == 0) return true;
		return false;
	}

}