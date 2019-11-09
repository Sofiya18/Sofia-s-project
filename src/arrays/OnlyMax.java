package arrays;

import java.util.Arrays;

public class OnlyMax {

    public static void main(String[] args) {
        int[] num = {23, 1, 34, 3, 54, 54, 51, 54};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        String checked = " ";
            int count=0;
            for (int i = num.length - 1; i >= 0; i--) {
            if (!checked.contains(num[i] + "")) {
                checked+=num[i]+" ";
            }

            // int max = num[0];
            // int max1=num[0];

            // if(int )
        }
    }
}