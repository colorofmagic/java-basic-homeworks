package ru.krylova.java.basic;

public class Horse extends Animal {

    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    public void swim(int distance) {
        int time = distance / swimSpeed;
        if (endurance > distance * 4) {
            endurance -= 1;
        } else {
            time = - 1;
            System.out.println("Животное в состоянии усталости");
        }
    };
}
