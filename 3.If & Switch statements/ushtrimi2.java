import java.util.Scanner;
//ushtrimi 2
class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Sa vjec eshte Aleksi? ");
          int aleksAge = scanner.nextInt();

          System.out.println("Sa vjec eshte Katerina");
          int katerinasAge = scanner.nextInt();

          if(aleksAge > katerinasAge) {
               System.out.println("Aleksi eshte me i madh se Katerina");
          }

     }
}
