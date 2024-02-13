import java.util.Scanner;

class Main {//deklarimi i klases

     public static void main (String [] args){ //deklarimi i metodes kryesor
         Scanner input = new Scanner(System.in);

         System.out.println("Insert name:");
         String emri = input.nextLine();

         System.out.println(emri.toUpperCase());
     }

}
