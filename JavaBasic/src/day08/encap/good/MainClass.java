package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
//		me.setYear(2026);
		me.setYear(2025);
		me.setMonth(12);
		me.setDay(2);
		me.setSsn("1234561234567");
		
		
		
		int year = me.getYear();
		System.out.println("년도 " + year);
		
		int month = me.getMonth();
		System.out.println("월 " + month);
		
		int day = me.getDay();
		System.out.println("일 " + day);
		
		String ssn = me.getSsn();
		System.out.println("등록번호 " + ssn);
		
		
		
	}
	
}
