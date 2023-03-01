package btngay1thg3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int[] array;
        int number = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("độ dài mảng " + number + " phần tử");
        array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhập giá trị phần tử " + i);
            array[i] = sc.nextInt();
            tinhnhan(array,number);
        }
    }

    private static void tinhnhan(int[]array,int number) {
        int tich = 1;
        for (int i = 2; i < array.length; i++) {
            tich = array[2] * array[4]* array[9];

        }
        System.out.println("kết quả hàm tích 2 4 9 là: " + tich);
    }

    }

