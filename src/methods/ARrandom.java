package methods;
import java.util.Arrays;
import java.util.Random;

public class ARrandom {
    public static void main(String[] args) {
        System.out.println(Arrays.toString((createRandomArray(10,100))));
    }

    public static int[] createRandomArray(int size, int bound) {
        int[] arr = new int[size];
        Random randomc = new Random();
        for (int i = 0; i < size; i++) {
            int ran = randomc.nextInt(bound);
            arr[i] = ran;
        }

        return arr;
    }
}