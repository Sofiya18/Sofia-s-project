package practice1.Loops;
import java.util.Scanner;
public class AskName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String name ;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your name"+(i+1));
            String name = scanner.nextLine();
            System.out.println(name);

        }
    }


}