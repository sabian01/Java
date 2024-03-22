import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Part 1 could be krijo menu , with a for loop prompt the user.
        Menu[] menu = new Menu[10];
        menu[0] = new Menu("sallate jeshile", 500);
        menu[1] = new Menu("brusketi", 300);
        menu[2] = new Menu("supe", 400);
        menu[3] = new Menu("patate", 300);
        menu[4] = new Menu("salmon", 1200);
        menu[5] = new Menu("pasta", 1000);
        menu[6] = new Menu("rizoto", 9000);
        menu[7] = new Menu("pizza", 750);
        menu[8] = new Menu("sufle", 350);
        menu[9] = new Menu("cheesecake", 330);


        //Printimi i menuse
        System.out.println("Menu");
        System.out.println("--------------------------------");
        for (int i=0; i < menu.length; i++) {
            System.out.println(i +"-" +menu[i].getArtikull() +": " +menu[i].getCmimi() +" leke");
        }

        System.out.println("--------------------------------");

        //part 2 jep porosine

        System.out.println("Sa artikuj doni te porosisni? ");
        int art = scanner.nextInt();


        Artikull[] a = new Artikull[art];

        for (int i=0; i<art; i++){
            System.out.println("Jep artikullin nr " +i);
            scanner.nextLine();//kujdes
            String emriArtikullit = scanner.nextLine();
            System.out.println("sasia?");
            int sasia = scanner.nextInt();

            a[i] = new Artikull(emriArtikullit, sasia);

            switch (a[i].getEmri()){
                case "sallate jeshile":
                    a[i].setCmimi(menu[0].getCmimi());
                    break;
                case "brusketi":
                    a[i].setCmimi(menu[1].getCmimi());
                    break;
                case "supe":
                    a[i].setCmimi(menu[2].getCmimi());
                    break;
                case "patate":
                    a[i].setCmimi(menu[3].getCmimi());
                    break;
                case "salmon":
                    a[i].setCmimi(menu[4].getCmimi());
                    break;
                case "pasta":
                    a[i].setCmimi(menu[5].getCmimi());
                    break;
                case "rizoto":
                    a[i].setCmimi(menu[6].getCmimi());
                    break;

                case "pizza":
                    a[i].setCmimi(menu[7].getCmimi());
                    break;

                case "sufle":
                    a[i].setCmimi(menu[8].getCmimi());
                    break;

                case "cheesecake":
                    a[i].setCmimi(menu[9].getCmimi());
                    break;

                default:
                    a[i].setCmimi(0);
                    System.out.println("Ky artikull nuk ekziston, cmimi u vendos 0.0");
            }

        }

        System.out.println("Porosia juaj: ");
        System.out.println("-----------------------------");
        for (int i=0; i<art; i++ ){
            System.out.println("-" +a[i].getEmri() +" (" +a[i].getSasia() +"x) "
                    +a[i].totalPerArtikull() +" leke");
        }


        //part 3 llogarit faturen
       double totali = 0;
        for (int i=0; i < art; i++){
            totali = totali + a[i].totalPerArtikull();
        }
        System.out.println();
        System.out.println("Total = " +totali);
        System.out.println("-----------------------------");

    }

}



