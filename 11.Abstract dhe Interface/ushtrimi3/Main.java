class Main {

    public static void main(String[] args) {
        Drejtkendesh d1 = new Drejtkendesh(3, 5);
        d1.draw();
        d1.resize();
        System.out.println();
        d1.draw();

        System.out.println();

        Katrore k1 = new Katrore(6);
        k1.draw();
        k1.resize();
        System.out.println();
        k1.draw();
    }

}

