
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(eshteTek(6));


    }

    static boolean eshteTek (int nr) {
        if (nr % 2 != 0){
            return true;
        }else{
            return  false;
        }
    }

}
