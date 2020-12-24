/* O índice de massa corporal, mais conhecido pela sigla IMC, é um índice adotado pela OMS (Organização Mundial de Saúde), que é usado para o diagnóstico
 * do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: peso e altura.
 * A fórmula para o seu cálculo eu vou passar aqui pra você e sua missão é criar um pequeno programa que faça esse cálculo automaticamente. Veja aqui a fórmula:
 * IMC = PESO / (ALTURA * ALTURA)
 * Lembrando que o peso é em quilogramas e a altura é em metros.
 * A primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e a altura, respectivamente. Esses dois valores serão informados pelo usuário
 * - da mesma forma como fizemos na aula anterior. Depois dessas duas variáveis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplicação
 * da altura por ela mesma (é a parte "ALTURA * ALTURA" da fórmula acima). Agora basta dividir o peso pela multiplicação que foi feita. O resultado dessa divisão
 * já será o final. Guarde o resultado dessa divisão em uma quarta variável que será utilizada para exibir para o usuário.
 */

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
        System.out.print("Digite seu peso (em Kg): ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();

        Double alturaAoQuadrado = altura * altura;

        Double indiceMassaCorporal = peso / alturaAoQuadrado;

        System.out.println("Seu IMC é: " + indiceMassaCorporal);

        scanner.close();
    }
}
