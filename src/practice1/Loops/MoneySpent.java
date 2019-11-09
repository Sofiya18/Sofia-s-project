package practice1.Loops;
import java.util.Scanner;
public class MoneySpent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i =0; i<=50; i++) {
            if(i%10==3){
             continue;
            }
            System.out.println(i);

        }
    }
}