import java.util.Scanner;

class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          //HAPI 1: Marim input nga useri
          System.out.println("Numri 1: ");
          int nr1 = scanner.nextInt();
          System.out.println("Numri 2: ");
          int nr2 = scanner.nextInt();
          System.out.println("Numri 3: ");
          int nr3 = scanner.nextInt();

          //HAPI 2: Inicializojme variablen grt me vleren e nr1
          int grt = nr1;

          //HAPI 3: Gjejme numrin me te madh
          if(nr2 > grt) {
               grt = nr2;
          }
          if(nr3 > grt) {
               grt = nr3;
          }

          //HAPI 4: Printojme ne ekran
          System.out.println("Numri me i madh eshte " +grt);


     }

}
