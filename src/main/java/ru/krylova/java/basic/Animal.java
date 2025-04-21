package ru.krylova.java.basic;

import java.sql.SQLOutput;

public abstract class Animal {
    public String name;
    public int runSpeed;
    public int swimSpeed;
    public int endurance;

    public Animal (String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public void run(int distance) {
        int time = distance / runSpeed;
        if (endurance > distance) {
            endurance -= 1;
        } else {
            time = - 1;
            System.out.println("Животное в состоянии усталости");
        }
    }

    public void info(){
        System.out.println(endurance);
    }




}
