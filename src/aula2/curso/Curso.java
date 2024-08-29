package aula2.curso;

public class Curso {

    protected String nome;
    public String instrutor;
    public Integer duracao;

    public Curso(String nome, String instrutor, Integer duracao) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.duracao = duracao;
    }

    public void detalharCurso(){
        System.out.println("Curso: " + nome);
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Duração: " + duracao);
    }

}
