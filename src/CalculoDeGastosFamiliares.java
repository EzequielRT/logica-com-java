/* Faça um programa que receba:
 * O valor da conta de luz
 * Conta de água
 * Conta de telefone
 * Escola do filho
 * Fatura do cartão
 * Gastos com supermercado
 * ... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
 */

import java.util.Scanner;

public class CalculoDeGastosFamiliares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double despesaMensalTotal = 0.0;

        System.out.print("Digite o valor de sua conta de água: R$");
        Double contaAgua = scanner.nextDouble();

        despesaMensalTotal += contaAgua;

        System.out.print("Digite o valor de sua conta de luz: R$");
        Double contaLuz = scanner.nextDouble();

        despesaMensalTotal += contaLuz;

        System.out.print("Digite o valor de sua conta de telefone: R$");
        Double contaTelefone = scanner.nextDouble();

        despesaMensalTotal += contaTelefone;

        System.out.print("Digite o valor da mensalidade escolar de seu filho: R$");
        Double valorDaMensalidadeEscolar = scanner.nextDouble();

        despesaMensalTotal += valorDaMensalidadeEscolar;

        System.out.print("Digite o valor de sua fatura do cartão de crédito: R$");
        Double contaCartaoDeCredito = scanner.nextDouble();

        despesaMensalTotal += contaCartaoDeCredito;

        System.out.print("Digite o valor de seus gastos no supermercado: R$");
        Double despesaNoSupermercado = scanner.nextDouble();

        despesaMensalTotal += despesaNoSupermercado;

        System.out.println("O valor de sua despesa mensal é de: R$" + despesaMensalTotal);

        scanner.close();
    }
}
