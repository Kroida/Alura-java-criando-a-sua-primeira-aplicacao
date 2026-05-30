import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação do filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);

        // Scanner detecta o idioma automaticamente, então se você
        // colocar um ponto em vez de uma vírgula, dará erro
        System.out.println(avaliacao);
    }
}
