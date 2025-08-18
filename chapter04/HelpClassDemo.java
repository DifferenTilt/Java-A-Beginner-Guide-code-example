package chapter04;
/*
 * This program is an helper tool that explains
 * syntax of java principal operator if & switch
 * using a help class
 */

class Help {

	void helpOn(int what) {

		switch(what) {
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
		case '6':
			System.out.println("The break: \n");
			System.out.println("break; or break label");
			break;
		case '7':
			System.out.println("The continue: \n");
			System.out.println("continue; or continue label");
			break;
		}
	}

	void showMenu() {
		System.out.println("Help on:");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for");
		System.out.println("\t4. while");
		System.out.println("\t5. do-while");
		System.out.println("\t6. break");
		System.out.println("\t7. continue");
		System.out.println("Chose one (q to quit) : ");
	}

	boolean isValid (int ch) {
		if ( ch < '1' | ch > '7' & ch != 'q')
			return false;
		else
			return true;
	}
}

public class HelpClassDemo {

	public static void main(String[] args)
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char choice, ignore;
		Help hlpobj = new Help();

		for(; ;) {
			do {
				hlpobj.showMenu();

				choice = (char) System.in.read(); // Here we need to cast since read receive a int

				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while(!hlpobj.isValid(choice));

			if (choice == 'q')
				break;

			System.out.println("\n");

			hlpobj.helpOn(choice);

		}
	}

}
