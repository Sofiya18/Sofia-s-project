package arrays;

import java.util.Arrays;

public class StoreAndRead {

    public static void main(String[] args) {
        int[]nums=new int[4];
        nums[0]=4;
        nums[1]=3;
        nums[2]=6;
        nums[3]=nums[0]+nums[1];
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(Arrays.toString(nums));
    }





}
