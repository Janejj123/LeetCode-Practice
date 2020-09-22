package practiceCode;

import java.util.Arrays;

public class NextPermutation31<reverseSort> {

    public static void main(String[] args) {
        int[] res = new int[7];
        res[0] = 3;
        res[1] = 2;
        res[2] = 4;
        res[3] = 5;
        res[4] = 8;
        res[5] = 7;
        res[6] = 3;

        NextPermutation31 test = new NextPermutation31();
        res = test.nextPermutation(res);
        System.out.println(Arrays.toString(res));
    }

     int[] nextPermutation(int[] num) {
        int n = num.length;
        if (n < 2)
            return null;
        int index = 0;
        for (int i = n - 1; i > 0; i--) {
            if (num[i - 1] < num[i]) {
                index = i - 1;
                break;
            }
        }
        if (index == 0) {
            reverseSort(num, 0, n - 1);
            return num;
        } else {
            for (int i=n-1; i > index; i--) {
                if (num[i] > num[index]) {
                    swap (num, i, index);
                    break;
                }
            }
            reverseSort(num, index + 1, num.length - 1);
        }
        return num;
    }

        void reverseSort(int[] array, int begin, int end) {
            for (int i = 0; i <= (end - begin) / 2; i++) {
                swap(array, begin + i, end - i);
            }
        }

        void swap(int[] array, int a, int b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
}
