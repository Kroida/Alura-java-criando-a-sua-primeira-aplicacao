void main() {
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Top Gun Maverick");

    int anoDeLancamento = 2022;
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;

    // Ordem de prioridade na prática
    // double media = 9.8 + 6.3 + 8.0 / 3;
    double media = (9.8 + 6.3 + 8.0) / 3;
    System.out.println(media);

    // String pra escrever textos
    String sinopse;
    // sinopse = "Filme de aventura com galã dos anos 80";

    // Text Blocks
    sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano de lançamento
            """ + anoDeLancamento;

    System.out.println(sinopse);
}
