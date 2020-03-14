package meme_generator;

import java.util.*;

public class DivideFrase {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
	
		int size = s.length();
		size = size/3;
		
		char[] frase = s.toCharArray();
		
		ArrayList<Integer> ixs = new ArrayList<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (frase[i] == ' ') {
				ixs.add(i);
			}
		}
		
		int size2 = size*2;
		
		ArrayList<Integer> close1 = new ArrayList<Integer>();
		ArrayList<Integer> close2 = new ArrayList<Integer>();
		for (int i = 0; i < ixs.size(); i++) {
			close1.add(size - ixs.get(i));
			close2.add(size2 - ixs.get(i));
		}
		
		System.out.println(close1);
		System.out.println(close2);
		
	}
	
}
