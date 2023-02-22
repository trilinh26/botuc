package btngay22;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array ;
        System.out.print("nhập độ dài mảng :");
        int number = sc.nextInt();
        array = new int [number];

        double max=0;
        for (int i=0; i< number; i++){
            System.out.println("Nhập phần tử  " + i);
            array[i]= sc.nextInt();
        }
        for(int i=0; i< number; i++){
            System.out.println( "các phần tử mảng "+ array[i]);
        }
        for (double num: array) {
            if(max < num)
                max = num;
        }
        System.out.printf("Số lớn nhất của  mảng là:"+ max);
    }
    }

