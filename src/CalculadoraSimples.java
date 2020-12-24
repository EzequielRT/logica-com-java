/* Para criar uma calculadora simples você vai precisar receber três informações pelo console. São os dois números que
 * participarão da operação e também a operação que será realizada.
 * Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
 * Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*.
 * Para receber a operação você pode receber também um número que vai indicar a mesma. Por exemplo, o número 1 será adição, o 2 subtração,
 * o 3 multiplicação e o 4 divisão.
 * Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para só realizar a operação
 * que o usuário escolheu. Se estiver com dúvidas, então volte a aula onde falamos sobre alteração do valor de uma variável - aula 3.10.
 */

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        Double num1 = scanner.nextDouble();

        System.out.println("Digite o código da operação que deseja realizar: [1]Adição [2]Subtração [3]Multiplicação [4]Dividão ");
        System.out.print("Código: ");
        Integer operacaoASerRealizada = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        Double num2 = scanner.nextDouble();

        Double resultado = 0.0;
        Character simboloDaOperacao = null;

        if(operacaoASerRealizada.equals(1)) {
            resultado = num1 + num2;
            simboloDaOperacao = '+';
        }

        if(operacaoASerRealizada.equals(2)) {
            resultado = num1 - num2;
            simboloDaOperacao = '-';
        }

        if(operacaoASerRealizada.equals(3)) {
            resultado = num1 * num2;
            simboloDaOperacao = '*';
        }

        if(operacaoASerRealizada.equals(4)) {
            resultado = num1 / num2;
            simboloDaOperacao = '/';
        }

        System.out.println("O resultado de " + num1 + " " + simboloDaOperacao + " " + num2 + " é " + resultado);

        scanner.close();
    }
}
