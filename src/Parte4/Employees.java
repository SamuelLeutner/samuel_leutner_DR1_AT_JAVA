package Parte4;

public class Employees {
    String nome;
    double salarioBase;

    public Employees(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Carlos", 5000.00);
        Trainee trainee = new Trainee("Ana", 2000.00);

        System.out.println("Exibindo o salário final do gerente: ");
        manager.exibirSalario();

        System.out.println("Exibindo o salário final do estagiário: ");
        trainee.exibirSalario();
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirSalario() {
        System.out.println(nome + " - Salário Final: R$ " + String.format("%.2f", calcularSalario()));
    }
}
