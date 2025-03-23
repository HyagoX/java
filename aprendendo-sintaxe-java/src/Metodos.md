# Métodos em Java

Em Java, um método é um bloco de código que realiza uma tarefa específica. Métodos são usados para organizar o código, torná-lo mais legível e reutilizável.

## Por que usar métodos?

* **Reutilização de código:** Você pode chamar um método várias vezes, sem precisar escrever o mesmo código repetidamente.
* **Organização do código:** Métodos ajudam a dividir tarefas complexas em partes menores e mais gerenciáveis.
* **Legibilidade do código:** Métodos tornam o código mais fácil de ler e entender.

## Como criar um método

A sintaxe para criar um método em Java é a seguinte:

```java
[modificador] tipoDeRetorno nomeDoMetodo([parâmetros]) {
    // Corpo do método
    // ...
    [return valorDeRetorno];
}

public class Calculadora {

    // Método para somar dois números inteiros
    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        // Chamando o método somar
        int soma = somar(5, 3);
        System.out.println("A soma é: " + soma);
    }
}

```

## Tipos de métodos

* **Métodos de instância:** Métodos que pertencem a um objeto da classe.
* **Métodos estáticos:** Métodos que pertencem à classe em si, não a um objeto específico.

## Chamando um método

Para chamar um método, você usa o nome do método seguido de parênteses e quaisquer argumentos necessários.

* **Métodos de instância:** `objeto.nomeDoMetodo(argumentos);`
* **Métodos estáticos:** `NomeDaClasse.nomeDoMetodo(argumentos);`

## Conclusão

Métodos são uma parte fundamental da programação em Java. Eles ajudam a organizar o código, torná-lo mais legível e reutilizável.