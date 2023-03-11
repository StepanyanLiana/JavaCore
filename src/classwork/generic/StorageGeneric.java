package classwork.generic;

import java.util.Objects;

public class StorageGeneric<T> {
    Object[] objects = new Object[10];
    int size = 0;

    public void add(T obj) {
        if (objects.length == size) {
        extend();
        }
        objects[size++] = obj;
    }
    private void extend() {
        Object[] tmp = new Object[objects.length + 10];
        System.arraycopy(objects, 0, tmp, 0, size);
        objects = tmp;
    }


    public T getByIndex(int index) {
        return (T) objects[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
}
}