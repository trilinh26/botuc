package mang;

public class bai9p3 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
        forDataInArraysWithForLoop(arrays);
        foreachDataInArraysWithForeachLoop(arrays);
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
