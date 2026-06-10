# Jogo de Adivinhação

Este projeto é um jogo interativo onde o usuário deve adivinhar um número aleatório entre 0 e 100.

## Descrição

O programa gera um número aleatório entre 0 e 100 e desafia o usuário a adivinhar qual é esse número. O usuário tem até 5 tentativas para acertar. A cada tentativa, o programa fornece dicas informando se o número secreto é maior ou menor que o chute do usuário.

## Funcionalidades

- Geração de número aleatório entre 0 e 100
- Limite de 5 tentativas para adivinhar
- Dicas após cada tentativa (número maior ou menor)
- Validação de entrada (números acima de 100 são rejeitados)
- Mensagem de vitória ao acertar o número

## Como Executar

```bash
javac src/Main.java
java src/Main
```

## Exemplo de Interação

```
42
Chute um número secreto de 0 a 100:
50
O número secreto é menor. Tentativas restantes:4
Chute um número secreto de 0 a 100:
30
O número secreto é maior. Tentativas restantes:3
Chute um número secreto de 0 a 100:
42
Parabéns! Você acertou o número secreto
```

## Conceitos Aprendidos

- Geração de números aleatórios com `Random`
- Estruturas de controle (for loop)
- Condicionais (if/else)
- Entrada de dados com Scanner
- Lógica de jogo e feedback ao usuário
- Contagem de tentativas
