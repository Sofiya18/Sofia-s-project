package practice1.Loops;
import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 1) {

               System.out.println(i);
            } else {

                System.out.println("Even number here");
           }

        }
    }
}