package mg.training.JSImplementation;

public interface JStable<T> {
    void push(T element);
    T pop();
    T shift();
    void unshift(T element);
}
