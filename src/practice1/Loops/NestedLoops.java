package practice1.Loops;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i is" +i);
            for (int j = 0; j < 5; j++) {
                System.out.println("j is"+j);

            }
            System.out.println();
        }
    }
}