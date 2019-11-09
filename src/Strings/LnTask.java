package Strings;
import java.util.Scanner;

public class LnTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message");
        String message = scanner.nextLine();

        if (message.isEmpty()){
            System.out.println("Message is empty");

        }
        else if(message.length()>=10){
            System.out.println("Message is good");
        }else {
            System.out.println("Message is too short");
        }
    }
}
