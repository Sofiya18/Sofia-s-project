package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class BookLib {
    public static void main(String[] args) {

        String [] books={"novel","story","poem","detective","drama"};
        Arrays.sort(books);
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the book you want to replace ");
        String book = input.nextLine();
        int index =Arrays.binarySearch(books,book);
        if (index>=0){
            System.out.println("What book will you replace " + book + " with");
            String newBook =input.nextLine();
            books[index]=newBook;

        }else{
            System.out.println("Book not found");
        }
        System.out.println(Arrays.toString(books));

        }


    }

