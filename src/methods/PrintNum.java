package methods;

public class PrintNum {
    public static void main(String[] args) { int[] arr2 = {-1, 3, -4, -2, 32, 2, -23, 1};
        printNegativeNumbers(arr2);
    }


    private static void printNegativeNumbers(int[] arr) {

    for(int num: arr){
        if(num<0){
            System.out.println(num);
        }

    }
}
}