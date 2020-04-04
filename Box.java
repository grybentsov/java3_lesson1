package ru.geekbrains.java3_lesson1;

import java.util.*;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(T... fruits){
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void add (T... fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public float getWeight(){
        if (fruits.size() == 0){
            return 0;
        }
        float weight = 0;
        for (T fruit: fruits){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare (Box someBox){
        return this.getWeight() == someBox.getWeight();
    }

    public void clear(){
        fruits.clear();
    }

    public void changeBox(Box someBox){
        someBox.fruits.addAll(this.fruits);
        clear();
    }
}
