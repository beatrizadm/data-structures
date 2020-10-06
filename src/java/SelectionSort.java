import java.util.Arrays;
import java.util.Scanner; 
import java.lang.*;

class SelectionSort {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] numeros = entrada.nextLine().split(" ");

		int[] array = new int[numeros.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(numeros[i]);
		}

		selectionSort(array);

	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int i_menor = i;
			for (int j = i_menor + 1; j < array.length; j++) {
				if(array[j] < array[i_menor]) { 
					i_menor = j;
				}
			}	
			int aux = array[i];
			array[i] = array[i_menor];
			array[i_menor] = aux;
			
			
			if(i_menor != i) {
				System.out.println(Arrays.toString(array));
			}
		}
	}
}