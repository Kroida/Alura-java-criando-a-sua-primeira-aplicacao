void main() {
//    deve gerar um número aleatório entre 0 e 100
//    e pedir para que o usuário tente adivinhar o número, em até 5 tentativas
//    A cada tentativa, o programa deve informar se o número digitado pelo usuário
//    é maior ou menor do que o número gerado.
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int numero = random.nextInt(101);
    System.out.println(numero);

    for (int i = 5; i > 0; i--) {
        System.out.println("Chute um número secreto de 0 a 100:");
        int chute = scanner.nextInt();

        if (chute == numero) {
            System.out.println("Parabéns! Você acertou o número secreto");
            break;
        } else if (chute > 100) {
            System.out.println("Só vai até 100. Tentativas restantes: " + (i - 1));
        } else if (chute < numero) {
            System.out.println("O número secreto é maior. Tentativas restantes:" + (i - 1));
        } else {
            System.out.println("O número secreto é menor. Tentativas restantes:" + (i - 1));
        }
    }
}