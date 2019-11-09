package Strings;
import java.util.Scanner;
public class LoCatIon {
    public static void main(String[] args) {

      String str = "Cybertek located in Des Plains ";

      Scanner scanner = new Scanner(System.in);

      String word = scanner.nextLine();

      int index = str.indexOf(word);

        System.out.println(index);


    }
}
