
public class Pokemon {

    private String emri;
    private String arma;

    Pokemon(String emri, String arma) {
        this.emri = emri;
        this.arma = arma;
    }
    public void sulmo(){
        System.out.println(emri +"sulmoi me " +arma +".");
    }


    public void setEmri(String emri) {
        this.emri = emri;
    }


    public String getEmri() {
        return emri;
    }



}
