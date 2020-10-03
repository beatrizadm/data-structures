import java.util.Scanner;

public class VetorCircular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] listaEntrada = input.nextLine().split(" ");
        int quantidadeElementos = input.nextInt();

        int[] arrayInteiros = new int[listaEntrada.length];
        for (int i = 0; i < listaEntrada.length; i++) {
            arrayInteiros[i] = Integer.parseInt(listaEntrada[i]);
        }
        System.out.print(vetorCircular(arrayInteiros, quantidadeElementos));
    }

    private static String vetorCircular(int[] vetor, int quantidadeElementos) {
        String saida = "";
        int tamanho = 0;
        int indice = 0;
        while (tamanho < quantidadeElementos) {
            if(indice == vetor.length - 1) {
                saida += vetor[indice] + " ";
                indice = 0;
            }
            saida += vetor[indice] + " ";
            tamanho = saida.replace(" ", "").length();
            indice++;
        }
        saida = saida.substring(0,saida.length() - 1);
        return saida;
        }
    }
