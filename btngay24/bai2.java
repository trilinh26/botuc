package btngay24;

import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
        int[] src = {00, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        checkarray(src);
    }

    public static void checkarray(int[] src) {

        for (int i = 0, j = src.length - 1; i < j; i++, j--) {

            int temp = src[i];
            src[i] = src[j];
            src[j] = temp;
        }

        System.out.println("phần tử đảo ngược "+src);
    }
}

