package aula2;

public class SalaDeAula {

    public String turma;
    public Estudante[] estudantes;


    public SalaDeAula(Integer qtdEstudantes){
        this.estudantes = new Estudante[qtdEstudantes];
    }

}
