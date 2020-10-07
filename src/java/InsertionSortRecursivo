class InsertionSortRecursivo {

	public void insertionSortRecursivo(int[] array) {
		insertionSortRecursivo(array, 1, array.length);
	}

	public void insertionSortRecursivo(int[] array, int inicio, int fim) {

		if (inicio != fim) {

			int j = inicio;

			while (j > 0 && array[j] < array[j - 1]) {
				swap(array, j, j - 1);
				j -= 1;
			}

			insertionSortRecursivo(array, inicio + 1, fim);
		}
	}

	static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

}
