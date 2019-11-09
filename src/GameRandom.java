import java.util.Random;
import java.util.Scanner;

public class GameRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6);
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
switch (number){
    case 0:
        System.out.println("Wrong number");
        break;
    case 1:
        System.out.println("Try again");
        break;
     case 10:
         System.out.println("Good job");
         break;
}

    }
}
