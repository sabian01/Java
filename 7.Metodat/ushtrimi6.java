class Main {
     //ushtrimi6

     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in);

          int[] arr =  { 7, 10, 34, 4, 2, 20 ,22};

          maxVal(arr);



     }

   public static void maxVal (int[] arr){
          int max = arr[0];
          for (int i = 0; i < arr.length; i++){
               if (max < arr[i]){
                    max = arr[i];
               }
          }

        System.out.println("Vlera maksimale: " +max);

   }



}

