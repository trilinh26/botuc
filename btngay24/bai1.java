package btngay24;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int[] arrays = {11, 22, 33, 44, 55, 66, 77, 88, 99, 00};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhâp số");
        int number = sc.nextInt();
        checkarray(arrays,number);
    }

    private static void checkarray(int[] arrays, int number) {

        boolean so = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == number ) {
                System.out.println(" tồn tại" + number +"trong mảng");
                so = true;
                break;
            }
        }
        if (!so) {
            System.out.println(" ko ton tai" + number+"trong mảng");
        }
    }
}

