
public class Katrore extends Gjeometrik {
    private int a;

    public Katrore(int a){
        this.a = a;
    }
    @Override
    public void draw() {
        for (int r = 1; r <= a; r++) {
            for (int c = 1; c <= a; c++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    @Override
    public void resize() {
        this.a = 4;
    }

    @Override
    public void siperfaqe() {
        System.out.println("Siperfaqja e katrorit = " +a*a);
    }


    @Override
    public void perimeter() {
        System.out.println("Perimetri i katrorit = " +4*a);
    }
}


