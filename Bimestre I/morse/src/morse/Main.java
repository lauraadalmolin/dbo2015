package morse;
	
public class Main {
	
	public static void main(String[] args) {

		System.out.println(morseEncode("dbo").equals("-.. -... ---"));
		System.out.println(morseEncode("DBO").equals("-.. -... ---"));
		System.out.println(morseEncode("informatica para internet turma 2014").equals(".. -. ..-. --- .-. -- .- - .. -.-. .- / .--. .- .-. .- / .. -. - . .-. -. . - / - ..- .-. -- .- / ..--- ----- .---- ....-"));

		System.out.println(morseDecode("-.. -... ---").equals("dbo"));
		System.out.println(morseDecode(".. -. ..-. --- .-. -- .- - .. -.-. .- / .--. .- .-. .- / .. -. - . .-. -. . - / - ..- .-. -- .- / ..--- ----- .---- ....-").equals("informatica para internet turma 2014"));
	}


	public static String morseEncode (String code) {
		code = St.toLowerCase(code);
		char[] a = code.toCharArray();
		String[] b = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
				case 'a' : b[i] = ".- "; break;
				case 'b' : b[i] = "-... "; break;
				case 'c' : b[i] = "-.-. "; break;
				case 'd' : b[i] = "-.. "; break;
				case 'e' : b[i] = ". "; break;
				case 'f' : b[i] = "..-. "; break;
				case 'g' : b[i] = "--. "; break;
				case 'h' : b[i] = ".... "; break;
				case 'i' : b[i] = ".. "; break;
				case 'j' : b[i] = ".--- "; break; 
				case 'k' : b[i] = "-.- "; break;
				case 'l' : b[i] = ".-.. "; break;
				case 'm' : b[i] = "-- "; break;
				case 'n' : b[i] = "-. "; break;
				case 'o' : b[i] = "--- "; break;
				case 'p' : b[i] = ".--. "; break;
				case 'q' : b[i] = "--.- "; break;
				case 'r' : b[i] = ".-. "; break;
				case 's' : b[i] = "... "; break;
				case 't' : b[i] = "- "; break;
				case 'u' : b[i] = "..- "; break;
				case 'v' : b[i] = "...- "; break;
				case 'w' : b[i] = ".-- "; break;
				case 'x' : b[i] = "-..- "; break;
				case 'y' : b[i] = "-.-- "; break;
				case 'z' : b[i] = "--.. "; break;
				case '1' : b[i] = ".---- "; break;
				case '2' : b[i] = "..--- "; break;
				case '3' : b[i] = "...-- "; break;
				case '4' : b[i] = "....- "; break;
				case '5' : b[i] = "..... "; break;
				case '6' : b[i] = "-.... "; break;
				case '7' : b[i] = "--... "; break;
				case '8' : b[i] = "---.. "; break;
				case '9' : b[i] = "----. "; break;
				case '0' : b[i] = "----- "; break;
				case ' ' : b[i] = "/ "; break;
				default : throw new IllegalArgumentException("Illegal char");
			}
		}
		String ret = " ";
		for(int i = 0; i < b.length; i++) {
			ret = toString(ret, b[i]);
		}
		ret = Trim.trim(ret);
		return ret;
	}
	//FAZER O DECODE EM CASA
	//QUANTO ANTES MELHOR
	public static String morseDecode (String code) {
		char[] a = code.toCharArray();
		int l = 0;
		for(int i = 0; i < a.length; i++) if (a[i] == ' ') {l++;};
		String[] n = new String[l+1];
		int j = 0;
		for (int i = 0; i < l; i++) {
			while (a[j] != ' ') {
				System.out.println(charToString(a[j]));
				n[i] = n[i] + charToString(a[j]);
				j++;
			}
			n[i] = toString(n[i], " ");
			System.out.println(n[i]);
		}		
		char[] b = new char[l+1];

		for (int i = 0; i < a.length; i++) {
			switch (n[i]) {
				case ".- " : b[i] = 'a'; break;
				case "-... " : b[i] = 'b'; break;
				case "-.-. " : b[i] = 'c'; break;
				case "-.. " : b[i] = 'd'; break;
				case ". " : b[i] = 'e'; break;
				case "..-. " : b[i] = 'f'; break;
				case "--. " : b[i] = 'g'; break;
				case ".... " : b[i] = 'h'; break;
				case ".. " : b[i] = 'i'; break;
				case ".--- " : b[i] = 'j'; break; 
				case "-.- " : b[i] = 'k'; break;
				case ".-.. ": b[i] = 'l'; break;
				case "-- " : b[i] = 'm'; break;
				case "-. " : b[i] = 'n'; break;
				case "--- " : b[i] = 'o'; break;
				case ".--. " : b[i] = 'p'; break;
				case "--.- " : b[i] = 'q'; break;
				case ".-. " : b[i] = 'r'; break;
				case "... " : b[i] = 's'; break;
				case "- " : b[i] = 't'; break;
				case "..- " : b[i] = 'u'; break;
				case "...- " : b[i] = 'v'; break;
				case ".-- " : b[i] = 'w'; break;
				case "-..- " : b[i] = 'x'; break;
				case "-.-- " : b[i] = 'y'; break;
				case "--.. " : b[i] = 'z'; break;
				case ".---- " : b[i] = '1'; break;
				case "..--- " : b[i] = '2'; break;
				case "...-- " : b[i] = '3'; break;
				case "....- " : b[i] = '4'; break;
				case "..... " : b[i] = '5' ; break;
				case "-.... " : b[i] = '6'; break;
				case "--... " : b[i] = '7'; break;
				case "---.. " : b[i] = '8'; break;
				case "----. " : b[i] = '9' ; break;
				case "----- " : b[i] = '0'; break;
				case "/ " : b[i] = ' '; break;
				default : throw new IllegalArgumentException("Illegal char");
			}
		}
		String ret = " ";
		for(int i = 0; i < b.length; i++) {
			ret = toString(ret, charToString(b[i]));
		}
		ret = Trim.trim(ret);
		return ret;
	}

	public static String toString (String ret, String b) {
		// abc
		// def	
		if (ret == null) ret = "";
		char[] n1 = ret.toCharArray(); // 3
		char[] n2 = b.toCharArray(); // 3
		char[] s = new char[n1.length+n2.length]; // 6
		for (int i = 0; i < n1.length; i++) s[i] = n1[i]; // s = [a,b,c,e,,]
		
		for (int j = 0, i = n1.length; i < s.length; i++, j++) {
			s[i] = n2[j];
		}
		return new String(s);
	}

	public static String charToString (char a) {
		switch (a) {
			case 'a' : return "a";
			case 'b' : return "b";
			case 'c' : return "c";
			case 'd' : return "d";
			case 'e' : return "e";
			case 'f' : return "f";
			case 'g' : return "g";
			case 'h' : return "h";
			case 'i' : return "i";
			case 'j' : return "j";
			case 'k' : return "k";
			case 'l' : return "l";
			case 'm' : return "m";
			case 'n' : return "n";
			case 'o' : return "o";
			case 'p' : return "p";
			case 'q' : return "q";
			case 'r' : return "r";
			case 's' : return "s";
			case 't' : return "t";
			case 'u' : return "u";
			case 'v' : return "v";
			case 'w' : return "w";
			case 'x' : return "x";
			case 'y' : return "y";
			case '0' : return "0";
			case '1' : return "1";
			case '2' : return "2";
			case '3' : return "3";
			case '4' : return "4";
			case '5' : return "5";
			case '6' : return "6";
			case '7' : return "7";
			case '8' : return "8";
			case '9' : return "9";
			case ' ' : return " ";
			default : return "";
		}
	}
}