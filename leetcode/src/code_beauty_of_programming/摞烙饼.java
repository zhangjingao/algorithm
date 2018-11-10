package code_beauty_of_programming;


public class 摞烙饼 {

	public static void main(String[] args) {
		int [] arr = {3,2,1,6,5,4,9,8,7,0};
		int len = arr.length;
		int left = 0;
		sort(arr, left, len-1);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] sort (int[] arr, int left, int right) {
		if (left == right) {
			return arr;
		}
		
		int maxIndex = left;
		int max = arr[maxIndex];
		for (int i = left; i <= right; i++) {
			if (arr[i] > max) {
				maxIndex = i;
				max = arr[i];
			}
		}
		for (int i = left; i <= maxIndex/2; i++) {
			int temp = arr[i];
			arr[i] = arr[maxIndex-i];
			arr[maxIndex-i] = temp;
		}
		for (int i = left; i <= right/2; i++) {
			int temp = arr[i];
			arr[i] = arr[right-i];
			arr[right-i] = temp;
		}
		
		return sort(arr, left, right-1);
		
	}	
	
	

}
/**
 * 
 * 1111
 * 11
 * 1
 * 11111
 * 111
 * ->
 * 11111
 * 1
 * 11
 * 1111
 * 111
 * ->
 * 111
 * 1111
 * 11
 * 1
 * 11111
 * ->
 * 1111
 * 111
 * 11
 * 1
 * 11111
 * ->
 * 1
 * 11
 * 111
 * 1111
 * 11111
 * 
 * 
 */
