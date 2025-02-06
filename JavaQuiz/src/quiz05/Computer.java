package quiz05;

public class Computer extends Calculator {

	double circle(int a) {
		pi=a*a*Math.PI;
		return pi;
		}

	double rect(double a) {
		double b=a*a;
		return b;
	}
	
	double rect(double a, double b) {
		double c=a*b;
		return c;
	}
	
	double rect(double a, double b, double c) {
		double d=a*b*c;
		return d;
	}
	
}
