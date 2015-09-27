package toolkit;

public class Date {
	
	private int day, month, year;
	
	public Date () {
		this(1, 1, 1582);
	}

	public Date (String date) {
		
		char[] a = date.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != '0' && a[i] != '1' && a[i] != '2' && a[i] != '3' && a[i] != '4' && a[i] != '5' &&
				a[i] != '6' && a[i] != '7' && a[i] != '8' && a[i] != '9' && a[i] != '/' && a[i] != '.' && a[i] != '-') throw new IllegalArgumentException("Illegal character.");
		}

		String d = "", m = "", y = "";
		
		int i, j = 0;

		for (i = 0;  a[i] != '/' && a[i] != '-' && a[i] != '.'; i++, j++) d = d + a[i];
		i++;
		for (j = 0; a[i] != '/' && a[i] != '-' && a[i] != '.'; i++, j++) m = m + a[i];
		i++;
		for (j = 0; i < a.length; j++, i++) y = y + a[i];

		//d = Strings.cutZero(d);
		//m = Strings.cutZero(m);
		
		this.day = toInt(d);
 		this.month = toInt(m);
 		this.year = toInt(y);

	} 

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

	private Date newDate(int d, int m, int y) {

		Date invalid = new Date();
		invalid.day = d;
		invalid.month = m;
		invalid.year = y;
		invalid.fixer();
		return invalid;

	}

	public int getDay () {
		return day;
	}

	public int getMonth () {
		return month;
	}

	public int getYear () {
		return year;
	}

	public void setDay (int d) {
		day = d;
	}

	public void setMonth (int m) {
		month = m;
	}

	public void setYear (int y) {
		year = y;
	}

	public static boolean bissextile (int n) {
		if (n < 1582) throw new IllegalArgumentException("Invalid year! Please type a year greater than 1581.");
			if (n % 4 == 0) { 
				if (n % 100 != 0) return true;
				if (n % 100 == 0 && n % 400 == 0) return true; 
			}
		return false;
	}

	public String toString () {
		return ((day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year);
	}

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
	
	public int differenceInMonths (Date a) {
		return (this.differenceInDays(a)/30);
	}
	
	public int differenceInYears (Date a) {
		return (this.differenceInDays(a)/365);
	}
	
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
	
	private Date tomorrow () {
		return newDate (day + 1, month, year);
	}
	
	private Date yesterday() {
		return newDate (day - 1, month, year);
	}
	
	public Date sumDays (int d) {
		if (d < 0) return this.minusDays(d*-1);
		Date r = new Date(day, month, year);
		for (int i = 0; i < d; i++) r = r.tomorrow();
		return r;
	}
	
	public Date sumMonths (int m) {
		if (m < 0) return this.minusMonths(m*-1);
		Date r = new Date(day, month, year);
		for (int i  = 0; i < m * 30; i++) r = r.tomorrow();
		return r;
	}	
	
	public Date sumYears (int y) {
		if (y < 0) return this.minusYears(y*-1);
		return new Date (day, month, year + y);
	}
	
	public Date minusYears (int y) {
		if (y < 0) return this.sumYears(y*-1);
		if (year > y && year - y >= 1582) { return new Date (day, month, year - y); }
		throw new IllegalArgumentException("Illegal resulting date.");
	}

	public Date minusMonths (int m) {
		if (m < 0) return this.sumMonths(m*-1);
		Date r = new Date(day, month, year);
		for (int i = 0; i < m*30; i++) r = r.yesterday();
		return r;
	}
	
	public Date minusDays (int d) {
		if (d < 0) return this.minusDays(d*-1);
		Date r = new Date(day, month, year);
		for (int i = 0; i < d; i++) r = r.yesterday();
		return r;
	}

	public String toStringPorExtenso () {
		String[] a = {" de janeiro de ", " de fevereiro de ", " de marco de ", " de abril de ", " de maio de ", " de junho de ", " de julho de ", " de agosto de ",
						" de agosto de ", " de setembro de ", " de outubro de ", " de novembro de ", " de dezembro de "};
		return day + a[month-1] + year;
		
	} 
	
	public String toStringISO () {
	return (year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day));
	}

	public boolean isTheSame (Date n) {
		if (this.day == n.day && this.month == n.month && this.year == n.year) return true;
		return false;

	}

	public boolean isAfter (Date n) {
		if (this.year > n.year) return true;
		if (this.year == n.year && this.month > n.month) return true;
		if (this.year == n.year && this.month == n.month && this.day > n.day) return true;
		return false;
	}
	
	public boolean isBefore (Date n) {
		if (this.isAfter(n) == false && this.isTheSame(n) == false) return true;
		return false; 
	}
	
	public boolean isOddDay () {
		if (day % 2 != 0) return true;
		return false;
	}
	
	public boolean isEvenDay() {
		if (this.isOddDay() == false) return true;
		return false;
	}
	
	public boolean isBissextile () {
		return bissextile(year);
	}
	
	public int toInt(String a){
		char[] vetor = a.toCharArray();
		//int[] vetor2 = new int[vetor.length];
		int tam = 1, retorno = 0;
		for (int i = vetor.length; i >= 0; i--, tam *= 10) {
			switch(vetor[i]) {
			case '1': retorno += 1 * tam; break;
			case '2': retorno += 2 * tam; break;
			case '3': retorno += 3 * tam; break;
			case '4': retorno += 4 * tam; break;
			case '5': retorno += 5 * tam; break;
			case '6': retorno += 6 * tam; break;
			case '7': retorno += 7 * tam; break;
			case '8': retorno += 8 * tam; break;
			case '9': retorno += 1 * tam; break;
			}
		}
		return retorno;
	}

}