package toolkit;


/**
 * 
 * @author Laura A. Dalmolin
 *
 */

public class Date {
	
	private int day, month, year;
	
	/**
	 * Construtor sem parâmetros. Quando o usuário não informa valores para a data estes são os valores utilizados.
	 * @param date
	 */
	public Date () {
		this(1, 1, 1582);
	}

	/**
	 * Construtor com um parâmetro String. Cria uma data com valores int a partir da String informada.
	 * @param date
	 */
	public Date (String date) {
		
		char[] a = date.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != '0' && a[i] != '1' && a[i] != '2' && a[i] != '3' && a[i] != '4' && a[i] != '5' &&
				a[i] != '6' && a[i] != '7' && a[i] != '8' && a[i] != '9' && a[i] != '/' && a[i] != '.' && a[i] != '-') throw new IllegalArgumentException("Illegal character.");
		}
		/**
		 * Testa se os caracteres da String são válidos. Se não forem gera uma exceção.
		 */
		String d = "", m = "", y = "";
		
		@SuppressWarnings("unused")
		int i, j = 0;

		for (i = 0;  a[i] != '/' && a[i] != '-' && a[i] != '.'; i++, j++) d = d + a[i];
		i++;
		for (j = 0; a[i] != '/' && a[i] != '-' && a[i] != '.'; i++, j++) m = m + a[i];
		i++;
		for (j = 0; i < a.length; j++, i++) y = y + a[i];
		
		/**
		 * Corta a String original em três Strings: dias, meses e anos.
		 */

		d = Strings.cutZero(d);
		m = Strings.cutZero(m);
		/**
		 *  corta o zero do começo da String, caso exista um zero no começo da String.
		 */
		this.day = Strings.toInt(d);
 		this.month = Strings.toInt(m);
 		this.year = Strings.toInt(y);

	} 
	
	/**
	 * Construtor com parâmetros inteiros 
	 * Cria uma nova Date com os parâmetros fornecidos
	 * Rejeita parâmetros negativos, valores para dia que ultrapassem o valor máximo do mês correspondente,
	 * valores para mês que ultrapassem 12, valores para ano que sejam menores que 1582
	 * @param d = dias
	 * @param m = meses
	 * @param y = anos
	 */
	public Date(int d, int m, int y) {
		
		if (d <= 0 || m <= 0 || y <= 0) throw new IllegalArgumentException("Illegal statement.");
		if (d > 31) throw new IllegalArgumentException("Illegal day.");
		if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) throw new IllegalArgumentException("Illegal day.");
		if ((m == 2 && bissextile(y) == true) && d > 29) throw new IllegalArgumentException("Illegal day.");
		if ((m == 2 && bissextile(y) == true) && d > 28) throw new IllegalArgumentException("Illegal day.");
		if (m > 12) throw new IllegalArgumentException("Illegal month.");
		if (y < 1582) throw new IllegalArgumentException("Illegal year.");
		day = d;
		month = m;
		year = y;
		

	}

	/**
	 * Corrige uma data originada nos métodos tomorrow() e yesterday()
	 * @param d = dias
	 * @param m = meses
	 * @param y = anos
	 * @return a nova data, corrigida.
	 * 
	 */
	
	private Date newDate(int d, int m, int y) {

		Date invalid = new Date();
		invalid.day = d;
		invalid.month = m;
		invalid.year = y;
		invalid.fixer();
		return invalid;

	}

	/**
	 * Getter do dia
	 * @return dia
	 */
	public int getDay () {
		return day;
	}

	/**
	 * Getter do mês
	 * @return mês
	 */
	public int getMonth () {
		return month;
	}
	
	/**
	 * Getter do ano
	 * @return ano
	 */

	public int getYear () {
		return year;
	}

	/**
	 * Setter do dia
	 * Modifica o dia
	 * @param d
	 */
	public void setDay (int d) {
		day = d;
	}
	
	/**
	 * Setter do mês
	 * Modifica o mês
	 * @param m
	 */
	public void setMonth (int m) {
		month = m;
	}

	/**
	 * Setter do ano
	 * Modifica o ano
	 * @param y
	 */
	
	public void setYear (int y) {
		year = y;
	}

	/**
	 * Verifica se o ano informado como parâmetro é bissexto
	 * @return boolean: true se for, false se não for
	 */
	
	public static boolean bissextile (int n) {
		if (n < 1582) throw new IllegalArgumentException("Invalid year! Please type a year greater than 1581.");
			if (n % 4 == 0) { 
				if (n % 100 != 0) return true;
				if (n % 100 == 0 && n % 400 == 0) return true; 
			}
		return false;
	}

	/**
	 * Escreve a data no seguinte formato: DD/MM/YYYY
	 */
	public String toString () {
		return ((day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year);
	}

	/**
	 * Calcula a diferença em dias de uma data para outra
	 * @param a -> Data a (a outra data)
	 * @return a diferença
	 */
	
	public int differenceInDays (Date a) {
		
		Date n = new Date();
		int i = 0;
		
		if (this.isBefore(a)) { 
			n = this;
			for (; n.isTheSame(a) == false; i++) n = n.sumDays(1);
		} 

		else {
			n = a;
			for (;!(n.isTheSame(a)); i++) n = n.sumDays(1);
		}

		return i;
	}
	
	/**
	 * Calcula a diferença em meses entre uma data e outra
	 * Conta apenas os meses inteiros, se não completar 30 dias exatos não assume-se que decorreu um mês
	 * @param a -> Date a, a outra data
	 * @return a diferença em meses
	 */
	public int differenceInMonths (Date a) {
		return (this.differenceInDays(a)/30);
	}
	
	/**
	 * Calcula a diferença em anos entre uma data e outra
	 * @param a -> 	Date a, a outra data
	 * @return a diferença em anos
	 */
	public int differenceInYears (Date a) {
		return (this.differenceInDays(a)/365);
	}
	
	/**
	 * Conserta a data para que se encaixe nos padrões requeridos pelo construtor.
	 */
	
	private void fixer () {
		if (this.month == 1 || this.month == 3 || this.month == 5 ||
		this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)  {
			if (this.day > 31) {
				this.month++;
				this.day = this.day % 31;
			}
			if (this.day <= 0 && month != 8 && month != 1) {
				month--;
				day = 30 - day;
			} 
			if (this.day <= 0 && (month == 8 || month == 1)) {
				month--;
				day = 31 - day;
			} 
		}
		if (this.month == 4 || this.month == 6 ||
		this.month == 9 || this.month == 11)  {
			if (this.day > 30) {
				this.month++;
				this.day = this.day % 30;
			}
			if (this.day <= 0) {
				month--;
				day = 31 - day;
			} 
		}
		if (this.month == 2 && bissextile(year) == true) {
			if (this.day > 29) {
				this.month++;
				this.day = this.day % 29;
				
			} 
			if (this.day <= 0) {
				month--;
				day = 31 - day;
			} 
		}
		if (this.month == 2) {
			if (this.day > 28) {
				this.month++;
				this.day = this.day % 28;
				
			} 
			if (this.day <= 0) {
				month--;
				day = 31 - day;
			} 
		}
		
		if (this.month > 12) {  this.year += this.month / 12; this.month = this.month % 12; }
		if (this.month <= 0)  {
			if (this.month == 0) month = 12;
			else this.month = 12 - month % 12;
			this.year -= this.month / 12; 
		}
		 
	}  
	
	/**
	 * adiciona um dia na data
	 * @return a data com um dia a mais
	 */
	
	private Date tomorrow () {
		return newDate (day + 1, month, year);
	}
	
	/**
	 * subtrai um dia da data 
	 * 
	 * @return a data com um dia a menos
	 */
	
	private Date yesterday() {
		return newDate (day - 1, month, year);
	}
	
	/**
	 * Adiciona uma quantidade x de dias, informada como parâmetro, a data
	 * @param d -> dias a serem somados
	 * @return a nova data
	 */
	public Date sumDays (int d) {
		if (d < 0) return this.minusDays(d*-1);
		Date r = new Date(day, month, year);
		for (int i = 0; i < d; i++) r = r.tomorrow();
		return r;
	}
	
	/**
	 * Adiciona uma quantidade x de meses, informada como parâmetro, a data.
	 * Cada mês equivale a 30 dias neste método.
	 * @param m -> quantidade de meses
	 * @return a nova data
	 */
	public Date sumMonths (int m) {
		if (m < 0) return this.minusMonths(m*-1);
		Date r = new Date(day, month, year);
		for (int i  = 0; i < m * 30; i++) r = r.tomorrow();
		return r;
	}	
	
	/**
	 * Adiciona uma quantidade x de anos, informada como parâmetro, a data. 
	 * @param y -> a quantidade de anos
	 * @return a nova data
	 */
	public Date sumYears (int y) {
		if (y < 0) return this.minusYears(y*-1);
		return new Date (day, month, year + y);
	}
	
	/**
	 * Subtrai uma quantidade x de anos, informada como parâmetro, a data.
	 * @param y -> a quantidade de anos
	 * @return a nova data
	 */
	public Date minusYears (int y) {
		if (y < 0) return this.sumYears(y*-1);
		if (year > y && year - y >= 1582) { return new Date (day, month, year - y); }
		throw new IllegalArgumentException("Illegal resulting date.");
	}

	/**
	 * Subtrai uma quantidade x de meses, informada como parâmetro, a data.
	 * Cada mês equivale a 30 dias neste método.
	 * @param m -> quantidade de meses
	 * @return a nova data
	 */
	public Date minusMonths (int m) {
		if (m < 0) return this.sumMonths(m*-1);
		Date r = new Date(day, month, year);
		for (int i = 0; i < m*30; i++) r = r.yesterday();
		return r;
	}
	
	/**
	 * Subtrai uma quantidade x de dias, informada como parâmetro, a data
	 * @param d -> dias a serem somados
	 * @return a nova data
	 */
	public Date minusDays (int d) {
		if (d < 0) return this.minusDays(d*-1);
		Date r = new Date(day, month, year);
		for (int i = 0; i < d; i++) r = r.yesterday();
		return r;
	}

	/**
	 * Escreve a data por extenso
	 * @return a String com a data por extenso
	 */
	public String toStringPorExtenso () {
		String[] a = {" de janeiro de ", " de fevereiro de ", " de marco de ", " de abril de ", " de maio de ", " de junho de ", " de julho de ", " de agosto de ",
						" de agosto de ", " de setembro de ", " de outubro de ", " de novembro de ", " de dezembro de "};
		return day + a[month-1] + year;
		
	} 
	
	/**
	 * Escreve a data no formato ISO
	 * @return a String com a data no formato ISO
	 */
	
	public String toStringISO () {
	return (year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day));
	}

	/**
	 * Compara duas datas para ver se são iguais
	 * @param n -> a segunda data
	 * @return um valor boolean: true se forem iguais X false se forem diferentes
	 */
	public boolean isTheSame (Date n) {
		if (this.day == n.day && this.month == n.month && this.year == n.year) return true;
		return false;

	}

	/**
	 * Compara duas datas para ver se a que chama o método (esta.isAfter(aquela)) é depois da passada
	 * como parâmetro
	 * @param n -> a segunda data
	 * @return um valor boolean: true se esta for depois daquela X false se esta for antes daquela
	 */
	public boolean isAfter (Date n) {
		if (this.year > n.year) return true;
		if (this.year == n.year && this.month > n.month) return true;
		if (this.year == n.year && this.month == n.month && this.day > n.day) return true;
		return false;
	}
	
	/**
	 * Compara duas datas para ver se a que chama o método (esta.isAfter(aquela)) é antes da passada
	 * como parâmetro
	 * @param n -> a segunda data
	 * @return um valor boolean: true se esta for antes daquela X false se esta for depois daquela
	 */
	public boolean isBefore (Date n) {
		if (this.isAfter(n) == false && this.isTheSame(n) == false) return true;
		return false; 
	}
	
	/**
	 * Consulta se é o dia ímpar
	 * @return um valor boolean: true se for ímpar x false se for par
	 */
	public boolean isOddDay () {
		if (day % 2 != 0) return true;
		return false;
	}
	
	/**
	 * Consulta se o dia é par
	 * @return um valor boolean: true se for par X false se for ímpar
	 */
	
	public boolean isEvenDay() {
		if (this.isOddDay() == false) return true;
		return false;
	}
	
	/**
	 * Consulta se o ano é bissexto
	 * @return um valor boolean: true se for bissexto X false se não for
	 */
	public boolean isBissextile () {
		return bissextile(year);
	}

}