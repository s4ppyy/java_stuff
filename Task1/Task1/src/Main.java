/**
 * @author Daniil Svatanenko
 * @version 1.1
 */

public class Main {
    public static void Task3(){
        for (int i = 97; i < 123; i++){
            System.out.println((char) i + " ");
        }
    }

    public static void Task4(){
        long begin = new java.util.Date().getTime();
        int i = 0; // change to long
        while (i < 100000000){
            i++;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end - begin + "\n");
    }

    public static void Task5() {
        int[][] array = new int [3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting project\n");
        int a = 2147483647;
        short b = 32767;
        long c = 999999;
        float d = 3.4F;
        double e = 4.9;
        char f = 'c';
        byte g = 127;
        boolean h = true;
        System.out.println("This is int: " + a + "\n");
        System.out.println("This is short: " + b + "\n");
        System.out.println("This is long: " + c + "\n");
        System.out.println("This is float: " + d + "\n");
        System.out.println("This is double: " + e + "\n");
        System.out.println("This is char: " + f + "\n");
        System.out.println("This is byte: " + g + "\n");
        System.out.println("This is boolean: " + h + "\n");
        byte v_byte=120;
        short v_short=129;
        char v_char='a';
        int v_int=65999;
        long v_long=429496729;
        float v_float=0.33333334F;
        double v_double=0.3333333333333333;
        boolean v_boolean=true;
        Task3();
        System.out.print("\n");
        Task4();
        int[] arr = {1, 1234, 43, 24, 56, 23};
        int max = arr[0];
        for (int findMax: arr) {
            if (max < findMax)
                max = findMax;
        }
        System.out.println(max + "\n");
        Task5();
    }
}