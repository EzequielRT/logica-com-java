/* Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
 * Dependendo do número informado você deve imprimir o nome desse dia.
 * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
 */

import java.util.Scanner;

public class ImprimeDiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nª referente ao dia da semana: ");
        Integer codDiaDaSemana = scanner.nextInt();

        String diaDaSemana = "";

        switch (codDiaDaSemana) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda.";
                break;
            case 3:
                diaDaSemana = "Terça.";
                break;
            case 4:
                diaDaSemana = "Quarta.";
                break;
            case 5:
                diaDaSemana = "Quinta.";
                break;
            case 6:
                diaDaSemana = "Sexta.";
                break;
            case 7:
                diaDaSemana = "Sábado.";
                break;
            default:
                System.err.println("Código inválido!");
                System.exit(1);
        }

        System.out.println("O código digitado é referente a " + diaDaSemana);

        scanner.close();
    }
}
