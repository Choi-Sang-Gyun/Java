package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사");
		Sorceress s1 = new Sorceress("마법사");
		
		w1.attack(s1);
		
		s1.info();
		w1.info();
		
		Player[] arr = {w1, s1}; //플레이어 배열에 전사,마법사가 들어갈 수 있음
		s1.blizzard(arr);
		
		s1.info();
		w1.info();
		
		
		
	}
}
