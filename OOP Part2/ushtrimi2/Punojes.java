public class Punojes {
    private String titulli;
    private int paga;

    public Punojes (String titulli, int paga) {
        this.titulli = titulli;
        this.paga = paga;
    }

    public void printPaga () {
        System.out.println("Titulli: "+titulli +", Paga = " +paga);
    }

    public void setPaga (int paga) {
        this.paga = paga;
    }

    public int getPaga () {
        return paga;
    }


}
