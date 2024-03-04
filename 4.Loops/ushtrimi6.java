 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = new String("shembull@gmail.com");
        String pass = new String("123");

        System.out.println("Email:");
        String gjejEmail = scanner.nextLine();

        System.out.println("Password:");
        String gjejPass = scanner.nextLine();

        while (!email.equals(gjejEmail) ||  !pass.equals(gjejPass)){
            System.out.println("Emaili ose passwordi nuk eshte i sakte");
            System.out.println("Email:");
            gjejEmail = scanner.nextLine();

            System.out.println("Password:");
            gjejPass = scanner.nextLine();
        }


        System.out.println("Ju u loguat me sukses!");

    }
