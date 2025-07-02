package chapter10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Write and then read back binary data.
public class RWData {

	public static void main(String[] args) {
		int i = 10;
		double d = 1023.56;
		boolean b = true;
		
		// Write some values. 
		try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("\\C:\\Users\\andrea.brambilla\\eclipse-workspace\\BookExercises\\src\\chapter10\\static\\testdata"))) {
			System.out.println("Writing " + i);
			dataOutputStream.writeInt(i);
			
			System.out.println("Writing " + d);
			dataOutputStream.writeDouble(d);
			
			System.out.println("Writing " + b);
			dataOutputStream.writeBoolean(b);
			
			System.out.println("Writing " + 12.2 * 7.4);
			dataOutputStream.writeDouble(12.2 * 7.4);
		} catch (IOException e) {
			System.out.println("Write error");
			return;
		}

		System.out.println();
		
		// Now read them back
		try(DataInputStream dataIn = new DataInputStream(new FileInputStream("\\C:\\Users\\andrea.brambilla\\eclipse-workspace\\BookExercises\\src\\chapter10\\static\\testdata"))) {
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			
			b = dataIn.readBoolean();
			System.out.println("Reading " + b);
		} catch (IOException e) {
			System.out.println("Read Error.");
		}
	}

}
