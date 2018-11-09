package test;

public class ArrSortBinary {

	public static void main(String[] args) {
/*
Напишіть застосування, що виконує пошук заданого числа у
 відсортованому масиві — бінарний пошук
У випадку коли число знайдено виведіть на екран його позицію 
в масиві (позиції нумеруємо з нуля) або -1 в іншому випадку

*/
		int data[] = {3,6,10,34,56,60};
		//int data[] = {101, 21, 29, 31, 48, 55, 62, 63, 67, 71, 91};
		int numberToFind = 105;
		int firstNumb = data[0];
		int firstIndex;
		int lastNumb = data[data.length - 1];
		//if (firstNumb < lastNumb) {
			for (int i = 0; i < data.length; i++) {
				int val = data[i];
				firstIndex=0;
				if (val == numberToFind) {
					System.out.println(i);

				}
			}
		//}
		if (firstNumb > lastNumb) {
			for (int i=data.length-1;i>=0;i--) {
				int val = data[i];
				firstIndex=-1;
				if (val == numberToFind) {
					System.out.println(i+firstIndex);
				}
			}
		}
	}
}
/*Неправильно обрахований результат. Для набору 
 * вхідних параметрів [101, 21, 29, 31, 48, 55, 62, 63, 67, 71, 91] 
 * очікуваний результат: -1. Ваш результат: ''
 У тестовому наборі перший елемент - число, яке необхідно знайти
*/