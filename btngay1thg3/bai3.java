package btngay1thg3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] array;
        int number = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("độ dài mảng " + number + " phần tử");
        array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhập giá trị phần tử " + i);
            array[i] = sc.nextInt();
            tinhtong(array, number);
        }
    }

    private static void tinhtong(int[] array, int number) {

        int sum = 0;
        for (int i = 1; i < number; i += 2) {
            if (array[i] == 6) {
                continue;
            }
            sum = sum + array[i];

        }
        System.out.println("tổng các phần tử thứ 1 3 7 9 trong mảng : " + sum);
    }
}