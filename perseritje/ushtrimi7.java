 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numra = {
                {1, 2, 3},
                {4, 5, 6},
                {7,8, 9}
        };


        int shuma[] = new int[numra.length];

        for (int r = 0; r < numra.length; r++) {
            for (int c = 0; c < numra[r].length; c++){
                shuma[r] =shuma[r] + numra[r][c];
            }
            System.out.println("Shuma rreshti" +r +" = " +shuma[r]);
        }

    }
