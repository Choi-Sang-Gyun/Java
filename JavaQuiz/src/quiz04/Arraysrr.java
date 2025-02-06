package quiz04;

public class Arraysrr {
	
	private Arraysrr() {
		
	}
	
	/*
	 * 1.ArrayPrint는 접근제어자를 통해서, 외부에서 객체로 생성할 수 없도록 만들어 주세요
	 * 2.메서드에는 public static을 붙여서 호출해주세요 
	 * 
	 */
	
	
	
	public static String toArrayrr(int[] a) {
		
		if (a == null) {
			return null;
		}
		
		if(a.length == 0) {
			return "[]";
		}
		
		String b = "["; 
		
		for(int i = 0; i < a.length; i++) {
			b += a[i];
			if (i == a.length-1) {
				b+= "]";
				return b;
			}
			b += ", ";
		}
		return b;
	}
	
	public static String toArrayrr(char[] a) {
		
		if (a == null) {
			return null;
		}
		
		if(a.length == 0) {
			return "[]";
		}
		
		String b = "["; 
		
		for(int i = 0; i < a.length; i++) {
			b += a[i];
			if (i == a.length-1) {
				b+= "]";
				return b;
			}
			b += ", ";
		}
		return b;
	}
	
	public static String toArrayrr(String[] a) {
		
		if (a == null) {
			return null;
		}
		
		if(a.length == 0) {
			return "[]";
		}
		
		String b = "["; 
		
		for(int i = 0; i < a.length; i++) {
			b += a[i];
			if (i == a.length-1) {
				b+= "]";
				return b;
			}
			b += ", ";
		}
		return b;
	}
		
	
}
