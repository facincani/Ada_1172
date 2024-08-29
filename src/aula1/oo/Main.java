package aula1.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        Estudante alex = new Estudante(nome);

        System.out.println("Digite as notas do aluno:");
        for (int i = 0; i < 3; i++){
            alex.adicionaNota(scanner.nextDouble());
        }
        System.out.println(alex.calcularMedia());

    }

}
