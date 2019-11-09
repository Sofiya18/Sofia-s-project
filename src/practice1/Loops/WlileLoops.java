package practice1.Loops;
import  java.util.Scanner;
public class WlileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your address");
        String address = scanner.nextLine();
        int count=0;
        while (address.contains("il")){
            count ++;
            System.out.println("enter your address");
            address =scanner.nextLine();
        }
        System.out.println(count);
    }
}
