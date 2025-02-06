package thread.ex02;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		
		for(int i = 1; i <=10; i++) {
			System.out.println(getName() + ", "+i);
			
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
