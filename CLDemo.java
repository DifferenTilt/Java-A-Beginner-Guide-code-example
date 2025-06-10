// Display all command-line information.

public class CLDemo {
	public static void main(String[] args) {
		
		System.out.println("Ther are " + args.length + " command-line arguments.");
		
		System.out.println("they are: ");
		
		int i = 0;
		for (String str : args) {
			str = new String(args[i]);
			System.out.println("arg[" + i + "]: " + args[i]);
			i++;
		}
	}
}
