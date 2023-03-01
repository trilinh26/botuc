package btngay22;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("do dai mang");
        int number= sc.nextInt();
        array=new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhap so "+ i);
            array[i]= sc.nextInt();
        }
        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);

        }
        double max=0;

        for (int num:array
             ) {
            if ( max<num)
            max=num;
        }
        System.out.println(max);
        }
        }


