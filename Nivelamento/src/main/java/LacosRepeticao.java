public class LacosRepeticao {
    public static void main(String[] args) {

        System.out.println("for 0 a 10");

        for (int i = 0; i < 11; i++){

            System.out.println(i);

        }
        System.out.println("for de 10 a 0");

        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);
        }

        System.out.println("while de 0 a 10");

        int i = 0;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("do while de 0 a 10");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

    }
}
