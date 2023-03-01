package btngay24;

import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        int[] src = {0 , 11, 22, 33, 44, 55, 66, 77, 88, 99};
        checknhonhat(src);
    }

    public static int checknhonhat(int[] src) {
        int min = src[0]; // gắn min gt nho nhat duyet mang tu vi tri t2 moi lan duyet kiem tra gt nho nhat co lon gt i thi gan gt nho nhat bang phan tu  i

        for (int i = 0; i < src.length; i++) {
            if (min > src[i]) {
                min = src[i];
            }
        }
        return min;
    }

}