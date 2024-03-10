import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep emrin tend");
        String emri = scanner.nextLine();

        ckemi(emri);
    }


    static void ckemi (String emri) {
        System.out.println("Ckemi " +emri +". ");
    }

}
