class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Punojes p1 = new Punojes("Arkitekt", 1200);

        p1.printPaga();
        p1.setPaga(700);
        System.out.println("Paga = " +p1.getPaga());
        
    }
}
