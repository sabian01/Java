
import java.util.Scanner;

class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Jep nje numer: ");
          int nr = scanner.nextInt();

          System.out.println("Rrenja katrore e " +nr +" eshte " +Math.sqrt(nr));

     }

}
