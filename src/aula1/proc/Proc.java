package aula1.proc;

import java.util.Scanner;

public class Proc {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double[] notas = {5,9,7};
//
//        double soma = 0;
//
//        for (int i = 0; i < notas.length; i++){
//            soma += notas[i];
//        }
//
//        double media = soma / notas.length;
//
//        System.out.println(media);
//
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de estudantes
        System.out.print("Digite o número de estudantes: ");
        int numEstudantes = scanner.nextInt();

        String[] nomes = new String[numEstudantes];
        double[][] notas = new double[numEstudantes][3];
        double[] medias = new double[numEstudantes];

        // Leitura dos dados dos estudantes
        for (int i = 0; i < numEstudantes; i++) {
            System.out.print("Digite o nome do estudante " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + " de " + nomes[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Cálculo das médias
        for (int i = 0; i < numEstudantes; i++) {
            medias[i] = calcularMedia(notas[i]);
        }

        // Exibição dos resultados
        for (int i = 0; i < numEstudantes; i++) {
            System.out.println("Estudante: " + nomes[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println();
        }

        scanner.close();
    }

    // Função para calcular a média de notas
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

}
