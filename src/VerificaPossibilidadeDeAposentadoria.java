/* Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu
 * com a previdência, depois verifique se ela pode aposentar ou não.
 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
 * Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */

import java.util.Scanner;

public class VerificaPossibilidadeDeAposentadoria {

    static final Integer IDADE_MINIMA_PARA_SE_APOSENTAR = 55;
    static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite quanto anos de contribuição para a Previdência você tem: ");
        Integer anosDeContribuicao = scanner.nextInt();

        Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_SE_APOSENTAR;

        Boolean temTempoDeContribuicaoSuficiente = anosDeContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

        Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;

        if(podeAposentar) {
            System.out.println("Parabéns, você pode se aposentar!");
        } else {
            System.out.println("Infelizmente, você ainda não pode se aposentar!");
        }

        scanner.close();
    }
}
