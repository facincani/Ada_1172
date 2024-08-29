package aula3;

import aula3.empresa.Empresa;
import aula3.funcionario.*;

public class Main {

    public static void main(String[] args) {

        Horista h1 = new Horista(1, "Zé",  20d, 232);
        Horista h2 = new Horista(2, "Maria",  20d, 232);
        Horista h3 = new Horista(3, "Mirosmar",  20d, 248);
        Horista h4 = new Horista(4, "Ziraldo",  20d, 248);
        Horista h5 = new Horista(5, "Jones",  20d, 248);

        Mensalista m1 = new Mensalista(6, "Joana", 7000d, 15000d);
        Mensalista m2 = new Mensalista(7, "Esmeralda", 7000d, 15000d);

        Empresa emp = new Empresa();
        emp.adicionarFuncionario(h1);
        emp.adicionarFuncionario(h2);
        emp.adicionarFuncionario(h3);
        emp.adicionarFuncionario(h4);
        emp.adicionarFuncionario(h5);
        emp.adicionarFuncionario(m1);
        emp.adicionarFuncionario(m2);

        emp.init();
    }




    private static void teste(Pessoa p){
        p.mostrarNome();
    }

}
