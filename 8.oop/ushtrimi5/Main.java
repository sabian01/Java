class Main {

    public static void main(String[] args) {

        Rreth r1 = new Rreth(7);
        Rreth r2 = new Rreth(12);

        r1.printSp();
        r2.printSp();

        //Metodat statike nuk thirren me objekt
        Rreth.printStatic();

    }

}
