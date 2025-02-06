package quiz14;

public class PayPalPayment implements Payment {

	static private String PIN = "1234";
	
	
	@Override
	public void pay(int amount) {
		System.out.println("PayPal로 [" + amount + "]원을 결제합니다.");
	}

	@Override
	public boolean validatePaumentDetails(String details) {
		if(details.equals(PIN)) {
			System.out.println("PIN번호가 맞습니다");
			return true;
		} else {
			System.out.println("PIN번호가 틀립니다");
			return false;
		}
	}
}
