package array;

import java.util.Arrays;

public class MyArray {

    //Initialization for variables
    private Object[] data;
    private int capacity;
    private int length;

    MyArray() {
        data = new Object[1];
        capacity = 1;
        length = 0;
    }

    //get the value
    public Object get(int index) {
        return data[index];
    }

    //add the value at the end
    public void push(Object object) {
        if (capacity == length) {
            data = Arrays.copyOf(data, capacity * 2);
            capacity = capacity * 2;
        }
        data[length] = object;
        length++;
    }

    //remove an object from the end
    public Object pop() {
        Object poppedElement = data[length - 1];
        data[length - 1] = null;
        length--;
        return poppedElement;
    }

    //delete an element
    public Object delete(int index) {
        Object deleteItem = data[index];
        shiftItems(index);
        return deleteItem;
    }

    private void shiftItems(int index) {
        for (int i = index; i < length-1 ; i++) {
            data[i] = data[i+1];
        }
        data[length - 1] = null;
        length--;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        myArray.push(1);
        myArray.push(2);
        myArray.push(3);
        myArray.push(4);
        myArray.push(5);
        myArray.push(6);

        //pop
        myArray.pop();

        //delete
        myArray.delete(2);

        for (int i = 0; i < myArray.length ; i++) {
            System.out.println(myArray.get(i));
        }
    }
}
