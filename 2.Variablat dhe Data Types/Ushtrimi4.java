import java.util.Scanner;

class Main {//deklarimi i klases

     public static void main (String [] args){ //deklarimi i metodes kryesore

         Scanner input = new Scanner(System.in);

         System.out.println("Insert a: ");
         int a = input.nextInt();
         System.out.println("Insert b: ");
         int b = input.nextInt();

         int prodhimi = a * b;

         System.out.println(a +" * " +b +" = " +prodhimi);

     }

}
