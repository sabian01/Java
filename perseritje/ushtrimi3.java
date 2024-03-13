 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr1 = 10;
        int nr2 = 7;

        int temp = nr1;

        nr1 = nr2;
        nr2 = temp;

        System.out.println("nr1 = "+nr1 +" nr2 = "+nr2);
    }
