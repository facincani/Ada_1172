package aula5;

import aula2.Estudante;

public class Main {

    public static void main(String[] args) {

        EstudanteDAO dao = new EstudanteDAO();

        Estudante estudante = dao.getEstudante(7);

        System.out.println(estudante.getNome());

    }
}
