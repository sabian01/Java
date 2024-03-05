 public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);
          
          //ushtrimi 4

          String[][] shportat = {
                  {"Molle", "Dardhe", "Pjeshke"},

                  {"Mango", "Luleshtrydhe", "Kiwi"},

                  {"Boronice", "Ananas"}
          };

          for (int r = 0; r < shportat.length; r++){
               System.out.print("Shporta" +(r+1) +": ");

               for (int c = 0; c < shportat[r].length; c++) {
                    System.out.print(shportat[r][c] +", ");
               }

               System.out.println();
          }

     }
