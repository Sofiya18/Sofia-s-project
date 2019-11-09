package methods.overLoading;

public class Loading {

    public static void main(String[] args) {
        jump( 6);
        jump();
        jump(5);
        String []arr ={"d"};
    }
    public static void jump(){
        System.out.println("You don't get far");
    }
    public static void jump(String shoes ){
        System.out.println("The shoes made you go farther ");
    }

    public static void jump (int distance ) {

        System.out.println("You jumped "+distance);
    }
    public static String jump ( String [] arr){
        return "jumped by array ";
    }
    public static String jump (int [] arr){
        return "Jumped by array";
    }
}
