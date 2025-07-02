package chapter10;

import java.io.IOException;
import java.io.RandomAccessFile;

// Demonstrate random access files.
public class RandomAccessDemo {

	public static void main(String[] args) {
		double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;
		
		// Open and use a random access file.
		try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\andrea.brambilla\\eclipse-workspace\\BookExercises\\src\\chapter10\\static\\random.dat", "rw")){
			// Write values to the file.
			for (int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			
			// Now read back specific values
			raf.seek(3); // seek to first double
			d = raf.readDouble();
			System.out.println("First value is: " + d);
			
			raf.seek(8); // seek to second double
			d = raf.readDouble();
			System.out.println("First value is: " + d);
			
			raf.seek(8 * 3); // seek to fourth double
			d = raf.readDouble();
			System.out.println("First value is: " + d);
			
			System.out.println();
			
			// Now, read every other value.
			System.out.println("Here is every other value:");
			for (int i = 0; i < data.length; i++) {
				raf.seek(8 * i); // seek to the i-th double
				d = raf.readDouble();
				System.out.println(d + " ");
				
			}
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		}

	}

}
