import java.util.Scanner;
//ushtrmi 3

class Main {

  public static void main (String [] args) {
    
    Scanner scanner = new Scanner(System.in);

      System.out.println("Piket e provimit ?");
        int p = scanner.nextInt();//marim inputin nga useri

        //if statement
        if(p >=90 && p <=100){
             System.out.println("10");
        }else if(p >=80 && p <90) {
             System.out.println(9);
        }else if(p >=70 && p <80) {
             System.out.println(8);
        }else if(p >=60 && p <70) {
             System.out.println(7);
        }else if(p >=50 && p <60){
             System.out.println(6);
        }
        else if(p >=40 && p <50) {
             System.out.println("E kaluat provimin.");
        }
        else if(p <40){
             System.out.println("Ju nuk kaloni provimin.");
        }
        else {
             System.out.println("Te dhenat duhen te sakta!");
        }
   }

}
