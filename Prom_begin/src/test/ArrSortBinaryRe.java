package test;

public class ArrSortBinaryRe {

    public static void main(String[] args) {

        int data[] = {3, 6, 10, 34, 56, 60};
        int numberToFind = 10;
        int firstIndex;
        int countIndex = 0;

        for (int i = 0; i < data.length; i++) {
            int val = data[i];
            if (val == numberToFind) {
                countIndex++;

                if (countIndex > 0) {
                    firstIndex = 0;
                    System.out.println(i + firstIndex);
                }
            }
        }

        if (countIndex <= 0) {
            firstIndex = -1;
            System.out.println(firstIndex);
            //break;
        }

    }
}




