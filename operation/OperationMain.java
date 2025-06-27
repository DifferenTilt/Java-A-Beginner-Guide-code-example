package operation;

import java.util.ArrayList;
import java.util.List;

public class OperationMain {

	public static void main(String[] args) {
		
		Operation<Integer> meno = new Operation<Integer>() {
			
			@Override
			public Integer operation(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		System.out.println(meno.operation(5,3));
		
		Operation<Integer> mul = (a, b) -> a * b;
		
		System.out.println(mul.operation(2, 3));
		
		
		
		Operation<Double> sumDou = (a, b) -> a + b;
		
		System.out.println(sumDou.operation(3.5, 5.7));
		
		
		System.out.println("------------------------------------");
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(5);
		nums.add(4);
		nums.add(3);
		
		
		nums.sort((a, b) -> a.compareTo(b));
		
		nums.forEach(x-> System.out.println(x));
		
	}
	
	

}
