package thread.ex01;

public class ThreadTest implements Runnable {

	//1.runable 인터페이스를 상속받아서 사용하는 방법
	
	int num = 0;
	
	@Override
	public /*synchronized*/ void run() {
		//침범하지 못하게 한다 - 해당 객체가 사용될때, 다른 곳에서 호출 할 수 없습니다
		
		for(int i =1; i <= 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				num++;
			}
			
			
			System.out.println(Thread.currentThread().getName() + ", num값:" + num);
			
			//일시정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}

	
	
}
