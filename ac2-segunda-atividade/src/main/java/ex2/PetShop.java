package ex2;

public class PetShop {
    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    public void darBanho(Pet pet, Double valor){

        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);
        pet.setQtdVisitasAoPetShop(+1);
        faturamentoTotal += pet.getValorGastoEmPetShop();


    }

    public void darBanho(Pet pet, Double valor, Integer desconto){
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor - (valor * desconto/100));
        pet.setQtdVisitasAoPetShop(+1);
        faturamentoTotal += pet.getValorGastoEmPetShop();
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
                Pet shop %s
                Faturamento %.2f
                """.formatted(nome,faturamentoTotal);
    }
}
