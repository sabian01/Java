 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numrat =  {4, 6, 7, 20, 3, 2, 1};

        int shuma = 0;


        for (int i = 0; i < numrat.length; i++){
           shuma = shuma + numrat[i];
        }
        System.out.println("Mesatarja = " +shuma/ numrat.length);


    }
