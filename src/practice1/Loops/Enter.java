package practice1.Loops;
import java.util.Scanner;
public class Enter {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int g = 0; g <= i; g++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}