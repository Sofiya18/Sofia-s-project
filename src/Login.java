import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String validUser = "test";
        String validPass = "test123";

        System.out.println("Enter your username");
        String loginUser = scanner.nextLine();

        if (loginUser.equals(validUser)){
            System.out.println("Enter your password");
            String loginPass =  scanner.nextLine();

          //  if ()
        }


    }



}
