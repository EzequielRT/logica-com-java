/* Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
 * Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */

import java.util.Scanner;

public class CadastrandoTarefasDoDiaUtilizandoVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[5];

        for (int i = 0; i < tarefas.length; i++) {
            System.out.print("Digite uma tarefa importante: ");
            tarefas[i] = scanner.nextLine();
        }

        for (int i = 0; i < tarefas.length; i++) {
            System.out.println("As suas tarefas importantes são " + tarefas[i]);
        }

        scanner.close();
    }
}
