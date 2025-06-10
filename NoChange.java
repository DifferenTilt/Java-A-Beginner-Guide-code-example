
public class NoChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Use for-each style for to display and sum the values.
		for(int x : nums) {
			System.out.print(x + " ");
			x = x * 10; // no effect on nums
		}
		System.out.println();
		
		for(int x : nums) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}