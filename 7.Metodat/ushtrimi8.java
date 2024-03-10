import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep nje numer");
        int nr = scanner.nextInt();

        System.out.println("Numri " +nr +" ka " +shifra(nr) +" shifra.");
    }

    static int shifra (int nr) {
        int cnt = 0;

        while(nr > 0) {
            nr = nr / 10;
            cnt++;
        }

        return cnt;
    }
}
