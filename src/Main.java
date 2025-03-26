import Parte2.BankLoanSimulator;
import Parte2.CGISimulator;
import Parte2.IncomeTaxCalculator;
import Parte2.PasswordValidation;
import Parte3.Student;
import Parte3.Vehicle;
import Parte4.Account;
import Parte4.Employees;
import Parte5.LotterySimulation;
import Parte5.PurchaseRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao TP 3 de Java de Samuel!");

            System.out.println("\n--- Menu Principal ---");
            System.out.println("Escolha uma parte do projeto:");
            System.out.println("0 - Sair");
            System.out.println("1 - Parte 2: Conceitos Básicos");
            System.out.println("2 - Parte 3: Classes e Objetos");
            System.out.println("3 - Parte 4: Orientação a Objetos Avançada");
            System.out.println("4 - Parte 5: Manipulação de Arquivos");

            int parte = sc.nextInt();

            switch (parte) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    return;
                case 1:
                    menuParte2(sc);
                    break;
                case 2:
                    menuParte3(sc);
                    break;
                case 3:
                    menuParte4(sc);
                    break;
                case 4:
                    menuParte5(sc);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuParte2(Scanner sc) {
        while (true) {
            System.out.println("\n--- Parte 2: Conceitos Básicos ---");
            System.out.println("Escolha um exercício:");
            System.out.println("1 - Exercício 2: Validação de Senha Segura");
            System.out.println("2 - Exercício 3: Calculadora de Impostos");
            System.out.println("3 - Exercício 4: Simulador de Empréstimo Bancário");
            System.out.println("4 - Exercício 5: Criando um Programa CGI em Java");
            System.out.println("0 - Voltar");

            int exercicio = sc.nextInt();

            switch (exercicio) {
                case 0:
                    System.out.println("Retornando...");
                    return;
                case 1:
                    PasswordValidation.main(null);
                    break;
                case 2:
                    IncomeTaxCalculator.main(null);
                    break;
                case 3:
                    BankLoanSimulator.main(null);
                    break;
                case 4:
                    CGISimulator.main(null);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuParte3(Scanner sc) {
        while (true) {
            System.out.println("\n--- Parte 3: Classes e Objetos ---");
            System.out.println("Escolha um exercício:");
            System.out.println("1 - Exercício: 6 Cadastro de Veículos");
            System.out.println("2 - Exercício: 7 Gerenciador de Alunos");
            System.out.println("0 - Voltar");

            int exercicio = sc.nextInt();

            switch (exercicio) {
                case 0:
                    System.out.println("Retornando...");
                    return;
                case 1:
                    Vehicle.main(null);
                    break;
                case 2:
                    Student.main(null);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuParte4(Scanner sc) {
        while (true) {
            System.out.println("\n--- Parte 4: Orientação a Objetos Avançada ---");
            System.out.println("Escolha um exercício:");
            System.out.println("1 - Exercício: 8 Sistema de Funcionários");
            System.out.println("2 - Exercício: 9 Conta Bancária com Encapsulamento");
            System.out.println("0 - Voltar");

            int exercicio = sc.nextInt();

            switch (exercicio) {
                case 0:
                    System.out.println("Retornando...");
                    return;
                case 1:
                    Employees.main(null);
                    break;
                case 2:
                    Account.main(null);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuParte5(Scanner sc) {
        while (true) {
            System.out.println("\n--- Parte 5: Manipulação de Arquivos e Estruturas Avançadas ---");
            System.out.println("Escolha um exercício:");
            System.out.println("1 - Exercício: 10 Registro de Compras em Arquivo");
            System.out.println("2 - Exercício: 11 Simulação de Loteria");
            System.out.println("3 - Exercício: 12 Sistema de Chat Simples com Arrays");
            System.out.println("0 - Voltar");

            int exercicio = sc.nextInt();

            switch (exercicio) {
                case 0:
                    System.out.println("Retornando...");
                    return;
                case 1:
                    PurchaseRecord.main(null);
                    break;
                case 2:
                    LotterySimulation.main(null);
                    break;
                case 3:
                    // TODO: Exercício: 12 Sistema de Chat Simples com Arrays
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
