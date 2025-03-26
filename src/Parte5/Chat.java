package Parte5;

import java.util.ArrayList;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> messageFirstPerson = new ArrayList<>();
        ArrayList<String> messageSecondPerson = new ArrayList<>();

        String firstPerson;
        String secondPersion;

        System.out.println("Digite o nome do primeiro usuário:");
        firstPerson = sc.nextLine();
        System.out.println("Digite o nome do segundo usuário:");
        secondPersion = sc.nextLine();

        while (messageFirstPerson.size() < 5 && messageSecondPerson.size() < 5) {
            System.out.println(firstPerson + ": ");
            messageFirstPerson.add(sc.nextLine());

            System.out.println(secondPersion + ": ");
            messageSecondPerson.add(sc.nextLine());
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String person : messageFirstPerson) {
            System.out.println(firstPerson + ": " + person);
            System.out.println(secondPersion + ": " + person);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
    }
}
