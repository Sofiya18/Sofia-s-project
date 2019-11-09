package Strings;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String email = "";

        if (str1.length() >= 6 && str2.length() >= 6) {
            email = str1.substring(0, 4);
            email += str2.substring(str2.length() - 3);
            email += "cybertek.com";
            System.out.println(email);
        } else {
            System.out.println("invalid lengths");










      }
    }
}
