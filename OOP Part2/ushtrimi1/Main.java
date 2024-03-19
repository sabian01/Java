class Main {

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("pikatchu", "elektricitet");

        System.out.println("Emri i pokemonit eshte " +p1.getEmri());
        //ndryshojme emrin
        p1.setEmri("emer tjeter");

        System.out.println(p1.getEmri());
        p1.sulmo();

    }

}


