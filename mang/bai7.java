package mang;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrNumber = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("nhap vao phan tu : " + i);
            arrNumber[i] = input.nextInt();

        }
        for (int i = 0; i < 7; i++) {
            System.out.println(arrNumber[i]);
        }

    }}
