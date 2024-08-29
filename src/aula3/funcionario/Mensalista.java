package aula3.funcionario;

public class Mensalista extends Funcionario{

    public Double bonus;

    public Mensalista(Integer matricula, String nome, Double salarioBase, Double bonus) {
        super(matricula, nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void detalhar(){
        super.detalhar();
        System.out.println(" Bonus anual: " + this.bonus);
    }
}
