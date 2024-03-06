 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep numrin e rreshtave: ");
        int rreshta = scanner.nextInt();

        System.out.println("Jep numrin e kolonave: ");
        int kolona = scanner.nextInt();


        int[][] numra = new int[rreshta][kolona];


        int shuma = 0;
        int[] shumaPerRresht = new int[rreshta];
        double[] mesPerRresht = new double[rreshta];
        for (int r = 0; r < rreshta; r++){
            System.out.println("Jep elementet e rreshtit " +r);
            for (int c = 0; c < kolona; c++){
                numra[r][c] = scanner.nextInt();
                shuma = shuma + numra[r][c];
                shumaPerRresht[r] = shumaPerRresht[r] + numra[r][c];
            }
            mesPerRresht[r] = shumaPerRresht[r]/numra[r].length;
        }


        System.out.println(Arrays.deepToString(numra));

        System.out.println("Shuma totale e elementeve eshte : " +shuma);

        for (int r = 0; r < rreshta; r++){

            System.out.println("Mesatarja , rreshti " +r +" = " +mesPerRresht[r]);
        }
        
    }
