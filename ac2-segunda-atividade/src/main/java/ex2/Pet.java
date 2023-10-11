package ex2;

public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitasAoPetShop;
    private Double valorGastoEmPetShop;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitasAoPetShop = 0;
        this.valorGastoEmPetShop = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitasAoPetShop() {
        return qtdVisitasAoPetShop;
    }

    public void setQtdVisitasAoPetShop(Integer qtdVisitasAoPetShop) {
        this.qtdVisitasAoPetShop = qtdVisitasAoPetShop;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }

    @Override
    public String toString() {
        return """
                Dados do pet
                
                Nome: %s
                Raça: %s
                Você visitou a pet: %d vezes
                O valor gasto foi de: %.2f
                """.formatted(nome,raca,qtdVisitasAoPetShop,valorGastoEmPetShop);
    }
}
