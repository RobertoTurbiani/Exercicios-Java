public class LacosDeRepeticao {
    public static void main(String[] args) {
        System.out.println("for 0 a 10");
        for(int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("while 0 a 10");
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("do while 0 a 10");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j <= 10);
    }
}
