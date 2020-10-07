import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        int[] numeros = new int[entrada.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        sort(numeros, 0, numeros.length - 1);

        System.out.println("Here's your sorted array: " + Arrays.toString(numeros));
    }

    public static void sort(int[] array, int leftIndex, int rightIndex) {
        if(validate(array, leftIndex, rightIndex)) {
            if (leftIndex < rightIndex) {
                int middle = (leftIndex + rightIndex) / 2;

                sort(array, leftIndex, middle);
                sort(array, middle + 1, rightIndex);

                merge(array, leftIndex, rightIndex);
            }
        }
    }

    private static void merge(int[] array, int leftIndex, int rightIndex) {
        int[] arrayAux = Arrays.copyOf(array, array.length);

        int start = leftIndex;
        int middle = (leftIndex + rightIndex) / 2;
        int secStart = middle + 1;
        int count = leftIndex;

        while (start <= middle && secStart <= rightIndex) {
            if (arrayAux[start] <= arrayAux[secStart]) {
                array[count++] = arrayAux[start++];
            } else {
                array[count++] = arrayAux[secStart++];
            }
        }

        while (start <= middle) {
            array[count++] = arrayAux[start++];
        }

        while (secStart <= rightIndex) {
            array[count++] = arrayAux[secStart++];
        }
    }

    private static boolean validate(int[] array, int leftIndex, int rightIndex) {
        return (array != null && leftIndex >= 0 && rightIndex <= array.length - 1
                && array.length > 1);
    }
}
