package mg.training.JSImplementation;

import java.util.Arrays;

public class JSImplementation<T> implements JStable<T>{
    private T[] array = (T[]) new Object[0];

    @Override
    public void push(T element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }

    @Override
    public T pop() {
        array = Arrays.copyOf(array, array.length - 1);
        return array[array.length - 1];
    }

    @Override
    public T shift() {
       T res = array[0];
       T[] newArray = (T[]) new Object[array.length - 1];
       System.arraycopy(array, 1, newArray, 0, array.length - 1);
       array = newArray;
       return res;
    }

    @Override
    public void unshift(T element) {
        T[] newArray = (T[]) new Object[array.length + 1];
        newArray[0] = element;
        System.arraycopy(array, 0, newArray, 1, array.length);
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
