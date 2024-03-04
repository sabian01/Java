   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] shtetet = new String[5];


        for (int i = 0; i < shtetet.length; i++){
            System.out.println("Shteti " +i);
            shtetet[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(shtetet));


        //Psh, kerkojme nese Albania ndodhet ne kete array
        for (int i = 0; i < shtetet.length; i++){
            if (shtetet[i].equals("Albania")){
                System.out.println("Shteti u gjet");
            }
        }

       

    }
