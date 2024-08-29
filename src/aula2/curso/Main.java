package aula2.curso;

import aula2.curso2.CursoPresencial;

public class Main {

    public static void main(String[] args) {

        Curso c = new Curso("Java", "Alex", 3);

        System.out.println(c.nome);

        CursoOnline co = new CursoOnline("Java", "Alex", 3,  "http://...");

        CursoPresencial cp = new CursoPresencial("Java", "Alex", 3,  "http://...");

        co.detalharCurso();
    }

}
