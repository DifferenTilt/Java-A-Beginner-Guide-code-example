package chapter03;
/*
 * This program is an helper tool that explains
 * syntax of java principal operator if & switch
 */
public class Help {

	public static void main(String[] args)
	throws java.io.IOException{
		// TODO Auto-generated method stub

		System.out.println("Help on:");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("Chose one: ");

		char choice;
		choice = (char) System.in.read(); // Here we need to cast since read receive a int

		// Since we receive a char the switch should be
		// adjusted accordingly, i.e. the switch is not an integer
		switch(choice) {
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println("\tcase constant");
			System.out.println("\t\tstatement sequence");
			System.out.println("\t\tbreak;");
			System.out.println("\t// ...");
			System.out.println("}");
			break;
		default:
			System.out.println("Selection not found.");
		}
	}

}
