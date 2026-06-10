# Simulador de Conta Bancária

Este projeto é um simulador de conta bancária com funcionalidades básicas de gerenciamento financeiro.

## Descrição

O programa simula uma conta bancária permitindo que o usuário realize operações básicas como consultar saldo, receber valores e transferir valores. O sistema mantém um saldo inicial e atualiza conforme as operações realizadas.

## Funcionalidades

1. **Consulta de Saldo**: Exibe o saldo atual da conta
2. **Receber Valor**: Adiciona um valor ao saldo da conta
3. **Transferir Valor**: Subtrai um valor do saldo (com validação de saldo suficiente)
4. **Sair**: Encerra o programa

## Como Executar

```bash
javac src/Main.java
java src/Main
```

## Exemplo de Interação

```
*****************
Dados iniciais do cliente:
Nome: João
Tipo conta: Corrente
Saldo inicial: 2500.000

*****************
Operações
1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
1
Saldo atual: 2500.000
```

## Conceitos Aprendidos

- Estrutura de controle while (loop infinito)
- Switch case para menu de opções
- Entrada de dados com Scanner
- Manipulação de strings (replace de vírgula por ponto)
- Parse de strings para números
- Validação de saldo antes de transferência
- Formatação de saída com printf e text blocks
