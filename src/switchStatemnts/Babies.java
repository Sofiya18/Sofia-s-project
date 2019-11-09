package switchStatemnts;

import java.util.Scanner;

public class Babies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of babies");
        int numberOfBabies = scanner.nextInt();


        switch(numberOfBabies){
            case 0:
                System.out.println("Sorry");
                break;
            case 1:
                System.out.println("Good for you");
                break;
            case 2:
                System.out.println("Wow twins");
            case 3:
                System.out.println("Wow triples");
            case 4:
            case 5:
            case 6:

        }


    }
}
