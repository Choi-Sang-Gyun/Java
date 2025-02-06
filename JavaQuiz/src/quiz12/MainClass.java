package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Shape r = new Rect("사각형", 2, 3);
		Shape c = new Circle("원", 4);
		
		System.out.println(r.getName());
		System.out.println(r.getArea());
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
		
		
	}
	
}
