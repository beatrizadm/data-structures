package src.java;

import java.util.Arrays;



/**
 * Classe que implementa a estratégia de Counting Sort vista em sala. Procure
 * evitar desperdicio de memoria alocando o array de contadores com o tamanho
 * sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Voce pode assumir que o maior inteiro armazenado não chega a 100.
 *
 */
public class CountingSort {


	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		if( (leftIndex < rightIndex) && (array.length) > 1 && (validIndexes(array, leftIndex,rightIndex)) ) {
					
			int k = findHighestValue(array, leftIndex, rightIndex);
			
			countingSort(array, k , leftIndex, rightIndex);
			
		}
		
		else {
			return;
		}
	}
	
	
	
	
	private int findHighestValue(Integer[] array, int leftIndex, int rightIndex) {
		
		int k = array[leftIndex];
		
		for(int i = leftIndex + 1; i <= rightIndex; i++) {
			
			if(array[i] > k){
				k = array[i];
			}
		}
		
		return k;
	}




	private void countingSort(Integer[] initialArray, int k, int leftIndex, int rightIndex) {
		
		Integer[] countingArray = new Integer[k + 1];
		Arrays.fill(countingArray, 0);
		
		// frequencia
		for(int i = leftIndex; i <= rightIndex; i++) {
			countingArray[initialArray[i]] += 1;
		}
		
		// cumulativa
		
		for(int i = 0; i < countingArray.length - 1; i++) {
			
			countingArray[i+1] += countingArray[i];
			
		}
		
		Integer[] orderedArray = new Integer[rightIndex - leftIndex + 1];
		
		for(int i = rightIndex; i >= leftIndex; i--){
			
			countingArray[initialArray[i]] -= 1;
			
			orderedArray[countingArray[initialArray[i]]] = initialArray[i];
			
		}
		
		for(int i = leftIndex; i <= rightIndex; i++){
			initialArray[i] = orderedArray[i-leftIndex];
			
		}
		
	}
	

	private boolean validIndexes(Integer[] array, int leftIndex, int rightIndex) {
		boolean result = true;
		
		
		 if( leftIndex >= array.length || leftIndex > rightIndex || leftIndex < 0) {
			result = false;
		}
		
		else if(rightIndex >= array.length || rightIndex < 0) {
			result = false;
		}
				
		return result;
	}

}
