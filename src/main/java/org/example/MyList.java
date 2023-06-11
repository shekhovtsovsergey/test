package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyList {

    private String[] elements;
    private int size;

    public MyList() {
        elements = new String[10];
    }


    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element,elements[i])) {
                return true;
            }
        }
        return false;
    }



    public void add(String element) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = element;
        size++;
    }


    private void grow(){
        String[] newElements = new String[(int) (elements.length * 1.5)];
        System.arraycopy(elements,0,newElements,0,size);
        elements = newElements;
    }



    public boolean remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Индекс " + index + " лежит за пределами списка");
        }
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        size--;
        return true;
    }

    public boolean remove(String element) {
        int index = indexOf(element);
        if (index == -1){
         return false;
        }
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        size--;
        return true;
    }



    public String get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Индекс " + index + " лежит за пределами списка");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }


    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element,elements[i])) {
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(String element) {
        for (int i = size-1; i >= 0; i--) {
            if (Objects.equals(element,elements[i])) {
                return i;
            }
        }
        return -1;
    }



    @Override
    public String toString() {
        return Arrays.stream(elements)
                .limit(size)
                .collect(Collectors.joining(", ", "[", "]"));
    }

}
