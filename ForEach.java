// Use for-eah style for loop

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		// Use for-each style for to display and sum the values.
		for(int x : nums) {
			System.out.println("Value is: " + x);
			sum += x;
		}
		System.out.println("Summation: " + sum);
	}

}
