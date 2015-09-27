package trabalho_5;

public class Main2 {
	
	public static void main(String[] args) {
		
		System.out.println("// 1ra parte 0.1 pt ---------------------------------");
		System.out.println(Factorial.of(11) == 39916800);
		System.out.println(Factorial.of(6) == 720);
		System.out.println(Factorial.of(8) == 40320);

		System.out.println("// 2da parte 0.5 pt ---------------------------------");
		Factorial fact = new Factorial(5);
		System.out.println(fact.number() == 0);
		System.out.println(fact.value() == 1);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 1);
		System.out.println(fact.value() == 1);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 2);
		System.out.println(fact.value() == 2);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 3);
		System.out.println(fact.value() == 6);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 4);
		System.out.println(fact.value() == 24);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 5);
		System.out.println(fact.value() == 120);
		System.out.println(fact.next() == false);
		System.out.println(fact.number() == 5);
		System.out.println(fact.value() == 120);
		fact.begin();
		System.out.println(fact.number() == 0);
		System.out.println(fact.value() == 1);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 1);
		System.out.println(fact.value() == 1);
		System.out.println(fact.next() == true);
		System.out.println(fact.number() == 2);
		System.out.println(fact.value() == 2);
		fact.end();
		System.out.println(fact.number() == 5);
		System.out.println(fact.value() == 120);
		System.out.println(fact.next() == false);

		Factorial fact2 = new Factorial(14);
		while (fact2.next());
		System.out.println(fact2.number() == 14);
		System.out.println(fact2.value() == 87178291200L);

	}
}