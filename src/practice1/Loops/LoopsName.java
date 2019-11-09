package practice1.Loops;
import java.util.Scanner;

public class LoopsName {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String name = Scanner.nextLine();

        for (int i = 0; i < 15; i++) {
            System.out.println("Welcome " + name);

        }
    }
}