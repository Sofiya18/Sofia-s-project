package practice1;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean check;
        int time;
        System.out.println("Enter the time you are checking");
        time = scanner.nextInt();
        if (time >= 8 && time <= 23) {
            check = true;

        } else {
            check = false;
        }

        if (check) {

            System.out.println("Campus is open");
        }else{
            if(time <0||time >24) {
                System.out.println("Invalid time");
            }else{
                System.out.println("Campus is closed");
            }



        }


    }



}
