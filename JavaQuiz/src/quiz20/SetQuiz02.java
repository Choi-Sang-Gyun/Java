package quiz20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz02 {

	public static void main(String[] args) {
		
		/*
		로또기기 당첨 시뮬레이터!
		
		{5, 23, 35, 7, 41, 13} 이 번호가 당첨 번호입니다.
		랜덤한 로또번호 6개를 생성해서, 당첨 번호와 일치하는지 확인합니다.
		몇 번의 시도 끝에 당첨되는지 계산하고, 소요된 비용을 출력하세요.
		로또 1회 구매 비용은 1,000원입니다.
		
		힌트)
		set이 요소가 동일한지 확인하는 메서드는 set.equals(set) 입니다
		*/
		
		Set<Integer> num = new TreeSet<>();
		Set<Integer> set = new TreeSet<>();
		long count = 0L;
		
		while(set.size() < 6) {
			int b = (int)(Math.random()*44)+1;
			set.add(b);
		}
		
		while(true) {
			while(num.size() < 6) {
				int a = (int)(Math.random()*44)+1;
				num.add(a);
				count++;
			}	
			
			if(set.equals(num)) {
				System.out.println("당첨입니다");
				break;
			} else {
				num.clear();
			}
		}
		System.out.println("당신의 로또 번호:" + num.toString());
		System.out.println(count + "회 로또를 구매하였고 " + count*1000 + "원을 사용하였습니다");
	
		//---------------------------------------------------//
		
		Integer[] arr = {5, 23, 35, 7, 41, 13};
		List<Integer> list = Arrays.asList(arr);
		
		Set<Integer> lotto = new TreeSet<Integer>(list); //초기값
		Set<Integer> winning = new TreeSet<>(); //당첨여부를 저장할 셋
		Random ran = new Random();
		int count2 = 0;
		
		while(true) {
			winning.add( ran.nextInt(45)+1 );
			
			if(winning.size() ==6) {
				count2++;
				if(lotto.equals(winning)) {
					break; // 당첨이니까 그만
				} else {
					winning.clear();
				}
				
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
