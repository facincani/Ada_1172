package aula3.funcionario;

public abstract class Funcionario {

    private Integer matricula;
    private String nome;
    private Double salarioBase;

    public Funcionario(Integer matricula, String nome, Double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario(){
        return this.salarioBase;
    }

    public void detalhar(){
        System.out.print("Matricula: " + this.matricula);
        System.out.print(", Nome: " + this.nome);
        System.out.print(", Salario Base: " + this.salarioBase);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
