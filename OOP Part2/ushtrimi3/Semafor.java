public class Semafor {
    private String ngjyra;
    private int kohezgjatja;

    public Semafor (String ngjyra, int kohezgjatja) {
        this.ngjyra = ngjyra;
        this.kohezgjatja = kohezgjatja;
    }

    public String shikoNgjyren() {
        return ngjyra;
    }

     public void ndryshoNjgyren (String ngjyra) {
        this.ngjyra = ngjyra;
     }



}
