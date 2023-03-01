package btngay24;

import java.util.Arrays;

public class bai4 {
    public static void main(String[] args) {
        int[] src = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        checksonguyento(src);
    }

    private static void checksonguyento(int[] src) {
        for (int i = 0; i < src.length; i++) {
            boolean check = true;
            while (i <= Math.sqrt(src.length)) {
                if (src.length % i == 0) {
                    check = false;
                } else {
                    if (check)
                        System.out.println(src + " is a prime");
                }
            }
        }
    }
}
