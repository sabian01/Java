class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep vleren a:");
        int a = scanner.nextInt();

        System.out.println("Jep vleren b:");
        int b = scanner.nextInt();

        System.out.println("Veprimi qe doni te kryeni?");
        System.out.println("Shkruaj 1 per mbledhje");
        System.out.println("Shkruaj 2 per zbritje");
        System.out.println("Shkruaj 3 per shumezim");
        System.out.println("Shkruaj 4 per pjestim");
        int vp = scanner.nextInt();


        System.out.println( calculator(a, b, vp));


    }

    public static double calculator(int a, int b, int vp){
        double result = 0;

        switch (vp) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                result = 0.0;
        }

        return result;

    }



}
