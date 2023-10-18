package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {
    
    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }
    
    public void add(Integer valor) {
        if(valor != null){
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if(valor != null){
            inteiros.remove(valor);
        }
    }

    public Integer countPares() {
        Integer valoresPares = 0;
        if(inteiros.size() == 0){
            return 0;
        } else{
            for(Integer i : inteiros){
                if(i % 2 == 0){
                    valoresPares++;
                }
            }

        }
        return valoresPares;
    }

    public Integer countImpares() {
        Integer valoresImpares = 0;
        if(inteiros.size() == 0){
            return 0;
        } else {
            for(Integer i : inteiros){
                if(i % 2 == 1){
                    valoresImpares++;
                }
            }
        }

        return valoresImpares;
    }

    public Integer somar() {
        Integer numeroTotal = 0;
        if(inteiros.size() == 0){
            return 0;
        } else{
            for(Integer i : inteiros){
                numeroTotal += i;
            }
        }

        return numeroTotal;
    }

    public Integer getMaior() {
        Integer numeroMaior = 0;
        if(inteiros.size() > 0){
            numeroMaior = inteiros.get(0);
        }
            for (Integer numeroAtual : inteiros) {
                if (numeroAtual > numeroMaior) {
                    numeroMaior = numeroAtual;
                }
            }

       return numeroMaior;
    }

    public Integer getMenor() {
        Integer numeroMenor = getMaior();
        if(inteiros.size() == 0){
            return 0;
        } else {
            for(Integer numeroAtual : inteiros){
                if(numeroAtual < numeroMenor){
                    numeroMenor = numeroAtual;
                }
            }
        }

        return numeroMenor;
    }

    public Boolean hasDuplicidade() {
            Boolean numeroIgual = false;

            for (int i = 0; i < inteiros.size(); i++){
                Integer numeroDaVezI = inteiros.get(i);

                for (int j = i + 1; j < inteiros.size(); j++){
                    Integer numeroDaVezJ = inteiros.get(j);

                if(numeroDaVezI.equals(numeroDaVezJ)){
                    numeroIgual = true;
                }

                }
            }

        return numeroIgual;
    }
}
