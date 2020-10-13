package src.java;



public class RecursiveBubbleSort{

	/**
	 * Implementação recursiva do bubble sort. Você deve implementar apenas esse
	 * método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	
	
	public void recursiveBubblesort(int[] array, int leftIndex, int rightIndex) {
			
		if( (leftIndex < rightIndex) &&  (array.length) > 1 && (validIndexes(array, leftIndex,rightIndex)) ) {
			for(int j = leftIndex; j < rightIndex; j++) {
				
				if(array[j+1] < array[j]){
					swap(array, j+1, j);
				}
			}
		}				
		else {			
			return;		
		}
		
		recursiveBubblesort(array, leftIndex, rightIndex - 1);
	}
	
	private boolean validIndexes(int[] array, int leftIndex, int rightIndex) {
		boolean result = true;
		
		
		 if( leftIndex >= array.length || leftIndex > rightIndex || leftIndex < 0) {
			result = false;
		}
		
		else if(rightIndex >= array.length || rightIndex < 0) {
			result = false;
		}
				
		return result;
	}
	
	private static void swap(int[] array, int i, int j) {
		if (array == null)
			throw new IllegalArgumentException();

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
