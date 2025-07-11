// Assign array reference variables.

public class AssignARef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		int nums1[] = new int[10];
		int nums2[] = new int[10];
		
		// Initializing arrays with two separated cycle
		for (i = 0; i < 10; i++)
			nums1[i] = i;
		
		for (i = 0; i < 10; i++)
			nums2[i] = -i;
		
		System.out.print("Here is nums1: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();
		
		System.out.print("Here is nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
		
		nums2 = nums1; // now nums2 refers to nums1

		System.out.print("Here is nums2 after assignements: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
		
		// now operate on nums1 array through nums2
		nums2[3] = 99;

		System.out.print("Here is nums1 after change through nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
	}

}
