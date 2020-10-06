
public class QuickSort {

	public void quickSort(int[] array, int leftIndex, int rightIndex) {

		// RightIndex = array.length - 1

		if (leftIndex < rightIndex) {
			int indice_do_pivot = particiona(array, leftIndex, rightIndex);

			quickSort(array, leftIndex, indice_do_pivot - 1);
			quickSort(array, indice_do_pivot + 1, rightIndex);
		}
	}

	public int particiona(int[] array, int leftIndex, int rightIndex) {

		int pivot = array[leftIndex];
		int i = leftIndex;

		for (int j = leftIndex + 1; j <= rightIndex; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, leftIndex, i);
		return i;
	}

	public void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

}
