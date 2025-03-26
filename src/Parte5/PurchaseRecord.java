package Parte5;

import java.io.*;
import java.util.Scanner;

public class PurchaseRecord {
    static final String FILE_NAME = "purchase-record.txt";
    String product;
    int quantity;
    double unitPrice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        createFileIfNotExists();

        for (int i = 1; i <= 3; i++) {
            PurchaseRecord pr = new PurchaseRecord();
            System.out.println("Cadastro da compra " + i);
            System.out.print("Produto: ");
            pr.product = sc.nextLine();

            System.out.print("Quantidade: ");
            pr.quantity = Integer.parseInt(sc.nextLine());

            System.out.print("Preço unitário: ");
            pr.unitPrice = Double.parseDouble(sc.nextLine());

            pr.insertDataInFile();
        }

        System.out.println("\nCompras registradas com sucesso!\n");
        readFromFile();
    }

    private static void createFileIfNotExists() {
        File file = new File(FILE_NAME);
        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + FILE_NAME);
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    private static void readFromFile() {
        System.out.println("Compras registradas no arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private void insertDataInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write("Produto: " + product + "\n");
            writer.write("Quantidade: " + quantity + "\n");
            writer.write("Preço unitário: " + String.format("%.2f", unitPrice) + "\n");
            writer.write("---------------------------\n");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
