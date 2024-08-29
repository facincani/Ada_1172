package aula3.funcionario;

public class Horista extends Funcionario{

    private Double valorHora;
    private Integer horasTrabalhadas;
    private static final Integer HORAS_BASE = 240;

    public Horista(Integer matricula, String nome, Double valorHora, Integer horasTrabalhadas) {
        super(matricula, nome, HORAS_BASE * valorHora);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double calcularSalario(){
        Double salario = 0d;
        switch (Integer.compare(horasTrabalhadas, 240)){
            case -1:
                salario = calcularPagamentoComFalta();
                break;
            case 0:
                salario = calcularPagamentoBase();
                break;
            case 1:
                salario = calcularPagamentoComHE();
        }
        return salario;
    }

    private Double calcularPagamentoComFalta() {
        int horasFaltantes = HORAS_BASE - horasTrabalhadas;
        return (HORAS_BASE - horasFaltantes * 2) * valorHora;

    }

    private Double calcularPagamentoBase() {
       return valorHora * horasTrabalhadas;
    }

    private Double calcularPagamentoComHE() {
        int qtdHorasExtras = horasTrabalhadas - HORAS_BASE ;
        Integer diasHE = qtdHorasExtras/8;
        int horasSetentaP = (2 * diasHE);
        int horasCemP = qtdHorasExtras - horasSetentaP;
        return (HORAS_BASE * valorHora) +
                (horasSetentaP * valorHora * 1.7) +
                (horasCemP * valorHora * 2);
    }

    @Override
    public void detalhar(){
        super.detalhar();
        System.out.println(this.valorHora);
    }

}
