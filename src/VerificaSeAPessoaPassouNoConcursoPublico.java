/* Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros
 * para receber um para receber a nota de português e outro para receber as de matemática. A prova, no total, vale 200
 * pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. Entretanto, o candidato não
 * pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática
 * (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 * No final mostre para o candidato se ele conseguiu ou não.
 */

import java.util.Scanner;

public class VerificaSeAPessoaPassouNoConcursoPublico {

    static final Double NOTA_MINIMA_DESCLASSIFICATORIA_GERAL = 150.0;
    static final Double NOTA_MINIMA = 60.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota na prova de Português: ");
        Double notaProvaPortugues = scanner.nextDouble();

        System.out.print("Digite sua nota na prova de Matemática: ");
        Double notaProvaMatematica = scanner.nextDouble();

        Double somaTotalDasNotas = notaProvaPortugues + notaProvaMatematica;

        Boolean alunoAtingiuNotasMinimas = notaProvaPortugues >= NOTA_MINIMA && notaProvaMatematica >= NOTA_MINIMA;

        Boolean alunoPassouNoConcurso = (somaTotalDasNotas >= NOTA_MINIMA_DESCLASSIFICATORIA_GERAL) && alunoAtingiuNotasMinimas;

        if(alunoPassouNoConcurso) {
            System.out.println("Parabéns você passou!");
        } else {
            System.out.println("Infelizmente você não passou!");
        }

        scanner.close();
    }
}
