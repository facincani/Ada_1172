package aula3.empresa;

import aula3.funcionario.Funcionario;
import aula3.funcionario.Horista;
import aula3.funcionario.Mensalista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario func){
        this.funcionarios.add(func);
    }

    public void listarFuncionarios(){
        funcionarios.forEach(Funcionario::detalhar);
    }

    public void listarFuncionariosHoristas(){
        funcionarios.forEach(f -> {
            if (f instanceof Horista){
                f.detalhar();
            }
        });
    }

    public void listarFuncionariosMensalistas(){
        funcionarios.forEach(f -> {
            if (f instanceof Mensalista){
                f.detalhar();
            }
        });
    }

    public void calcularFolhaPagamento(){
        Double total = 0d;
        for (Funcionario f: this.funcionarios ){
             total += f.calcularSalario();
        }
        System.out.printf("Total da folha de pagamento: %.2f", total);
    }


    public void init() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Escolha a opçaõ desejada: ");
        System.out.println("1: Listar Todos os funcionários");
        System.out.println("2: Listar funcionários horistas");
        System.out.println("3: Listar funcionários mensalistas");
        System.out.println("4: Calcular folha de pagamento");
        Integer option = scan.nextInt();
        switch (option){
            case 1:
                listarFuncionarios();
                break;
            case 2:
                listarFuncionariosHoristas();
                break;
            case 3:
                listarFuncionariosMensalistas();
                break;
            case 4:
                calcularFolhaPagamento();
                break;
        }

    }
}
