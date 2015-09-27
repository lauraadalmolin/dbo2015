package trabalho_5;

public class Main1 {
	
	public static void main(String[] args) {
		
		int samples[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584};

		System.out.println("// 1ra parte 0.2 pt ---------------------------------");
		Fibonacci fib1 = new Fibonacci();
		System.out.println(fib1.value() == 0);
		System.out.println(fib1.toString().equals("0"));
		fib1.next();
		System.out.println(fib1.value() == 1);
		fib1.next();
		System.out.println(fib1.value() == 1);
		fib1.next();
		System.out.println(fib1.value() == 2);
		fib1.next();
		System.out.println(fib1.value() == 3);
		fib1.next();
		System.out.println(fib1.value() == 5);
		fib1.next();
		System.out.println(fib1.value() == 8);
		fib1.next();
		System.out.println(fib1.value() == 13);
		System.out.println(fib1.toString().equals("13"));


		System.out.println("// 2da parte 0.5 pt ---------------------------------");
		fib1.previous();
		System.out.println(fib1.value() == 8);
		fib1.previous();
		System.out.println(fib1.value() == 5);
		System.out.println(fib1.value() == 5);
		fib1.previous(5);
		System.out.println(fib1.value() == 0);
		fib1.previous();
		System.out.println(fib1.value() == 0);
		fib1.previous(50);
		System.out.println(fib1.value() == 0);
		fib1.next(10);
		System.out.println(fib1.value() == 55);
		fib1.previous(-3);
		System.out.println(fib1.value() == 55);
		fib1.next(-3);
		System.out.println(fib1.value() == 55);
		

		fib1.reset();
		System.out.println(fib1.value() == 0);

		Fibonacci fib2 = new Fibonacci();
		for (int sample : samples) {
		    System.out.println(fib2.value() == sample);
		    fib2.next();
		}

		Fibonacci fib3 = new Fibonacci();
		fib3.next(13);
		System.out.println(fib3.value() == 233);

		Fibonacci fib4 = new Fibonacci();
		fib4.next(13);

		System.out.println(fib4.equals(fib3) == true);
		System.out.println(fib4.equals(fib2) == false);

		fib4.near(10);

		System.out.println(fib4.value() == 8);
		fib4.near(20);
		System.out.println(fib4.value() == 21);
		fib4.near(300);
		System.out.println(fib4.value() == 233);
		fib4.near(4);
		System.out.println(fib4.value() == 3);
		fib4.near(89);
		System.out.println(fib4.value() == 89);
		fib4.under(1000);
		System.out.println(fib4.value() == 987);
		fib4.above(1000);
		System.out.println(fib4.value() == 1597);

		//construtor == under
		
		Fibonacci fib5 = new Fibonacci(300);
		System.out.println(fib5.value() == 233);
		Fibonacci fib6 = new Fibonacci(20);
		System.out.println(fib6.value() == 13);

		System.out.println(fib5.greater(fib6) == true);
		System.out.println(fib5.less(fib6) == false);
		System.out.println(fib5.less(fib5) == false);
		System.out.println(fib5.greater(fib5) == false);
		System.out.println(fib5.equals(fib5) == true);
		
	}
}