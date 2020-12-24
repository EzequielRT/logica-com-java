/* O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber
 * se a nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.
 * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console,
 * uma mensagem que vai dizer se o aluno passou ou não passou.
*/

import java.util.Scanner;

public class AlunoPassouDeAnoBoolean {

    static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua nota: ");
        Double notaDoAluno = scanner.nextDouble();

        Boolean verificaSePassouDeAno = notaDoAluno >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;

        if (verificaSePassouDeAno) {
            System.out.println("Parabéns, você passou de ano!");
        } else {
            System.out.println("Infelizmente você não passou de ano!");
        }

        scanner.close();
    }
}
