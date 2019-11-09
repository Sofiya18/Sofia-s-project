package arrays;

public class ForEachExample {


    public static void main(String[] args) {
        int[] numbers = {4, 32, 6, 1, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

      for(int number : numbers)  {
            System.out.println(number);
        }

    }
}