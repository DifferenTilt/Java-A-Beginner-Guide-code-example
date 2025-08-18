package chapter05;
// Use substring

public class SubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String orgstr = "Java makes the web move.";

		// construct a substring
		String substr = orgstr.substring(5, 18);

		System.out.println("orgsrt: " + orgstr);
		System.out.println("substr: " + substr);
	}

}
