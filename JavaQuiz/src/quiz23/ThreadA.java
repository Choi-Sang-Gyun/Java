package quiz23;

public class ThreadA implements Runnable{
//음악재생
	@Override
	public void run() {
		
		System.out.println("음악을 15초간 재생합니다");
		for(int i = 1; i<=15; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("음악 재생이 끝났습니다");
	}

	
	
	
}
