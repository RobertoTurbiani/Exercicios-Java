package GestãoDePetShop;

public class TestePetShop {
    public static void main(String[] args) {
        Pet pet01 = new Pet("Froid", "Preto");
        PetShop petShop01 = new PetShop("Dogg's");

        System.out.println(pet01);
        System.out.println(petShop01);

        petShop01.darBanho(pet01, 100.0);
        petShop01.darBanho(pet01, 100.0, 10);

        System.out.println(pet01);
        System.out.println(petShop01);
    }
}
