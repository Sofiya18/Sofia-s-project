package methods;

public class Math {
    public static void main(String[] args) {
        System.out.println(calculator("*",3,4));
    }
    public static double calculator(String op,double one,double two){
      switch (op) {

          case "-":
              return one+two;
          case"+":
              return one-two;
          case"*":
              return one*two;
          case"/":
              return one/two;
          case"%":
              return one%two;
          default:
              System.out.println("invalid operation");
              return 0;







      }


    }
}
