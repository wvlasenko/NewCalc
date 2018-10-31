
package test;

public class ForTest {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			if (i == 3)
				break;
			if (i==1)
				continue;
			System.out.println(i);
		}

	}

}
