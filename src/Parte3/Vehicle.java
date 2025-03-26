package Parte3;

public class Vehicle {
    String placa;
    String modelo;
    int anoFrabricacao;
    double quilometragem;

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.placa = "12345";
        vehicle1.modelo = "Ford Focus";
        vehicle1.anoFrabricacao = 2020;
        vehicle1.quilometragem = 20.000;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.placa = "67890";
        vehicle2.modelo = "BMW M3 Competition";
        vehicle2.anoFrabricacao = 2025;
        vehicle2.quilometragem = 0.0;

        System.out.println("\nExibindo os dados do vehiculo 1: ");
        vehicle1.exibirDetalhes();

        System.out.println("\nExibindo os dados do vehiculo 2: ");
        vehicle2.exibirDetalhes();

        System.out.println("\nAumentando a quilometragem do vehiculo 1.");
        vehicle1.registrarViagem(0.300);
        System.out.println("Exibindo os dados do vehiculo 1 depois da viagem: ");
        vehicle1.exibirDetalhes();

        System.out.println("\nAumentando a quilometragem do vehiculo 2.");
        vehicle2.registrarViagem(0.250);
        System.out.println("Exibindo os dados do vehiculo 2 depois da viagem: ");
        vehicle2.exibirDetalhes();
    }

    protected void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano Frabricacao: " + anoFrabricacao);
        System.out.println("Quilometragem: "+ String.format("%.3f", quilometragem));
    }

    protected void registrarViagem(double km) {
       quilometragem += km;
    }
}
