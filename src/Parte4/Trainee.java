package Parte4;

public class Trainee extends Employees {
    public Trainee(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}
