package aula2.curso2;

import aula2.curso.Curso;

public class CursoPresencial extends Curso {

    public String endereco;

    public CursoPresencial(String nome, String instrutor, Integer duracao, String endereco) {
        super(nome, instrutor, duracao);
        this.endereco = endereco;
        System.out.println(this.nome);
    }
}
