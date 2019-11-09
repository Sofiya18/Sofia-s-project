import java.util.Random;
import java.util.Scanner;
public class GuessRam {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner input = new Scanner(System.in);

        int randomNumber =random.nextInt(10);
        randomNumber++;//this is how I get the range to be 1-10

        System.out.println("Guess a number");


    }
}
