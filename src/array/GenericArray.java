package array;

import java.lang.reflect.Array;

public class GenericArray<E> {
    //variable creation
    private E[] elements;

    GenericArray(Class<E> clazz, int capacity) {
        elements = (E[]) Array.newInstance(clazz, capacity);
    }

    public static void main(String[] args) {
        GenericArray<String> stringArray = new GenericArray(String.class, 5);
        stringArray.elements[0] = "Hello";
        stringArray.elements[1] = "Hi";
        stringArray.elements[2] = "Bye";

        for (String str : stringArray.elements) {
            System.out.println("str = " + str);
        }

    }

}
