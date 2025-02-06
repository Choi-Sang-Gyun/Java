package quiz02;

public class Quiz02 {

	public static void main(String[] args) {
		
	Account account = new Account("홍길동", "abcd", 10000);
	
	account.deposit(2000);
	account.withDraw(10000);
	account.getBalance();
		
	}
}
