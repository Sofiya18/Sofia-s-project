package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
        String[] student = new String[7];

        System.out.println(Arrays.toString(student));

        student[0] = "James";
        student[1] = "Sam";
        student[2] = "Adam";
        student[3] = "Elize";
        student[4] = "Jamie";
        student[5] = "Benzema";
        student[6] = "Sandy";

        for (int i = 0; i < student.length; i++) {
            int last = student[i].length() - 1;
            System.out.println(student[i].charAt(last));

        }

        System.out.println();

        for(int i=0; i<student.length;i++){
            if (student [i].toLowerCase().endsWith("s")){
                System.out.println(student[i]);

            }
        }

        System.out.println();
        for(int i=0; i<student.length;i++){
            if (student[i].toLowerCase().contains("s")){

            }
            System.out.println();

            System.out.println("Enter a string");

            Scanner input = new Scanner(System.in);
            String user = input.nextLine();
            for(i = 0; i<student.length; i++){
                if( student[i].toLowerCase().contains(user)){
                    System.out.println(student[i]);
                }
            }
        }
    }
}










