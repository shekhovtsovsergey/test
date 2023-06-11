package org.example;

public class Main {

    public static void main(String[] args) {

        MyList myList = new MyList();
        System.out.println(myList);
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.add("F");
        myList.add("A");
        myList.add("A");
        myList.add("A");
        while (myList.remove("A"));
        System.out.println(myList);
    }

    //trimmToSize
    //set заменить по индексу
    //добавление по индексу
    //очистка листа
    //тоже самое несколько прогонов
}