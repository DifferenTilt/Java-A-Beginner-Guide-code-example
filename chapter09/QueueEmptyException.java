package chapter09;

public class QueueEmptyException extends Exception {

	@Override
	public String toString() {
		return "\nQueue is empty.";
	}
}
