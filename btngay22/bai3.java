package btngay22;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array ;
        System.out.print("nhập độ dài mảng :");
        int number = sc.nextInt();
        array = new int [number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử " + i);
            array[i] = sc.nextInt();
        }
        for (int b:array
        ) {
            System.out.println("các phần tử mảng " + b);
        }
        }
    }

