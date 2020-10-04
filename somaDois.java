import java.util.Arrays;
import java.util.Scanner;

public class SomaDois {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] listaEntrada = input.nextLine().split(" ");
        int valor = input.nextInt();
        int[] arrayInteiros = new int[listaEntrada.length];
        for (int i = 0; i < listaEntrada.length; i++) {
            arrayInteiros[i] = Integer.parseInt(listaEntrada[i]);
        }
        System.out.print(Arrays.toString(somaDois(arrayInteiros, valor)));
    }

    private static int[] somaDois(int[] vetor, int valor) {
    int num1 = 0, num2 = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] + vetor[j] == valor) {
                    num1 = vetor[i];
                    num2 = vetor[j];
                    vetor = new int[]{num1, num2};
                    return vetor;
                }
            }
        }
        vetor = new int[]{};
        return vetor;
    }
}
