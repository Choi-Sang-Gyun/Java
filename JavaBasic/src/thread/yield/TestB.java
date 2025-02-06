package thread.yield;

public class TestB implements Runnable {
	
	public void run() {
		while(true) {
			System.out.println("스레드 B가 실행중");

			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	
	
}
