package date;

public class Main { 
	
	public static void main(String[] args) {
		Date d1 = new Date(1, 4, 2015);
		Date d2 = new Date(1, 5, 2015);
		Date d3 = new Date(2, 6, 4030);
		Date d4 = new Date(1, 5, 2015);
		System.out.println(d1.sum(d2).toString().equals("02/09/4030"));
		System.out.println(d1.sumDays(30).toString().equals("01/05/2015"));
		System.out.println(d1.sumMonths(12).toString().equals("01/04/2016"));
		System.out.println(d1.sumYears(1).toString().equals("01/04/2016"));
		System.out.println(d3.minus(d4).toString().equals("01/01/2015"));
		System.out.println(d3.minusDays(1).toString().equals("01/06/4030"));
		System.out.println(d3.minusDays(2).toString().equals("31/05/4030"));
		System.out.println(d3.minusMonths(1).toString().equals("02/05/4030"));
		System.out.println(d3.minusYears(1).toString().equals("02/06/4029"));
		System.out.println(d3.sumMonths(14).toString().equals("02/08/4031"));
		System.out.println(d3.sumYears(14).toString().equals("02/06/4044"));
		System.out.println(d3.sumDays(40).toString().equals("12/07/4030"));
		


	}

}