
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep numrin e dites: ");
        int dita = scanner.nextInt();


        switch (dita) {
            case 1:
                System.out.println("E hene");
                break;
            case 2:
                System.out.println("E marte");
                break;

            case 3:
                System.out.println("E merkure");
                break;
            case 4:
                System.out.println("E enjte");
                break;
            case 5:
                System.out.println("E premte");
                break;
            case 6:
                System.out.println("E shtune");
                break;
            case 7:
                System.out.println("E Djele");
                break;
            default:
                System.out.println("Error!");
        }

    }
