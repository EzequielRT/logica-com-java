import java.util.Scanner;

public class CriandoMetodos {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            imprimirTraco();

            String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

            imprimir("Escolha dentre os cursos abaixo: ");

            iterarEExibirPosicoesDoVetor(cursos);

            imprimirEContinuarNaMesmaLinha("O curso que você deseja é o: ");
            Integer posicaoCursoEscolhido = scanner.nextInt();

            Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

            if (!posicaoValida) {
                opcaoInvalida();
            }

            imprimirTraco();

            String[] formasPagamento = new String[] {"Cartão", "Boleto"};

            imprimir("Escolha dentre as formas de pagamento abaixo: ");

            iterarEExibirPosicoesDoVetor(formasPagamento);

            imprimirEContinuarNaMesmaLinha("Sua forma de pagamento escolhida é: ");
            Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

            posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                    && posicaoFormaPagamentoEscolhida < formasPagamento.length;

            if (!posicaoValida) {
                opcaoInvalida();
            }

            String cursoEscolhido = cursos[posicaoCursoEscolhido];
            String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

            imprimirTraco();

            imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida + ".");

            scanner.close();
        }

        static void imprimir(String texto) {
            System.out.println(texto);
        }

        static void imprimirEContinuarNaMesmaLinha(String texto) {
            System.out.print(texto);
        }

        static void imprimirTraco() {
            System.out.println("----------------------------------------------");
        }

        static void opcaoInvalida() {
            System.err.println("Posição inválida!");
            System.exit(1);
        }

        static void iterarEExibirPosicoesDoVetor (String[] vetor) {
            for(int i = 0; i < vetor.length; i++) {
                System.out.println("[" + i + "] " + vetor[i]);
            }
        }
}
