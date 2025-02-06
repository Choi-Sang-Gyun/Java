package quiz05;

public class Calculator {

	int result = 0;
	double pi = 0.0;
	
	int add(int a) {
		result += a;
		return result;
		}
	
	int sub(int a) {
		result -= a;
		return result;	
		}
	
	double circle(int a) {
		pi = a*a*3.14;
		return pi;
		}
	
}
