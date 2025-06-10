// This is the Bubble sort.
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		
		System.out.println("Original array is:");
		for(int i = 0; i < 10; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		
		sort(nums);
		
		System.out.println("Sorted array is:");
		for(int i = 0; i < 10; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
	}

	// We are able to define the method that modifies the array in the main class
	// there's no need to return the array!!
	public static void sort (int arr[]) {
		int t, size = arr.length;
		
		// Performing BubbleSort
		for(int i = 0; i < size; i++)
			for(int j = size - 1; j >= i + 1; j--) {
				if(arr[j-1] > arr[j]) {
					t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
			}
	}
}
