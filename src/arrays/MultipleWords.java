package arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String[] words ={"knife", "wooden spoons", "plates","cups" ,"folks","dishes","pan","pots"};
        for(int i =0; i<words.length;i++){
            if(words[i].trim().contains(" ")){
                System.out.println(words[i]);
            }
        }
    }
}

