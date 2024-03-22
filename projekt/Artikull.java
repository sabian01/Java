public class Artikull {
    private String emri;
    private int sasia;
    private int cmimi;

    public Artikull(String emri,int sasia){
        this.emri = emri;
        this.sasia = sasia;
    }

    public void setCmimi(int cmimi){
        this.cmimi = cmimi;
    }


    public double totalPerArtikull() {
        return sasia * cmimi;
    }

    public String getEmri() {
        return emri;
    }

    public int getSasia() {
        return sasia;
    }

    public int getCmimi(){
        return cmimi;
    }
}
