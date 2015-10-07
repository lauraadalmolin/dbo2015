package web;

public class Main {

	public static void main(String[] args) {
		
		// texto plano é um parágrafo por padrão
		System.out.println(Markdown.toHTML("texto").equals("<p>texto</p>"));
		// espaços antes e depois da string devem ser ignorados
		System.out.println(Markdown.toHTML("  texto e teste  ").equals("<p>texto e teste</p>"));
		// títulos
		System.out.println(Markdown.toHTML("# TÍTULO PRINCIPAL").equals("<h1>TÍTULO PRINCIPAL</h1>"));
		// lembrando, espaços antes e depois são ignorados
		System.out.println(Markdown.toHTML("#     TÍTULO PRINCIPAL    ").equals("<h1>TÍTULO PRINCIPAL</h1>"));
		System.out.println(Markdown.toHTML("## Títulos de segundo nível").equals("<h2>Títulos de segundo nível</h2>"));
		System.out.println(Markdown.toHTML("### Títulos de terceiro nível").equals("<h3>Títulos de terceiro nível</h3>"));
		// quando fica junto é ignorado
		System.out.println(Markdown.toHTML("#Não é título").equals("<p>#Não é título</p>"));
		// mais de três níveis é ignorado
		System.out.println(Markdown.toHTML("#### Não é título").equals("<p>#### Não é título</p>"));
		// ---------- ATEH AQUI 0.5

		// os formatos a seguir se aplicam mesmo dentro de títulos e parágrafos
		System.out.println(Markdown.toHTML("Um texto de *teste* itálico.").equals("<p>Um texto de <em>teste</em> itálico.</p>"));
		// só funciona se dentro do marcador houver um não-espaço
		System.out.println(Markdown.toHTML("Um texto de * teste* itálico.").equals("<p>Um texto de * teste* itálico.</p>"));
		System.out.println(Markdown.toHTML("Um texto de *teste * itálico.").equals("<p>Um texto de *teste * itálico.</p>"));
		System.out.println(Markdown.toHTML("Um texto de * teste * itálico.").equals("<p>Um texto de * teste * itálico.</p>"));
		 // sem espaços internos funciona, mesmo com uma frase
		System.out.println(Markdown.toHTML("Um texto de *teste em itálico* com várias palavras.").equals("<p>Um texto de <em>teste em itálico</em> com várias palavras.</p>"));
		 // meio aberto (ou fechado) é ignorado
		System.out.println(Markdown.toHTML("Um texto de *teste em itálico com várias palavras.").equals("<p>Um texto de *teste em itálico com várias palavras.</p>"));

		 // vale tudo para negrito
		System.out.println(Markdown.toHTML("Um texto de **teste em negrito** com várias palavras.").equals("<p>Um texto de <strong>teste em negrito</strong> com várias palavras.</p>"));

		 // hyperlinks da mesma maneira só que com < e >
		System.out.println(Markdown.toHTML("Parágrafo com link para <http://google.com> de teste.").equals("<p>Parágrafo com link para <a href=\"http://google.com\">http://google.com</a> de teste.</p>"));
		System.out.println(Markdown.toHTML("Parágrafo com link para < http://google.com> de teste.").equals("<p>Parágrafo com link para < http://google.com> de teste.</p>"));
		 // ATEH AQUI 1.0

	}

}
