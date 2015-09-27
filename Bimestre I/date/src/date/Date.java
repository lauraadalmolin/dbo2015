package date;

public class Date {
	
	private int day, month, year;

	public Date() {
		this(1, 1, 1582);
	}

	public Date(int d, int m, int y) {
		
		if (d > 31) throw new IllegalArgumentException("Illegal day.");
		if ((m == 4 || m == 6 || m == 9 || m == 12) && d > 30) throw new IllegalArgumentException("Illegal day.");
		if ((m == 2 && bissextile(y) == true) && d > 29) throw new IllegalArgumentException("Illegal day.");
		if ((m == 2 && bissextile(y) == true) && d > 28) throw new IllegalArgumentException("Illegal day.");
		if (m < 0 || d < 0 || y < 0) throw new IllegalArgumentException("Illegal day.");
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

	public Date (int d, int m, int y, boolean inner) {
		day = d;
		month = m;
		year = y;
	}

	public int day () {
		return day;
	}

	public int month () {
		return month;
	}

	public int year () {
		return year;
	}

	public static boolean bissextile (int n) {
		boolean b = false;
		if (n < 1582) throw new IllegalArgumentException("Invalid year! Please type a year greater than 1581.");
			if (n % 4 == 0) { 
				if (n % 100 != 0) b = true;
				if (n % 100 == 0 && n % 400 == 0) b = true; 
			}
		return b;
	}

	public String toString () {
		return ((day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year);
	}

	public void fixer () {
		if (this.month == 1 || this.month == 3 || this.month == 5 ||
		this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)  {
			if (this.day > 31) {
				this.month++;
				this.day = this.day % 31;
			}
			if (this.day <= 0 && month != 8) {
				month--;
				day = 30 - day;
			} 
			if (this.day <= 0 && month == 8) {
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
		if (this.month < 0)  { this.year -= this.month / 12; this.month = 12 * this.year - month; }
	}  

	public Date sum (Date x) {
		Date n = newDate(this.day + x.day, this.month + x.month, this.year + x.year);
		return n;
	}

	public Date sumDays (int days) {
		Date n = newDate(this.day + days, month, year);
		return n;
	}
	
	public Date sumMonths(int months) {
		Date n = newDate(day, months + this.month, year);
		return n;
	}

	public Date sumYears (int years) {
		Date n = new Date (day, month, this.year + years);
		return n;
	} 
	
	public Date minus (Date x) {
		if (x.year < this.year)	{
			Date n = newDate(this.day - x.day, this.month - x.month, this.year - x.year);
			return n;
		}
		throw new IllegalArgumentException("Illegal date");
	}

	public Date minusDays (int days) {
		Date n = newDate(this.day - days, month, year);
		return n;
	}

	public Date minusMonths (int months) {
		Date n = newDate(day, this.month - months, year);
		return n;
	}

	public Date minusYears (int years) {
		if (years < this.year && this.year - years >= 1582) {
			Date n = newDate(day, month, this.year - years);
			return n; 
		}
		throw new IllegalArgumentException("Illegal resulting date");
	}

}