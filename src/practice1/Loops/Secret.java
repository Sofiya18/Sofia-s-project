package practice1.Loops;

import java.util.Scanner;

public class Secret {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String password = "secret478";
        for(;;){
        System.out.println("Please enter your password");
        String userPass = scanner.nextLine();
        if (password.equals(userPass)){
            System.out.println("Welcome to your profile");
            break;
        }



        }
    }
}
