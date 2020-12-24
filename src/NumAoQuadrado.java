/* Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console.
 * Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele mesmo. Por exemplo, para
 * encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como resultado o número 4.
 */

import java.util.Scanner;

public class NumAoQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer num = scanner.nextInt();

        Integer resultado = num * num;

        System.out.println(num + " ao quadrado é " + resultado);

        scanner.close();
    }
}
