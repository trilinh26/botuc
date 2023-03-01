package btngay1thg3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int[] array;
        int number = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("độ dài mảng " + number + " phần tử");
        array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhập giá trị phần tử " + i);
            array[i] = sc.nextInt();
        }
    }
    }

