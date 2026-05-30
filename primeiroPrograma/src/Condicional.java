public class Condicional {
    public static void Main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme lançamento");

        } else {
            System.out.println("Filme retrô");
        }

        /*
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Acesso ao filme liberado B)");
        } else {
            System.out.println("Deve pagar a locação!!");
        }
         */

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Acesso ao filme liberado B)");
        } else {
            System.out.println("Deve pagar a locação!!");
        }
    }
}
