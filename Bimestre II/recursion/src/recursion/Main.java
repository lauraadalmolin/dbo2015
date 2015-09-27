package recursion;

public class Main {

	public static void main(String[] args) {
		
		ListR list = new ListR(); // (R)ecursive

		System.out.println(list.count() == 0);
		System.out.println(list.empty() == true);
		System.out.println(list.get(0) == null);
		System.out.println(list.first() == null);
		System.out.println(list.last() == null);

		list.append("a");

		System.out.println(list.empty() == false);
		System.out.println(list.count() == 1);
		System.out.println(list.get(0).equals("a"));
		System.out.println(list.first().equals("a"));
		System.out.println(list.last().equals("a"));
		System.out.println(list.first().equals(list.last()));

		list.append(2);
		list.append("c");
		list.append("d");
		list.append("e");		

		System.out.println(list.first().equals("a"));
		System.out.println(list.last().equals("e"));

		System.out.println(list.get(1).equals(2));
		System.out.println(list.get(2).equals("c"));
		System.out.println(list.get(5) == null);

		System.out.println(list.has("a") == true);
		System.out.println(list.has(3) == false);
		System.out.println(list.has("f") == false);
		System.out.println(list.has(2) == true);

		System.out.println(list.count() == 5);
		list.append(null);
		System.out.println(list.count() == 5);

		System.out.println(list.delete(1) == true);
		System.out.println(list.delete(9) == false);

		System.out.println(list.count() == 4);

		System.out.println(list.get(0).equals("a"));
		System.out.println(list.get(1).equals("c"));
		System.out.println(list.get(2).equals("d"));
		System.out.println(list.get(3).equals("e"));

		System.out.println(list.drop(2).equals("d"));

		System.out.println(list.count() == 3);

		System.out.println(list.remove("c") == true);

		System.out.println(list.count() == 2);

		System.out.println(list.get(0).equals("a"));
		System.out.println(list.get(1).equals("e"));

		System.out.println(list.drop(2) == null);
		System.out.println(list.remove("c") == false);

		list.clean();

		System.out.println(list.count() == 0);
		System.out.println(list.empty() == true);
		System.out.println(list.get(0) == null);
		System.out.println(list.first() == null);
		System.out.println(list.last() == null);
	}

}
