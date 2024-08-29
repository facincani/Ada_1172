package aula2.curso;

public class CursoOnline extends Curso{


    public String link;

    public CursoOnline(String nome, String instrutor, Integer duracao, String link) {
        super(nome, instrutor, duracao);
        this.link = link;
    }

    @Override
    public void detalharCurso(){
        super.detalharCurso();
        System.out.println("Link: " + link);
    }


}
