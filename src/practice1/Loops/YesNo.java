package practice1.Loops;
import java.util.Scanner;
public class YesNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add 1");
        String check = scanner.nextLine();
        int number = 0;
        while (check.equals("yes") || check.equals("y")) {
       number++;
            System.out.println("would you like add 1");
            check= scanner.nextLine();

        }
        System.out.println("your number is"+number);
    }
}