   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numrat =  {4, 6, 7, 20, 3, 2, 1};


        boolean uGjet = false;
        for (int i = 0; i < numrat.length; i++){
           if (numrat[i] == 5){
               System.out.println("Numri 5 u gjet!");
               uGjet = true;
           }
        }

        if (uGjet == false) {
            System.out.println("Numri nuk ekziston ne kete array!");
        }

        
    }
