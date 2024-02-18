class Main {

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);


          System.out.println("Shuma e blerjeve: ");
          double shuma = scanner.nextInt();

          double fatura = shuma;


          if(shuma >= 300) {
               fatura = fatura - (shuma * 0.1);
          }

          System.out.println("Fatura eshte " +fatura +" Ju kursyet " +(shuma*0.1));
     }

}
