package Parte3;

import java.util.Scanner;

public class Student {
    String nome;
    String matricula;
    int nota1;
    int nota2;
    int nota3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("Digite o nome do aluno: ");
        s.nome = sc.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        s.matricula = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        s.nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        s.nota2 = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        s.nota3 = sc.nextInt();

        System.out.println("Nome do aluno: " + s.nome);
        System.out.println("Matricula do aluno: " + s.matricula);
        System.out.println("Nota 1: " + s.nota1);
        System.out.println("Nota 2: " + s.nota2);
        System.out.println("Nota 3: " + s.nota3);

        String aprovacao = s.verificarAprovacao();
        System.out.println("Com base as notas o aluno foi: " + aprovacao);

    }

    private int calcularMedia() {
        int amount = nota1 + nota2 + nota3;

        return amount / 3;
    }

    protected String verificarAprovacao() {
        int nota = calcularMedia();

        if (nota <= 70) {
            return "Reprovado!";
        }

        return "Aprovado!";
    }
}
