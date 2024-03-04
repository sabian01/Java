 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numrat =  {4, 6, 7, 20, 3, 2, 1};

        int vleraMax = numrat[0];
        int vleraMin = numrat[0];

        for (int i = 0; i < numrat.length; i++){
            if (vleraMax < numrat[i]){
                vleraMax = numrat[i];
            }

            if (vleraMin > numrat[i]){
                vleraMin = numrat[i];
            }
        }
        System.out.println("Vlera Max = " +vleraMax);
        System.out.println("Vlera Max = " +vleraMin);
        
    }
