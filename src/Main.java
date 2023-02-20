import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
        task3();
        task4();
    }
    public static void task () {
        System.out.println("Задача 1");
        int[] intArr = new int[]{1, 2, 3,};
        double[] dArr = new double[]{1.57, 7.654, 9.986};
        byte[] byteArr = new byte[3];
        byteArr[0] = 10;
        byteArr[1] = 73;
        byteArr[2] = 45;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
            if (i != intArr.length - 1) {
                System.out.println(",");
            }
        }
        for (int i = 0; i < dArr.length; i++) {
            System.out.println(dArr[i]);
            if (i != dArr.length - 1) {
                System.out.println(",");
            }
        }
        for (int i = 0; i < byteArr.length; i++) {
            System.out.println(byteArr[i]);
            if (i != byteArr.length - 1) {
                System.out.println(",");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
            int[] intArr = new int[]{1, 2, 3,};
            double[] dArr = new double[]{1.57, 7.654, 9.986};
            byte[] byteArr = new byte[3];
            byteArr[0] = 10;
            byteArr[1] = 73;
            byteArr[2] = 45;
            for (int i = intArr.length - 1; i >=0; i--) {
                System.out.println(intArr[i]);
                if (i != 0) {
                    System.out.println(",");
                }
            }

            for (int i = dArr.length -1; i >= 0; i--) {
                System.out.println(dArr[i]);
                if (i != 0) {
                    System.out.println(",");
                }
            }
            for (int i = byteArr.length -1; i >= 0; i--) {
                System.out.println(byteArr[i]);
                if (i != 0) {
                    System.out.println(",");
                }
            }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] intArr = new int[]{1, 2, 3};
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] % 2 != 0) {
                intArr[i]++;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}