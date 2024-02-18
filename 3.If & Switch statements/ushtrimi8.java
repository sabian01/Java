class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Jep nje numer: ");
          int nr = scanner.nextInt();

          if(nr%2 == 0){
               System.out.println("Numri eshte cift.");
          }else {
               System.out.println("Numri eshte tek");
          }

     }

}
