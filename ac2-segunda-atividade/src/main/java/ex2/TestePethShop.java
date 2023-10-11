package ex2;

public class TestePethShop {
    public static void main(String[] args) {
        Pet pet01 = new Pet("Kleber","Vira-Lata");
        Pet pet02 = new Pet("Napo","Pastor");

        PetShop petShop01 = new PetShop("Pet bar");

        petShop01.darBanho(pet01,30.0,30);
        petShop01.darBanho(pet02,100.0);

        System.out.println(pet01);
        System.out.println(pet02);

        System.out.println(petShop01);
    }
}
