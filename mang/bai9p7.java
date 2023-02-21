package mang;

public class bai9p7 {
    public static void main(String[] args) {
        int  [] rong = new int[7];
        forDataInArraysWithForLoop(rong);
        foreachDataInArraysWithForeachLoop(rong);
    }

    private static void foreachDataInArraysWithForeachLoop(int[] arrays) {
        for (int name:arrays
        ) {
            System.out.println(name);
        }
    }

    private static void forDataInArraysWithForLoop(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
