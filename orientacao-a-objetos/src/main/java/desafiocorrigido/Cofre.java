package desafiocorrigido;

import java.util.concurrent.ThreadLocalRandom;

public class Cofre {
    String meta;
    Double saldo = 0.0;
    Boolean quebrado = false;

    void depositar(Double deposito) {
        if (quebrado) {
            System.out.println("Que pena, já está quebrado, compre cola");
        } else {
            saldo += deposito;
        }
    }

    Double agitar() {
        if (quebrado){
            System.out.println("Não tem como agitar, está quebrado");
            return 0.0;
        } else {
            Double valorRetirado = ThreadLocalRandom.current().nextDouble(saldo);
            saldo -= valorRetirado;
            return valorRetirado;
        }
    }

    Double quebrar() {
        if (quebrado) {
            System.out.println("Cara, já está quebrado");
            return 0.0;
        } else {
            quebrado = true;
            Double saldoAux = saldo;
            saldo = 0.0;
            return saldoAux;
        }
    }

    @Override
    public String toString() {
        return "Cofre{" +
                "meta='" + meta + '\'' +
                ", saldo=" + saldo +
                ", quebrado=" + quebrado +
                '}';
    }
}