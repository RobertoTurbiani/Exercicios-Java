package Termometro;

public class Termometro {
    private Double temperaturaAtual;
    private Double temperaturaMax;
    private Double temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin){
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    void aumentaTemperatura(Double temperaturaAdicional){
        Double temperaturaAlterada = temperaturaAtual + temperaturaAdicional;

        if(temperaturaAlterada > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual = temperaturaAlterada;
        }
    }

    void diminuiTemperatura(Double temperaturaRedutiva){
        Double temperaturaAlterada = temperaturaAtual - temperaturaRedutiva;

        if(temperaturaAlterada < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual = temperaturaAlterada;
        }
    }

    void exibeFahreinheit(){
        Double F = (temperaturaAtual * 1.8) + 32;
        System.out.println("Temperatura em Fahreinheit: " + F);
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMax(){
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax){
        this.temperaturaMax = temperaturaMax;
    }

    public Double getTemperaturaMin(){
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin){
        this.temperaturaMin = temperaturaMin;
    }
}
