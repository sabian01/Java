import java.util.Scanner;
//ushtrimi 4

class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Sa eshte konsumi ne kilowat/ore? ");
          int kwh = scanner.nextInt();
          final double kwDollar = 0.12;
          final double taksa  = 0.05;
          double fatura = kwh * kwDollar;


          if(kwh > 500) {
               fatura = fatura + (fatura * taksa);
          }

          System.out.println("Fatura eshte: " +fatura);


     }

}
