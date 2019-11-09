package methods.overLoading;

public class DataTypePromotions {

    public static void main(String[] args) {
        byte a =1;
        calc (a);

    }
    public static void calc (int i){
        System.out.println("using int");

    }
    public static void calc (double d){
        System.out.println("using double");
    }
    public static void calc (float f){
        System.out.println("using float");

    }
}
