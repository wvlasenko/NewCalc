
package test;

public class SwitchTest {

	public static void main(String[] args) {
		String test ="Hello";
		
		switch (test) {
		case "Hello":
			System.out.println(1);
			break;
		case "World":
			System.out.println(2);	
			default :
				System.out.println(3);
		}

	}

}
