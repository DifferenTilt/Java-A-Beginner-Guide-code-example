package chapter10;

// Demonstrate the file-based Help system.
public class FileHelp {

	public static void main(String[] args) {
		
		// Check if the file name is passed
		if (args.length != 1) {
			System.out.println("Error in console input!");
			return;
		}
		
		Help helpobj = new Help(args[0]);
		String topic;
		
		System.out.println("Try the help system. Enter 'stop' to end.");
		
		do {
			topic = helpobj.getSelection();
			
			if (!helpobj.helpOn(topic)) {
				System.out.println("Topic not found.");
			}
		} while (topic.compareTo("stop") != 0);
	}

}
