package mang;

public class bai9p5 {
    public static void main(String[] args) {
        String [] chuoi = {"di", "nh", "hu", "ou", "wg"};
        forDataInArraysWithForLoop(chuoi);
        foreachDataInArraysWithForeachLoop(chuoi);
    }

    private static void foreachDataInArraysWithForeachLoop(String [] arrays) {
        for (String name : arrays
        ) {
            System.out.println(name);
        }
    }
        private static void forDataInArraysWithForLoop(String[]arrays){
            for (int i = 0; i < arrays.length; i++) {
                System.out.println(arrays[i]);
            }
        }
    }
