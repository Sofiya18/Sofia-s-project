package practice1.Loops;
import java.util.Scanner;
public class ViewLoops {
    public static void main(String[] args) {
        String word = "Cybertek";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'b') {
                System.out.println();
                String s = word.charAt(i) + "";
            }
        }
    }
}
