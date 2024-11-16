import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Miresevini ne kete program!");
        System.out.println("----------------------------");

        System.out.println("Sa kamariera ka restoranti?");
        int nrKamariera = input.nextInt();
        input.nextLine();

        System.out.println("Vendos emrat per secilin kamarier:");
        String[] emrat = new String[nrKamariera];
        for (int i =0; i < nrKamariera; i++){
            System.out.println("Kamarieri1: ");
            emrat[i] = input.nextLine();
        }

        System.out.println("Vendos xhiron ditore per secilin kamarier:");
        int[][] xhiroDitore = new int[nrKamariera][7];
        for (int i = 0; i < nrKamariera; i++){
            System.out.println(emrat[i] +": ");
            for (int j = 0; j < 7; j++){
                System.out.println("Dita" +(j+1));
                xhiroDitore[i][j] = input.nextInt();
            }
        }


        int[] xhiroJavore = new int[xhiroDitore.length];
        double[] mesatarjaNeJave = new double[xhiroDitore.length];

        for (int i = 0; i < xhiroDitore.length; i++){
            for (int j = 0; j < xhiroDitore[i].length; j++){
                xhiroJavore[i] = xhiroJavore[i] + xhiroDitore[i][j];
            }

            mesatarjaNeJave[i] = xhiroJavore[i] / 7;
            System.out.println("Mesatarja javore per kamarierin me emrin " +emrat[i] +" eshte " +mesatarjaNeJave[i]);

        }



    }
}
