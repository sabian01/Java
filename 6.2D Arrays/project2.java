public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          //Program 2 pastaj , vazhdo me project 1 kalkulo
          //xhiro ditore me te ulet per kamarier
          /**Project 2
           * -- Bar & Restorant --
           * Nje restorant ka 3 kamariere, Krijo nje program ne java
           * i cili kalkulon shumen totale te xhiros javore dhe vleren
           * mesatare per xhiro ne dite per secilin nga kamarieret.
           * Ne fund progami duhet te gjej kush eshte kamarieri me efficent.
           *
           * Xhiro per kamarier:
           *
           * Kamarieri 1:  75,  200 ,90, 125, 60, 140, 80
           *
           * Kamarieri 2: 170, 130, 400,  90, 120 , 315, 600
           *
           * Kamarieri 3: 100, 95, 320, 115, 120, 98, 250
           * */

          int[][] kmr = {
                  {75, 200, 90, 125, 60, 140, 80},

                  {170, 130, 400, 90, 120, 315, 600},

                  {100, 95, 320, 115, 120, 98, 250}
          };

          int[] kmrTotal = new int[3];
          int[] kmrMes = new int[3];


          for (int r = 0; r < kmr.length; r++){

               for (int c = 0; c < kmr[r].length; c++){
                    kmrTotal[r] = kmrTotal[r] + kmr[r][c];
               }

               kmrMes[r] = kmrTotal[r]/7;
               System.out.println("Kamarieri " +(r+1) +" Xhiro Javore = " +kmrTotal[r] +", mesatarja = " +kmrMes[r]);

          }


     }
