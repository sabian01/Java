public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep nje numer pozitiv: ");
        int nr = scanner.nextInt();


        for (int i = 1; i <= 10; i++){
            System.out.println(nr +" x " +i +" = " +nr*i);
        }


    }
