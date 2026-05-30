void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("---------- Número negativo ou positivo ----------");

    System.out.println("Digite um número:");
    int numero = scanner.nextInt();

    if (numero >= 0) {
        System.out.println("O número é positivo");
    } else {
        System.out.println("O número é negativo");
    }

    System.out.println("---------- Verificando números ----------");

    System.out.println("Digite dois números inteiros:");
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();

    if (numero1 == numero2) {
        System.out.println("Os números são iguais");
    } else {
        System.out.println("Os números são diferentes");
    }

    if (numero1 > numero2 && numero1 != numero2) {
        System.out.println("O primeiro número é maior");
    } else if (numero1 < numero2 && numero1 != numero2) {
        System.out.println("O primeiro número é menor");
    }

    System.out.println("---------- Cálculo de área ----------");

    System.out.println("""
            1. Calcular área do quadrado
            2. Calcular área do círculo
            """);
    int caso = scanner.nextInt();

    switch (caso) {
        case 1:
            System.out.println("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            double areaQ = lado * lado;
            System.out.printf("A área do quadrado é de: %.2f%n", areaQ);
            break;
        case 2:
            System.out.println("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            double areaC = Math.PI * raio * raio;
            System.out.printf("A área do quadrado é de: %.2f%n", areaC);
            break;
        default:
            System.out.println("Comando inválido!");
    }

    System.out.println("---------- Par ou ímpar ----------");

    System.out.println("Digite um número inteiro:");
    int numeroParimpar = scanner.nextInt();

    if (numeroParimpar % 2 == 0) {
        System.out.println("O número é par");
    } else {
        System.out.println("O número é ímpar");
    }

    System.out.println("---------- Fatorando um número ----------");

    System.out.println("Digite um número inteiro:");
    int numeroFatorial = scanner.nextInt();

    for (int i = 10; i > 0; i--) {
        int multiFatorial = numeroFatorial * i;
        System.out.printf("O número %d multiplicado por %d é %d%n", numeroFatorial, i, multiFatorial);
    }
}