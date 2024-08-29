package aula1.oo;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    public String nome;
    public List<Double> notas = new ArrayList<>();

    public Estudante(String nome) {
        this.nome = nome;
//        this.notas = notas;
    }

    public void adicionaNota(Double nota){
        this.notas.add(nota);
    }

    public Double calcularMedia() {
        Double soma = 0d;
        for (Double nota : notas){
            if (!nota.isNaN())
            soma += nota;
        }
        return soma / notas.size();
    }


}
