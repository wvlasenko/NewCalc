package test;

public class ArrSortBinary {

	public static void main(String[] args) {
/*

�������� ������������, �� ������ ����� �������� ����� 
� ������������� ����� � ������� �����
� ������� ���� ����� �������� ������� �� ����� 
���� ������� � ����� (������� �������� � ����) ��� -1 � ������ �������
*/
		int data[] = {101, 21, 29, 31, 48, 55, 62, 63, 67, 71, 91};
		int numberToFind = 101;
		int firstNumb = data[0];
		int firstIndex;
		int lastNumb = data[data.length - 1];
		if (firstNumb < lastNumb) {
			for (int i = 0; i < data.length; i++) {
				int val = data[i];
				firstIndex=0;
				if (val == numberToFind) {
					System.out.println(i+firstIndex);

				}
			}
		}
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
/*����������� ����������� ���������. ��� ������ ������� ��������� [101, 21, 29, 31, 48, 55, 62, 63, 67, 71, 91] ���������� ���������: -1. ��� ���������: ''
� ��������� ����� ������ ������� - �����, ��� ��������� ������
*/