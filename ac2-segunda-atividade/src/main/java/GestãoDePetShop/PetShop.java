package GestãoDePetShop;

public class PetShop {
    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    public void darBanho(Pet pet, Double valor){
        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);

        faturamentoTotal += valor;
    }

    public void darBanho(Pet pet, Double valor, Integer desconto){
        Double valorDescontado = valor - desconto;

        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valorDescontado);

        faturamentoTotal += valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Faturamento total: %.2f
                """.formatted(nome, faturamentoTotal);
    }
}
