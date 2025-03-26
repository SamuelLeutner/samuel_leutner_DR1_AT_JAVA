package Parte2;

public class CGISimulator {
    public static void main(String[] args) {
        System.out.println("Header: ");
        System.out.println("Content-Type: text/html");

        System.out.println();

        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("<h1>Exemplo de CGI com `System.out.println`!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}