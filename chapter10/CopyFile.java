package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Copy a text file.
 * To use this program, specify the name of
 * the source file and the destination file.
 * For example, to copy a file called FIRST.TXT
 * to a file called SECOND.TXT, use the following
 * command line.
 * 
 * java CopyFile FIRST.TXT SECOND.TXT
 */
public class CopyFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		// First, make sure that both files has been specified.
		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}

		// Copy a file.
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("I/O error: " + e);
		} finally {
			// First try block to close fin
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Error closing input file");
			}
			// Second try block to close fout
			try {
				if(fout != null) fout.close();
			} catch (IOException e) {
				System.out.println("Error closing output file");
			}
		}
		System.out.println("Copy executed succesfully!");
	}

}
