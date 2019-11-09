package practice1.Loops;
import java.util.Scanner;
public class ValidNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
       int firstNum =scanner.nextInt();
       int secondNum=scanner.nextInt();
       for(int i =firstNum; i<=secondNum;i++){
           int sum =0;
           double avg =secondNum-firstNum;
           sum +=i;

       }
        System.out.println("This is sum of "+firstNum+"to"+secondNum);
    }
}
