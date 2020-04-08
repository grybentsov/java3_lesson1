package ru.geekbrains.java3_lesson1;

import java.util.*;

public class MainClass {

   // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void swap (Integer [] objects, int ind_0, int ind_1){
        Integer tmp = objects[ind_0];
        objects[ind_0] = objects[ind_1];
        objects[ind_1] = tmp;
    }
    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T>ArrayList<T> convertToArrayList(T [] someArray){
        return new ArrayList<>(Arrays.asList(someArray));
    }

    public static void main(String[] args) {
        // Task 1
	    Integer [] someArray = new Integer[2];
	    someArray[0] = 0;
	    someArray[1] = 1;
        System.out.println(Arrays.toString(someArray));
        swap(someArray, 0, 1);
        System.out.println(Arrays.toString(someArray));

        // Task 2
        System.out.println(convertToArrayList(someArray));

        // Task 3
        Orange orange_1 = new Orange(1.5f);
        Orange orange_2 = new Orange(1.5f);
        Orange orange_3 = new Orange(1.5f);

        Apple apple_1 = new Apple(1.0f);
        Apple apple_2 = new Apple(1.0f);
        Apple apple_3 = new Apple(1.0f);

        Box <Orange> box_1 = new Box<>(orange_1, orange_2, orange_3);
        Box <Apple> box_2 = new Box<>(apple_1, apple_2, apple_3);

        System.out.println(box_1.compare(box_2));

        Box<Orange> box_3 = new Box<>();
        box_1.changeBox(box_3);

        Box<Apple> box_4 = new Box<>();
        box_2.changeBox(box_4);

        System.out.println(box_3.compare(box_4));
    }
}

