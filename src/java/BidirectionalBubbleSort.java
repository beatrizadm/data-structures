package java;


/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort{
	
	
	public void BidirectionalBubblesort(Integer[] array, int leftIndex, int rightIndex) {
		
		if( (leftIndex < rightIndex) &&  (array.length) > 1 && (validIndexes(array, leftIndex,rightIndex)) ) {
			
			boolean houveTroca = true;
			
			int left = leftIndex;
			int  right = rightIndex;
			
			while(houveTroca) {
				
				houveTroca = false;
				
				for( int i = left; i < rightIndex; i++ ) {
					
					if(array[i+1].compareTo(array[i]) < 0) {
						swap(array, i, i+1);
						houveTroca = true;
					}
					
				}
				
				right --;
				
				for(int j = right; j > left ; j --) {
					
					if(array[j-1].compareTo(array[j]) > 0) {
						swap(array, j-1, j);
						houveTroca = true;
					}
				}
				
				
				left ++;
								
			}
			
		} else {
			return;
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
	
	
	public static void swap(Object[] array, int i, int j) {
		if (array == null)
			throw new IllegalArgumentException();

		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
