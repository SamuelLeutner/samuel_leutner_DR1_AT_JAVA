package Parte2;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite o seu salario mensal: ");
        double monthlySalary = sc.nextDouble();

        double tax = 0;
        double taxDeduction = 0;
        double annualSalary = monthlySalary * 12;

        if (annualSalary <= 22847.76) {
            tax = 0;
            taxDeduction = 0;
        } else if (annualSalary <= 33919.80) {
            tax = 0.075;
            taxDeduction = 1713.58;
        } else if (annualSalary <= 45012.60) {
            tax = 0.15;
            taxDeduction = 4257.57;
        } else {
            tax = 0.275;
            taxDeduction = 10432.32;
        }

        double taxAmount = (annualSalary * tax) - taxDeduction;
        double netSalary = annualSalary - taxAmount;

        System.out.println("\n--- Cálculo do Imposto de Renda ---");
        System.out.println("Nome: " + name);
        System.out.println("Salário Mensal: R$ " + String.format("%.2f", monthlySalary));
        System.out.println("Salário Anual: R$ " + String.format("%.2f", annualSalary));
        System.out.println("Alíquota: " + (tax * 100) + "%");
        System.out.println("Imposto a Pagar: R$ " + String.format("%.2f", taxAmount));
        System.out.println("Salário Líquido Anual: R$ " + String.format("%.2f", netSalary));
    }
}
