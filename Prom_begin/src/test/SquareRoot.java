package test;

public class SquareRoot {

	public static void main(String[] args) {
		double a = 0;
		double b = 10;
		float c = 0;
		double x1;
		double x2;
		double D;
	
		D = b * b - 4 * a * c;
		if ((D > 0)&&(a!=0)&&(b!=0)) {
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		} else if ((D == 0)??(a==0)){
			double x = -b/(2*a);
			
			System.out.println("x1="+x);
			System.out.println("x2="+x);{
		
			}
			
		} else {
			System.out.println("x1 ="+"");
			System.out.println("x2 ="+"");
		}
	}
}