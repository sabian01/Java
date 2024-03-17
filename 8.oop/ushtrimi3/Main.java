class Main {

    public static void main(String[] args) {
        Drejtkendesh d1 = new Drejtkendesh(5, 7);
        Drejtkendesh d2 =  new Drejtkendesh(4, 3);

        System.out.println("Siperfaqja = " +(d1.lartesi*d1.gjeresi));
        System.out.println("Siperfaqja = " +(d2.lartesi*d2.gjeresi));

        d1.pm(); //printo parametrin
        d2.pm(); //printo parametrin

    }

}
