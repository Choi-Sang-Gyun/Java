package api.lang.system;

import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class SystemEx {

	public static void main(String[] args) {
		
		//다양한 윤영체제의 정보를 확인할 수 있음
//		Properties properties = System.getProperties();
//		System.out.println(properties);
		
	
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum += i;
			
		}
		
		
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		
		
	}
}
