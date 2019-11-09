package practice1.Loops;
import java.util.Scanner;
public class WhaleLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1500;
        int transBalance;
        int dec = 0;
        while (balance > 0) {
            System.out.println("Enter the transaction amount");
            transBalance = scanner.nextInt();

            if (transBalance <= balance) {
                System.out.println("Item purchase");
                balance -= transBalance;
               dec=0;
            } else {
                System.out.println("Card decline");
                dec++;

            }
            if (dec == 3) {
                System.out.println("Card is looked");
               break;
            }


        }
    } }