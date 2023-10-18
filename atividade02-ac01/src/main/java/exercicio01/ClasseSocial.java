package exercicio01;

public class ClasseSocial {
    Double qtdSalarios(Double salario){
        return salario/1045;
    }

    String classificarClasseSocial(Double qtdSalarios){
        String classeSocial = "";

        if (qtdSalarios <= 2.0){
            classeSocial = "E";
            return classeSocial;
        }
        else if(qtdSalarios <= 4.0){
            classeSocial = "D";
            return classeSocial;
        }
        else if (qtdSalarios <= 10.0){
            classeSocial = "C";
            return classeSocial;
        }
        else if (qtdSalarios <= 20.0) {
            classeSocial = "B";
            return classeSocial;
        }
        else {
            classeSocial = "A";
            return classeSocial;
        }
    }
}