package failureisnotanoption;

public class Main { 
	
	public static void main(String[] args) {
		// Adotei um mÍs como tendo 30 dias, de maneira que quando se d· o sumMonth ele soma 30 dias para cada valor n informado como 
		// par‚metro.
		Date d1 = new Date(1, 1, 2015);
		Date d2 = new Date(1, 5, 2015);
		Date d3 = new Date(30, 6, 4030);
	

		System.out.println(d1.sumDays(100).toString().equals("11/04/2015"));
		System.out.println(d2.sumMonths(1).toString().equals("31/05/2015"));
		System.out.println(d1.sumYears(35).toString().equals("01/01/2050"));
		System.out.println(d3.minusDays(30).toString().equals("31/05/4030"));
		System.out.println(d3.minusDays(61).toString().equals("30/04/4030"));
		System.out.println(d3.minusMonths(1).toString().equals("31/05/4030"));
		System.out.println(d3.minusYears(1).toString().equals("30/06/4029"));
		System.out.println(d3.sumMonths(14).toString().equals(d3.sumDays(14*30).toString()));
		System.out.println(d3.sumYears(14).toString().equals("30/06/4044"));
		System.out.println(d3.sumDays(40).toString().equals("09/08/4030"));
		Date d5 = new Date(31, 12, 2015);
		System.out.println(d5.sumDays(1).toString().equals("01/01/2016"));
		System.out.println(d5.minusDays(1).toString().equals("30/12/2015"));
		
		Date d6 = new Date("01/01/2014");
		System.out.println(d6.minusDays(1).toString().equals("31/12/2013"));
			
		System.out.println();
		
		try {
			Date d7 = new Date(-1, -2, -2334);
		}
		catch (Exception e) {
			System.out.println(e);
		}

		Date d8 = new Date();
		d8.setDay(d3.getDay());
		d8.setMonth(d3.getMonth());
		d8.setYear(d3.getYear());
		
		System.out.println(d8.isTheSame(d3) == true);
		System.out.println(d8.isTheSame(d1) == false);
		System.out.println(d1.isBefore(d8) == true);
		System.out.println(d8.isAfter(d2) == true);
		
		Date d9 = new Date("1/1/2000");
		System.out.println(d9.toStringPorExtenso().equals("1 de janeiro de 2000"));
		System.out.println(d9.toStringISO().equals("2000-01-01"));
		
		Date d10 = new Date();
		d10.setDay(12);
		d10.setMonth(7);
		d10.setYear(2000);
		System.out.println(d10.toString().equals("12/07/2000"));
		
		System.out.println(d10.isOddDay() == false);
		System.out.println(d10.isEvenDay() == true);
		d10 = d10.sumDays(1);
		System.out.println(d10.isOddDay() == true);
		System.out.println(d10.isEvenDay() == false);
		System.out.println(d10.isBissextile() == true);
		d10 = d10.sumYears(1);
		System.out.println(d10.isBissextile() == false);
		
		d10 = d10.minusYears(1);
		Date d11 = new Date(30, 7, 2000);
		System.out.println(d11.isAfter(d10));
		System.out.println(d10.differenceInDays(d11) == 17);
		System.out.println(d10.differenceInMonths(d11) == 0);
		System.out.println(d10.differenceInYears(d11) == 0);
		d11 = d11.sumMonths(3);
		System.out.println(d10.differenceInMonths(d11) == 3);
		System.out.println(d10.differenceInDays(d11) == 107);
		System.out.println(d10.differenceInYears(d11) == 0);
		d11 = d11.sumYears(12);
		System.out.println(d10.differenceInYears(d11) == 12);
		d10 = d10.sumYears(1);
		System.out.println(d10.differenceInYears(d11) == 11);
		
		
		
		
		
		
		


		
		// Date d7 = new Date("a/02/2015"); -> Pega uma exce√ß√£o
	

	}

}