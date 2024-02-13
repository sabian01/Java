import java.util.Scanner;

class Main {//deklarimi i klases

     public static void main (String [] args){ //deklarimi i metodes kryesore

         Scanner input = new Scanner(System.in);

         System.out.println("Insert a: ");
         int a = input.nextInt();

         int siperfaqja = a * a ;

         System.out.println("Siperfaqja e katrorit me brinje " +a +" eshte " +siperfaqja);

     }
