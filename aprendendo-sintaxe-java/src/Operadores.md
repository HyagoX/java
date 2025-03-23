# Operadores em Java

Em Java, operadores são símbolos especiais que realizam operações em variáveis e valores. Eles são essenciais para construir expressões e realizar cálculos em seus programas.

## Tipos de Operadores

Java possui diversos tipos de operadores, que podem ser categorizados da seguinte forma:

1.  **Operadores Aritméticos:** Realizam operações matemáticas básicas.
2.  **Operadores de Atribuição:** Atribuem valores a variáveis.
3.  **Operadores Relacionais:** Comparam valores e retornam resultados booleanos.
4.  **Operadores Lógicos:** Combinam expressões booleanas.
5.  **Operadores Bitwise:** Realizam operações em nível de bits.
6.  **Operador Ternário:** Uma forma concisa de escrever expressões condicionais.

## 1. Operadores Aritméticos

| Operador | Descrição          | Exemplo |
| :------- | :----------------- | :------ |
| +        | Adição             | 5 + 2 = 7 |
| -        | Subtração          | 5 - 2 = 3 |
| * | Multiplicação      | 5 * 2 = 10 |
| /        | Divisão            | 5 / 2 = 2 (divisão inteira) |
| %        | Módulo (resto)     | 5 % 2 = 1 |
| ++       | Incremento         | x++ (x = x + 1) |
| --       | Decremento         | x-- (x = x - 1) |

## 2. Operadores de Atribuição

| Operador | Descrição           | Exemplo    |
| :------- | :------------------ | :--------- |
| =        | Atribuição simples  | x = 10     |
| +=       | Adição e atribuição | x += 5 (x = x + 5) |
| -=       | Subtração e atribuição | x -= 3 (x = x - 3) |
| *=       | Multiplicação e atribuição | x *= 2 (x = x * 2) |
| /=       | Divisão e atribuição | x /= 4 (x = x / 4) |
| %=       | Módulo e atribuição | x %= 3 (x = x % 3) |

## 3. Operadores Relacionais

| Operador | Descrição                     | Exemplo | Resultado (se x = 5 e y = 10) |
| :------- | :---------------------------- | :------ | :----------------------------- |
| ==       | Igual a                       | x == y  | false                          |
| !=       | Diferente de                  | x != y  | true                           |
| >        | Maior que                     | x > y   | false                          |
| <        | Menor que                     | x < y   | true                           |
| >=       | Maior ou igual a              | x >= y  | false                          |
| <=       | Menor ou igual a              | x <= y  | true                           |

## 4. Operadores Lógicos

| Operador | Descrição           | Exemplo       | Resultado (se x = true e y = false) |
| :------- | :------------------ | :------------ | :---------------------------------- |
| &&       | E lógico            | x && y        | false                               |
| &#124;&#124;       | OU lógico           | x &#124;&#124; y        | true                                |
| !        | Negação lógica      | !x            | false                               |

## 5. Operadores Bitwise

| Operador | Descrição                     | Exemplo |
| :------- | :---------------------------- | :------ |
| &        | AND bit a bit                 | 5 & 3 = 1 |
| &#124;        | OR bit a bit                  | 5 &#124; 3 = 7 |
| ^        | XOR bit a bit                 | 5 ^ 3 = 6 |
| ~        | Complemento bit a bit         | ~5 = -6 |
| <<       | Deslocamento à esquerda        | 5 << 1 = 10 |
| >>       | Deslocamento à direita         | 5 >> 1 = 2 |
| >>>      | Deslocamento à direita sem sinal | -5 >>> 1 = 2147483645 |

## 6. Operador Ternário

O operador ternário é uma forma concisa de escrever expressões condicionais.

```java
condição ? valor_se_verdadeiro : valor_se_falso;

int idade = 20;
String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
System.out.println(mensagem); // Imprime "Maior de idade"