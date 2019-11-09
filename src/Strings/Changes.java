package Strings;

import java.util.Scanner;

public class Changes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String bad = scanner.nextLine()
        String bad = scanner.nextLine();

      String checked = bad;

      checked = checked.replace("idiot","smart");
      checked= checked.replace( "dumb","smart");
      checked=checked.replace("stupid","smart");

      System.out.println("Your message changed");



    }
}
