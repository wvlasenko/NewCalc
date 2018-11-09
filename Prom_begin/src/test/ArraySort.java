package test;

public class ArraySort {

	public static void main(String[] args) {

		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
		int a, b, c;
		for (a = 1; a < length; a++)
		for (b = length - 1; b >= a; b--) {
        if (array[b - 1] > array[b]) {
        c = array[b - 1];
        array[b - 1] = array[b];
        array[b] = c;
		}
    }
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}