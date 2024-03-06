public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

         
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
