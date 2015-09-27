package toolkit;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classe == tipo
		//superclasse == supertipo
		//subclass == subtipo
		//Anima -> mamifero -> felino -> gato
		
		//em java supertipo de todos
		//object 
		
		Object i = "0";
		
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Object);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof String);
		System.out.println(i instanceof System);
		
		Object n1 = 0;
		Object n2 = 12;
		
		if(get() instanceof Integer)
			System.out.println((Integer)n1 + (Integer)get());
		else System.out.println("get nao e inteiro");
		//polimorfismo paramétrico
		List<Integer> lista = new List();
		lista.append(1);
		lista.append(4);
		//lista.append("sjsjsjss");
		System.out.println((Integer)lista.get(0) + (Integer)lista.get(1));
		
		
	}
	public static Object get(){
		return "i";
	}

}
