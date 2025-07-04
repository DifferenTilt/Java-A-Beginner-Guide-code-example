package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * The help class opens a help file,
 * searches for a topic, and then displays 
 * the information associated with that topic.
 * Notice that it handles all I/O exceptions
 * itself, avoiding the need for calling code to do
 * so.
 */
public class Help {
	// name of help file
	private String helpfile;

	Help(String fname) {
		helpfile = fname;
	}

	// display help on a topic
	boolean helpOn(String what) {
		int ch;
		String topic, info;

		// Open the help file
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
			do {
				// read characters until a # is found
				// first a ch read and then a str read -> clever
				ch = helpRdr.read();

				// now see if topics match
				if (ch == '#') {
					topic = helpRdr.readLine();
					if (what.compareTo(topic) == 0) {
						// topic found
						do {
							info = helpRdr.readLine();
							if (info != null)
								System.out.println(info);
						} while (info != null && (info.compareTo("")) != 0);
						return true;
					}
				}
			} while (ch != -1);
		} catch (IOException e) {
			System.out.println("Error accessing help file.");
			return false;
		}
		// topic not found
		return false;

	}

	// Get a Help topic.
	String getSelection() {
		String topic = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter topic: ");
		try {
			topic = br.readLine();
		} catch (IOException e) {
			System.out.println("Error reading the console.");
		}
		return topic;
	}
}
