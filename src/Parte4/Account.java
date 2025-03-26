package Parte4;

public class Account {
    String titular;
    private double saldo;

    Account(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Account account = new Account("Samuel Leutner", 500);

        System.out.println("O saldo da conta antes das operações.");
        System.out.println(account.exibirSaldo());

        System.out.println("\nDepositando R$1500.00");
        account.depositar(1500.00);
        System.out.println(account.exibirSaldo());

        System.out.println("\nTentando sacar um valor maior");
        account.sacar(3000);
        System.out.println(account.exibirSaldo());

        System.out.println("\nTentando sacar um valor igual a 0");
        account.sacar(0);
        System.out.println(account.exibirSaldo());

        System.out.println("\nSacando R$160");
        account.sacar(160);
        System.out.println("Saldo depois de sacar R$160");
        System.out.println(account.exibirSaldo());
    }

    private void depositar(double valor) {
        this.saldo += valor;
    }

    private void sacar(double valor) {
        if (valor > this.saldo ) {
            System.out.println("O seu saldo é insuficiente.");
            return;
        }

        if (valor <= 0) {
            System.out.println("O valor de saque deve ser maior que zero.");
            return;
        }

        this.saldo -= valor;
    }

    private String exibirSaldo() {
        return "O valor do saldo é de: " + this.saldo;
    }
}
