package miniDesafio;

import java.util.concurrent.ThreadLocalRandom;

public class MiniDesafio {


    String meta;
    Double saldo = 0.0;

    Boolean quebrado = false;


    void depositar(Double deposito) {


        if (quebrado) {
            System.out.println("Que pena, já está quebrado");

        } else {
            saldo += deposito;
        }

    }

    Double agitar() {
        if (quebrado) {
            System.out.println("Que pena, já está quebrado");
            return 0.0;
        } else {
            Double valorRetirado = ThreadLocalRandom.current().nextDouble();
            saldo -= valorRetirado;

            return valorRetirado;
        }
    }

    Double quebrar() {
        if (quebrado){
            System.out.println("Já está quebrado ");
        }

        quebrado = true;
        Double saldoAux = saldo;
        saldo = 0.0;

        return saldoAux;
    }
}