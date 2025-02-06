package day04;

public class BreakEx03 {

	public static void main(String[] args) {
		
//		//탈출을 위한 변수
//		//고전적인 방법
//		boolean bool = false;
//		
//		for(char u = 'A'; u <= 'Z'; u++) {
//			
//			for (char l = 'a'; l <='z'; l++) {
//				
//				System.out.println(u + "-" + l);
//				
//				if(l =='c') {
//					bool = true;
//					break;
//				}
//				
//			}
//			
//			if(bool) break;
//			
//		}
		
		
		//탈출을 위한 변수
			boolean bool = false;
				
		start:for(char u = 'A'; u <= 'Z'; u++) {
					
				for (char l = 'a'; l <='z'; l++) {
						
					System.out.println(u + "-" + l);
						
					if(l =='c') break start;
					}
						
				}
					
			}
		
		
		
		
		
		
	}


