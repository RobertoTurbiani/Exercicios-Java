package exercicio01;

public class ClasseSocial {
    Double qtdSalarios(Double num01){
        return num01 / 1045;
    }

    String classificarClasseSocial(Double qtdSalarios){
        String classeSocial = "";

        if (qtdSalarios <= 2.0){
            classeSocial = "e";
            return classeSocial;
        }
        else if(qtdSalarios <= 4.0){
            classeSocial = "d";
            return classeSocial;
        }
        else if (qtdSalarios <= 10.0){
            classeSocial = "c";
            return classeSocial;
        }
        else if (qtdSalarios <= 20.0) {
            classeSocial = "b";
            return classeSocial;
        }
        else {
            classeSocial = "a";
            return classeSocial;
        }
    }


}
