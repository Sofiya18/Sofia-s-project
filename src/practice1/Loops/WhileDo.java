package practice1.Loops;
import java.util.Random;
import java.util.Scanner;
import java.util.RandomAccess;
public class WhileDo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();
        int mun = random.nextInt(100)+1;
        int guess =0;
        int count =0;
        do {

            System.out.println("Guess number ");
          // guess = Scanner.nextLine();
            mun++;
        } while (mun != guess );
    }
}


