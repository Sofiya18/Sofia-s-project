package arrays;
import java.util.Arrays;
public class AddTwoArrays {

    public static void main(String[] args) {
        int[] arrayOne = {3, 2, 6, 43, 7, 20};
        int[] arrayTwo = {2, 7, -10, 10,-5, 2,6};
        int[] sum = new int[arrayOne.length];

        for (int i = 0; i < arrayOne.length; i++) {

            sum[i] = arrayOne[i] + arrayTwo[i];

        }
        System.out.println(Arrays.toString(sum));
    }
}