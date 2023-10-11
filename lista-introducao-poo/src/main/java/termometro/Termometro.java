package termometro;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

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

}
