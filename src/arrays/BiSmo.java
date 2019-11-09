package arrays;

import java.util.Arrays;

public class BiSmo {
    public static void main(String[] args) {
        int[] nums ={31,20,25,20,3,48,26,12};
        int max =nums[0];
        int min=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
          if(num<min){
              min=num;
          }

        }
        Arrays.sort(nums);
        System.out.println(max );
        System.out.println(min);
    }
}
