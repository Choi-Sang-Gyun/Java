package day10.inter.basic2;

public class PetHouse {

	//매개변수 펫 타입을 받아서, 매개변수에 따라서, 알맞은 형변환을 진행하는 메서드
	public static void carePet(IPet pet) {
		
		
		if(pet instanceof Dog ) {
			Dog d = (Dog)pet;
			d.eat();
			d.play();
			
		} else if(pet instanceof Cat ) {
			Cat c = (Cat)pet;
			c.eat();
			c.play();
			
		} else if(pet instanceof GoldFish ) {
			GoldFish g = (GoldFish)pet;
			g.swim();
			g.play();
			
		}
		
	}
	
	
}
