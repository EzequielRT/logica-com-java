/* Crie um programa que receba o valor de um produto e exiba o valor final da compra. Esse valor
 * final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00.
 * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
 */

import java.util.Scanner;

public class DescontoFreteComprasAcimaDe100 {

    static final Double VALOR_FRETE = 15.00;
    static final Double VALOR_MINIMO_PARA_DESCONTO_FRETE = 100.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        Double valorTotalDaCompra = 0.0;

        if(valorProduto >= VALOR_MINIMO_PARA_DESCONTO_FRETE) {
            valorTotalDaCompra = valorProduto;
        } else {
            valorTotalDaCompra = valorProduto + VALOR_FRETE;
        }

        System.out.println("O valor total de sua compra é: " + valorTotalDaCompra);

        scanner.close();
    }
}
