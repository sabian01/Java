
public class Drejtkendesh {
    int gjeresi;
    int lartesi;

    Drejtkendesh(int gjeresi, int lartesi){
        this.gjeresi = gjeresi;
        this.lartesi = lartesi;
    }


    public void pm(){
        System.out.println("P = " +(2*this.gjeresi + 2*this.lartesi));
    }
}
