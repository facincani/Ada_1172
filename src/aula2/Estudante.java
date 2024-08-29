package aula2;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    private String nome;
    private List<Double> notas;


    public Estudante(){
        this.notas = new ArrayList<>();
    }

    public Double calculaMedia(){
        Double soma = 0d;
        for (Double nota: notas ) {
            if (nota != null) {
                soma += nota;
            }
        }
        return soma/ notas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(Double nota){
        this.notas.add(nota);
    }

    public void printarNotas() {
        notas.forEach(nota -> System.out.println(nota));
        notas.forEach(System.out::println);
    }


}
