package Strings;

public class LowerUpper {
    public static void main(String[] args) {
        String word ="java";

        String fixed = word.substring(0,1).toUpperCase()+word.substring(1);
        System.out.println(fixed);
    String word2 = "Kevin fell from bike ";
    int from = word2.indexOf(" from");
    //int from2 .indexOf("from",from+1);
        String word3 = word2.substring(0,from);
        System.out.println(word3);
        System.out.println(word2.substring(from+1)+" "+word3);
    }
}
