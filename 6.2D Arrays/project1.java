public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);


          /**Project 1
           * Kemi 3 shporta ,
           * secila shporte ka lloje te ndryshme frutash
           * Shporta1: Molle, Dardhe,Pjeshke
           * Shporta2: Mango, Luleshtrydhe, Kiwi
           * Shporta3: Boronice, Ananas
           *
           * Krijoni 3 shportat ne java dhe printojini ato ne conole
           * (Duke perdorur Array 2 dimensionale...
           * */

          String[][] shportat = {
                  {"Molle", "Dardhe", "Pjeshke"},

                  {"Mango", "Luleshtrydhe", "Kiwi"},

                  {"Boronice", "Ananas"}
          };

          for (int r = 0; r < shportat.length; r++){
               System.out.print("Shporta" +(r+1) +": ");
               System.out.print("{");
               for (int c = 0; c < shportat[r].length; c++) {
                    System.out.print(shportat[r][c] +", ");
               }

               System.out.println("}");

          }


     }
