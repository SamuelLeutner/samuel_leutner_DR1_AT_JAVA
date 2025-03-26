package Parte2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String name = sc.nextLine();

        String password;
        boolean isValidPassword = false;

        do {
            System.out.println("Digite sua senha: ");
            password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("A senha deve ter no mínimo 8 caracteres.");
                continue;
            }

            if (!verifyUppercase(password)) {
                System.out.println("A senha deve ter no mínimo uma letra maiúscula.");
                continue;
            }

            if (!verifyNumber(password)) {
                System.out.println("A senha deve ter no mínimo um número.");
                continue;
            }

            if (!verifyEspecialCaracter(password)) {
                System.out.println("A senha deve ter no mínimo um caractere especial.");
                continue;
            }

            isValidPassword = true;
        } while (!isValidPassword); {
            System.out.println("Bem-vindo, " + name + "! Sua senha foi cadastrada com sucesso.");
        }
    }

    private static boolean verifyUppercase(String password) {
        return Pattern.compile("[A-Z]").matcher(password).find();
    }

    private static boolean verifyNumber(String password) {
        return Pattern.compile("\\d").matcher(password).find();
    }

    private static boolean verifyEspecialCaracter(String password) {
        return Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find();
    }
}
