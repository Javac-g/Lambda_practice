package four.practice;

public interface Tool<T extends Comparable<T>> {
    T Max(T[] vals,T t);

}
