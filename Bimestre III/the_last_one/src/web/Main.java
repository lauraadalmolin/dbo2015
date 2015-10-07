package web;

public class Main {

	public static void main(String[] args) {
		
		// texto plano � um par�grafo por padr�o
		System.out.println(Markdown.toHTML("texto").equals("<p>texto</p>"));
		// espa�os antes e depois da string devem ser ignorados
		System.out.println(Markdown.toHTML("  texto e teste  ").equals("<p>texto e teste</p>"));
		// t�tulos
		System.out.println(Markdown.toHTML("# T�TULO PRINCIPAL").equals("<h1>T�TULO PRINCIPAL</h1>"));
		// lembrando, espa�os antes e depois s�o ignorados
		System.out.println(Markdown.toHTML("#     T�TULO PRINCIPAL    ").equals("<h1>T�TULO PRINCIPAL</h1>"));
		System.out.println(Markdown.toHTML("## T�tulos de segundo n�vel").equals("<h2>T�tulos de segundo n�vel</h2>"));
		System.out.println(Markdown.toHTML("### T�tulos de terceiro n�vel").equals("<h3>T�tulos de terceiro n�vel</h3>"));
		// quando fica junto � ignorado
		System.out.println(Markdown.toHTML("#N�o � t�tulo").equals("<p>#N�o � t�tulo</p>"));
		// mais de tr�s n�veis � ignorado
		System.out.println(Markdown.toHTML("#### N�o � t�tulo").equals("<p>#### N�o � t�tulo</p>"));
		// ---------- ATEH AQUI 0.5

		// os formatos a seguir se aplicam mesmo dentro de t�tulos e par�grafos
		System.out.println(Markdown.toHTML("Um texto de *teste* it�lico.").equals("<p>Um texto de <em>teste</em> it�lico.</p>"));
		// s� funciona se dentro do marcador houver um n�o-espa�o
		System.out.println(Markdown.toHTML("Um texto de * teste* it�lico.").equals("<p>Um texto de * teste* it�lico.</p>"));
		System.out.println(Markdown.toHTML("Um texto de *teste * it�lico.").equals("<p>Um texto de *teste * it�lico.</p>"));
		System.out.println(Markdown.toHTML("Um texto de * teste * it�lico.").equals("<p>Um texto de * teste * it�lico.</p>"));
		 // sem espa�os internos funciona, mesmo com uma frase
		System.out.println(Markdown.toHTML("Um texto de *teste em it�lico* com v�rias palavras.").equals("<p>Um texto de <em>teste em it�lico</em> com v�rias palavras.</p>"));
		 // meio aberto (ou fechado) � ignorado
		System.out.println(Markdown.toHTML("Um texto de *teste em it�lico com v�rias palavras.").equals("<p>Um texto de *teste em it�lico com v�rias palavras.</p>"));

		 // vale tudo para negrito
		System.out.println(Markdown.toHTML("Um texto de **teste em negrito** com v�rias palavras.").equals("<p>Um texto de <strong>teste em negrito</strong> com v�rias palavras.</p>"));

		 // hyperlinks da mesma maneira s� que com < e >
		System.out.println(Markdown.toHTML("Par�grafo com link para <http://google.com> de teste.").equals("<p>Par�grafo com link para <a href=\"http://google.com\">http://google.com</a> de teste.</p>"));
		System.out.println(Markdown.toHTML("Par�grafo com link para < http://google.com> de teste.").equals("<p>Par�grafo com link para < http://google.com> de teste.</p>"));
		 // ATEH AQUI 1.0

	}

}
