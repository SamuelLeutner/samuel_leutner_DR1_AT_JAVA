package Parte5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LotterySimulation {
    public static void main(String[] args) {
        ArrayList<Integer> lotteryNumbers = getRandowNumbers();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Bem-vindo à loteria! Escolha 6 números entre 1 e 60.");

        Scanner sc = new Scanner(System.in);
        while (numbers.size() < 6) {
            System.out.print("Digite um número entre 1 e 60: ");
            int num = sc.nextInt();

            if (num < 1 || num > 60) {
                System.out.println("Número inválido! Escolha um número entre 1 e 60.");
            } else if (numbers.contains(num)) {
                System.out.println("Número já escolhido! Tente outro.");
            } else {
                numbers.add(num);
            }
        }

        ArrayList<Integer> matchedNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (lotteryNumbers.contains(num)) {
                matchedNumbers.add(num);
            }
        }

        System.out.println("\nNúmeros sorteados: " + lotteryNumbers);
        System.out.println("Seus números: " + numbers);
        System.out.println("Acertos: " + matchedNumbers.size());
    }

    private static ArrayList<Integer> getRandowNumbers() {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        Random random = new Random();

        while (uniqueNumbers.size() < 6) {
            uniqueNumbers.add(random.nextInt(60) + 1);
        }

        return uniqueNumbers;
    }
}
