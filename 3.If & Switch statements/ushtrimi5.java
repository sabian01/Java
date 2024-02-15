import java.util.Scanner;
//ushtrimi 5

class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Zgjidh diten e javes: ");
          System.out.println("Shkruaj 1 per diten e hene");
          System.out.println("Shkruaj 2 per diten e marte");
          System.out.println("Shkruaj 3 per diten e merkure");
          System.out.println("Shkruaj 4 per diten e enjte");
          System.out.println("Shkruaj 5 per diten e premte");
          System.out.println("Shkruaj 6 per diten e shtune");
          System.out.println("Shkruaj 7 per diten e djele");
          int d = scanner.nextInt();

          
          switch (d) {
               case 1:
                    System.out.println("E hene");
                    break;
               case 2:
                    System.out.println("E marte");
                    break;
               case 3:
                    System.out.println("E merkure");
                    break;
               case 4:
                    System.out.println("E enjte");
                    break;
               case 5:
                    System.out.println("E premte");
                    break;

               case 6:
                    System.out.println("E shtune");
                    break;
               case 7:
                    System.out.println("E djele");
                    break;

               default:
                    System.out.println("Komanda nuk eshte e sakte");
          }


     }

}
