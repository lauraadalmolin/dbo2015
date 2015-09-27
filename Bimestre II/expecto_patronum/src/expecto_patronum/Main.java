package expecto_patronum;

public class Main {

	public static void main(String[] args) {
		
		String[] letters = new String[]{"a", "b", "c", "d", "e"};

		IBetterList list = new BetterList();

		list.append("b"); // 1 or -4
		list.append("c"); // 2 or -3
		list.prepend("a"); // 0 or -5
		list.append("e"); // 4 or -1
		list.insert(3, "d"); // 3 or -2

		System.out.println(list.get(0).equals("a"));
		System.out.println(list.get(-1).equals("e"));
		System.out.println(list.get(-4).equals("b"));
		System.out.println(list.get(-2).equals(list.get(3)));

		// will be stuck in infinite loop if it does not pick eventually a different sample
		while (true) if (!list.sample().equals(list.sample())) break;

		list.shuffle();
		int disorder = 0;
		for (int i = 0; i < list.count(); i++) if (!list.get(i).equals(letters[i])) disorder++;
		System.out.println(disorder > 0); // the elements order must not be preserved

		list.sort(); // must be in ascending order like when it started
		for (int i = 0; i < list.count(); i++)
		    System.out.println(list.get(i).equals(letters[i]));

		list.reverse();
		for (int i = 0, j = 4; i < list.count(); i++, j--)
		    System.out.println(list.get(i).equals(letters[j]));

		IList sub = list.sublist(1,3);
		System.out.println(sub.count() == 2);
		System.out.println(list.count() == 5);
		System.out.println(sub.get(0).equals("d"));
		System.out.println(sub.get(1).equals("c"));
	
	}

}
