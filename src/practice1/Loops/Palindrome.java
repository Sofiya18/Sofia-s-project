package practice1.Loops;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word;
        word = scanner.nextLine();
        String back ="";

        for(int i = word.length()-1;i>=0; i--){
            back+=word.charAt(i);
        }
        System.out.println(word);
        System.out.println(back);


        if(word.equals(back)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not palindrome");
        }
    }
}
