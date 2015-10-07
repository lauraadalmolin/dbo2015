package web;

public class Markdown {
	
	public static String toHTML (String text) {
		text = text.trim();
		
		if (text.contains("<")) {
			int first = text.indexOf("<", 0);
			int last = text.lastIndexOf(">");
			if (text.charAt(first + 1) != ' ' && text.charAt(last - 1) != ' ') {
				String s = text.substring(first + 1, last);
				text = text.replace(">", "</a>");
				String text2 = text.substring(text.lastIndexOf("<"), text.length());
				String text3 = text.substring(0, text.lastIndexOf("<"));
				text3 = text3.replace("<", "<a href=\"" + s + "\"" + ">");
				text = text3 + text2;
							
			}
		}
		
		if (text.contains("**")) {
			text = text.replace(" **", " <strong>");				
			text = text.replace("** ", "</strong> ");
			text = text.replace("**.", "</strong>.");
		}
		
		if (text.contains("*")) {
			if (text.charAt(text.indexOf('*', 0) + 1) != ' '
				&& text.charAt(text.lastIndexOf('*') - 1) != ' ') {
				text = text.replace(" *", " <em>");				
				text = text.replace("* ", "</em> ");
				
			}
		}
		
	
		
		if (text.startsWith("# ")) { 
			text = text.replace('#', ' ');
			text = text.trim();				
			text = "<h1>" + text + "</h1>";
		}
		else {
			if (text.startsWith("## ")) {
			text = text.replace('#', ' ');
			text = text.trim();
			text = "<h2>" + text + "</h2>";
			}
			else {
				if (text.startsWith("### ")) {
					text = text.replace('#', ' ');
					text = text.trim();	
					text = "<h3>" + text + "</h3>";
				}
					else {
						text = "<p>" + text + "</p>";
					}
						
				}
			}
		
			
		
	
		return text;
	}

	
		
		
}
