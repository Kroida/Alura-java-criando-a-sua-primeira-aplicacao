void main() {
    // Media
    double nota1 = 8.5;
    double nota2 = 15;
    double media = (nota1 + nota2) / 2;
    System.out.println(media);

    // Casting double pra int
    double castD = 5.6;
    int castI = (int) castD;
    System.out.println(castI);

    // Concatenação
    char letra = 'a';
    String palavra = "Amand";
    System.out.println(palavra + letra);

    // Valor total
    double precoProduto = 79.99;
    int quantidade = 2;
    double valorTotal = precoProduto * quantidade;
    System.out.println(valorTotal);

    // Dólar em real
    double valorDolar = 10;
    double valorReal = valorDolar * 4.94;
    System.out.println(valorReal);

    // Desconto
    double precoOriginal = 250;
    double percentualDesconto = 10;
    double valorDesconto = precoOriginal - ((precoOriginal / 100) * percentualDesconto);
    System.out.println("R$" + valorDesconto);
}
