import java.util.Scanner;

class Main {//deklarimi i klases

     public static void main (String [] args){ //deklarimi i metodes kryesore
         //deklarimi i objektit Scanner
         Scanner input = new Scanner(System.in);


         System.out.println("a = ? ");
         double a = input.nextDouble();//marja e inputit nga useri

         System.out.println("b = ? ");
         double b = input.nextDouble();//marja e inputit nga useri

         double mbledhja = a + b;
         double zbritje = a - b;
         double prodhim = a * b;
         double pjestim = a / b;

         //Output
         System.out.println("a + b = " +mbledhja);
         System.out.println("a - b = " +zbritje);
         System.out.println("a * b = " +prodhim);
         System.out.println("a / b = " +pjestim);


     }

}
