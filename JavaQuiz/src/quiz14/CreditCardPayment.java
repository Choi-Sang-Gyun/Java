package quiz14;

public class CreditCardPayment implements Payment {
	
	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 [" + amount + "]원을 결제합니다.");
	}

	@Override
	public boolean validatePaumentDetails(String details) {
		
		int a = details.length();
		
		if (a == 16) {
			System.out.println("카드번호 16자리가 맞습니다");
			return true;
		} else {
			System.out.println("카드번호 16자리가 아닙니다");
			return false;
		}
		
//		return details.length() == 16;
		//길이가 16이면 true 아니면 false 반환이란 뜻
		
	}
}
