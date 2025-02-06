package quiz20;

public class Customer {

//	private String name = new String();
//	private int arrivalTime = 0;
//	int k = 0;
//	
//	
//	Customer() {
//		
//	}
//	
//	public Custo simulCus(int a) {
//		for (int i = 1; i <= a; i++) {
//			if(Math.random()*99+1 < 60) {
//				k++;
//				name = "Customer" + k;
//			
//			} else {
//				
//				System.out.println("손님x");
//			}
//		}
//		
//	}
	
	//멤버변수
	private String name;
	private int arrivalTime = (int)(Math.random()*3) +1;
	
	//생성자
	public Customer(String name) {
		this.name = name;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
