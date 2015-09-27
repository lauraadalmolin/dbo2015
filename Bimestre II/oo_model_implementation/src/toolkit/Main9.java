package toolkit;

public class Main9 {

	public static void main(String[] args) {
		
		// CLASSE == TIPO
		// SUPERCLASSE == SUPERTIPO
		// SUBCLASS == SUBTIPO
		// ANIMAL -> MAMÍFERO -> FELINO -> GATO
		
		// EM JAVA: SUPERTIPO DE TODOS!
		// OBJECT 
		
		Object i = "ifrs";
			
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Object);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof String);
		System.out.println(i instanceof System);
		
		Object n1 = 9;
		if (get() instanceof Integer)
			System.out.println((Integer)n1 + (Integer)get());
		else 
			System.out.println("Nao e inteiro");
		
		// POLIMORFISMO PARAMÉTRICO
		// TIPO PARAMETRIZADO
		
		List<Integer> lista = new List<Integer>();
		lista.append(5);
		lista.append(6);
				
		System.out.println(lista.get(0) + lista.get(1));
			
	}
	
	public static Object get() {
		return "asdasd";
	}
}
