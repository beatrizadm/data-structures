
class BuscaBinariaRecursiva {

	public static int buscaBinariaRecursiva(int[] array, int elemento) {
		return buscaBinariaRecursiva(array, 0, array.length - 1, elemento);
	}

	public static int buscaBinariaRecursiva(int[] array, int esquerda, int direita, int elemento) {
		int centrao = (esquerda + direita) / 2;

		if (esquerda > direita) {
			return -1;
		}

		if (array[centrao] == elemento) {
			return centrao;
		}

		else if (array[centrao] < elemento) {
			return buscaBinariaRecursiva(array, centrao + 1, direita, elemento);
		}

		else {
			return buscaBinariaRecursiva(array, esquerda, centrao - 1, elemento);
		}

	}

}
