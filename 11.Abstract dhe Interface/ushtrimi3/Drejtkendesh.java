public class Drejtkendesh extends Gjeometrik{

    private int a;
    private int b;


    public Drejtkendesh(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        for (int r=1; r <=a; r++){
            for (int c = 1; c <=b; c++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    @Override
    public void resize() {
        this.a = 4;
        this.b = 6;
    }


}
