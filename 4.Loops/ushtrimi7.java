public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep nje numer natyrore: ");
        int nr = scanner.nextInt();

        int faktorialNr = 1;

        System.out.print(faktorialNr);
        for (int i = 2; i <= nr; i++) {
            System.out.print(" x " +i);
           faktorialNr = faktorialNr * i;
        }

        System.out.println(" = " +faktorialNr);

    }
