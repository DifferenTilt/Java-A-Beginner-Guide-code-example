package chapter03;
/*
 * This program is an helper tool that explains
 * syntax of java principal operator if & switch
 */
public class Help2 {

	public static void main(String[] args)
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char choice, ignore;

		do {
			System.out.println("Help on:");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.println("\t2. for");
			System.out.println("\t2. while");
			System.out.println("\t2. do-while\n");
			System.out.println("Chose one: ");

			choice = (char) System.in.read(); // Here we need to cast since read receive a int

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while(choice < '1' | choice > '5');




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
		case '3':
			System.out.println("The for:\n");
			System.out.println("for(init; condition; iteration)");
			System.out.println(" statement;");
			break;
		case '4':
			System.out.println("The while:\n");
			System.out.println("while(condition) statement; ");
			break;
		case '5':
			System.out.println("The do-while:\n");
			System.out.println("do {");
			System.out.println(" statement;");
			System.out.println("} while (condition)");
			break;
		}
	}

}
