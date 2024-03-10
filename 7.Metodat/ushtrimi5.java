import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        minNr(4 ,2, 7);
    }

    static void minNr (int nr1, int nr2, int nr3) {
        int minNr = nr1;

        if(minNr > nr2){
            minNr = nr2;
        }
        if (minNr > nr3){
            minNr = nr3;
        }

        System.out.println("minNr = " +minNr);
        System.out.println("Mesatarja = " +(nr1+nr2+nr3)/3);
    }




}
