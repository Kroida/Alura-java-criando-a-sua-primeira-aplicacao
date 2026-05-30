void main() {
    Scanner scanner = new Scanner(System.in);

    String nome = "João";
    String tipoConta = "Corrente";
    double saldo = 2500;

    System.out.printf("""
            *****************
            Dados iniciais do cliente:
            Nome: %s
            Tipo conta: %s
            Saldo inicial: %.3f
            """,
            nome,
            tipoConta,
            saldo
    );

    while(true) {
        System.out.println("""
            *****************
            Operações
            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair
            """);

        System.out.println("Digite a opção desejada:");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Para limpar a entrada e não dar erro

        switch (opcao) {
            case 1:
                System.out.printf("Saldo atual: %.3f%n", saldo);
                break;
            case 2:
                System.out.println("Digite o valor a receber:");
                String valor = scanner.nextLine().replace(",", ".");
                saldo += Double.parseDouble(valor);
                System.out.println("Valor recebido.");
                break;
            case 3:
                System.out.println("Digite o valor a ser transferido:");
                String valorT = scanner.nextLine().replace(",", ".");
                double valorTD = Double.parseDouble(valorT);

                if (valorTD > saldo) {
                    System.out.println("Saldo insuficiente para esta operação!");
                } else {
                    saldo -= valorTD;
                    System.out.println("Transação concluída com sucesso!");
                }
                break;
            case 4:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Comando inválido!");
                break;
        };
    }
}