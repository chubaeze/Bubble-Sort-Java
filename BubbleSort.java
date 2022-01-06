package sortArray;
// [2, -2, -6, -10, 10, 4, -8, -1, -8, -4, 7, -4, 0, 9, -9, 0, -9, -9, 8, 1, -4, 4, 8, 5, 1, 5, 0, 0, 2, -10]
// 5, -2, 2, -8, 3, -10, -6, -1, 2, -2, 9, 1, 1
public class BubbleSort {
	
	public static int[] sortedArray(int[] array) {
		
		if(array.length == 0) {
			return new int[] {}; 	
			}
		
		boolean isSorted = false;
		int counter = 0;
		int n = array.length;
		
		while(isSorted == false) {
			isSorted = true;
			for(int i = 0; i < n - 1 - counter; i++) {
				if(array[i] > array[i + 1]) {
					swap(i, i + 1, array);
					
				}
				isSorted = false;
			}
			counter++;
		}
		
		return array;
	}
	
	public static void swap(int i, int j, int[] array) {
		
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		
	}
}
