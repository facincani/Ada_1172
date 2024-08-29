package aula2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {

        Estudante mirosmar = new Estudante();

        mirosmar.adicionarNota(10d);
        mirosmar.adicionarNota(10d);

        mirosmar.printarNotas();







//        Estudante mirosmar = new Estudante("Mirosmar", new Double[]{10d, 10d, 7d, 0d});
//
//        mirosmar.notas = new Double[5];
//        mirosmar.notas[4] = 10d;
//
//        System.out.println(mirosmar.calculaMedia());


    }

//    public static void main(String[] args) {
//
//        Estudante alex = new Estudante(3);
//        alex.nome = "Alex";
//        Estudante mirosmar = new Estudante(3);
//        Estudante cleitin = new Estudante(3);
//
//
//        SalaDeAula sala1 = new SalaDeAula(3);
//
//
//        sala1.estudantes[0] = new Estudante("Alex", new Double[]{10d, 10d, 10d});
//        sala1.estudantes[1] = mirosmar;
//        sala1.estudantes[2] = cleitin;
//
//
//        System.out.println(sala1);
//
//
//
//    }

}
