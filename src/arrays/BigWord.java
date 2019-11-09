package arrays;

import java.io.OptionalDataException;
import java.util.Arrays;

public class BigWord {
    public static void main(String[] args) {
        String  bigWord = "Write program that creates a group size thisisabigword";
        String [] arr =bigWord.trim().split(" ");
        int biggestLength=0;
        for(String word: arr){
            if(word.length()>biggestLength){
                biggestLength=word.length();
            }
        }
       for(String word: arr) {
           if(word.length()==biggestLength){
               System.out.println(word);
           }
       }
    }




//
//String str = "Java is programming /;
  //  String [] regular = str.trim().toLowerCase().split(" ");
  //  char [] charArr = str.toCharArray();
     //   System.out.println(Arrays.toString(charArr));
      //  System.out.println(Arrays.toString(regular));

}
