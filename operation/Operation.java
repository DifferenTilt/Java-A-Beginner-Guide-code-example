package operation;

@FunctionalInterface
public interface Operation<T> {
	T operation(T a, T b);
}
