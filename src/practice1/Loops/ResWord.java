package practice1.Loops;
import java.util.Scanner;
public class ResWord {
    public static void main(String[] args) {

         Scanner scanner =new Scanner(System.in) ;
        System.out.println("Enter word");

         String word = scanner.nextLine();

          String rev = "" ;
          for(int i=word.length()-1;i>=0;i--){
              rev+=word.charAt(i);

          }
        System.out.println(rev);



        }

    }

