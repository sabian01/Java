 public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          //Ushtrimi 5

          int[][] numrat = new int[3][3];



          //Marja e vlerave nga useri
          for (int r = 0; r < numrat.length; r++){
               System.out.println("Jep numrat e rreshtit " +r);
               for (int c = 0; c < numrat[r].length; c++) {
                    numrat[r][c] = scanner.nextInt();
               }
          }


          //Shuma
          int shuma = 0;
          for (int r = 0; r < numrat.length; r++){

               for (int c = 0; c < numrat[r].length; c++) {
                   shuma = shuma + numrat[r][c];
               }
          }


          System.out.println(Arrays.deepToString(numrat));

          System.out.println("Shuma " +shuma);
          

     }
