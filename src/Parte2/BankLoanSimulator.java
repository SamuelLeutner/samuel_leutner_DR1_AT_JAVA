package Parte2;

import java.util.Scanner;

public class BankLoanSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee = 0.03;

        System.out.println("Digite o seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite o valor para empréstimo: ");
        double loan = sc.nextDouble();

        int installments;
        do {
            System.out.print("Em quantas parcelas deseja pagar? (6-48): ");
            installments = sc.nextInt();

            if (installments < 6 || installments > 48) {
                System.out.println("Número de parcelas inválido. Escolha entre 6 e 48.");
            }
        } while (installments < 6 || installments > 48);

        double loanAmount = loan * (1 + fee);
        double monthlyInstallment = loanAmount / installments;

        System.out.println("\n--- Simulação de Empréstimo ---");
        System.out.println("Nome: " + name);
        System.out.println("Valor do Empréstimo: R$ " + String.format("%.2f", loanAmount));
        System.out.println("Número de Parcelas: " + installments);
        System.out.println("Valor da Parcela Mensal: R$ " + String.format("%.2f", monthlyInstallment));
        System.out.println("Valor Total Pago: R$ " + String.format("%.2f", loanAmount));
    }
}
