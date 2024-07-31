package ru.krylova.java.basic;
import homework4.Box;
import homework4.User;

public class Main {
    public static void main(String[] args) {

        User[] users = {
                new User("Иванов", "Иван", "Иванович", 2026, "email@email.ru"),
        new User("Петров", "Николай", "Иванович", 1985, "email@email.ru"),
        new User("Сидоров", "Петр", "Иванович", 1976, "email@email.ru"),
        new User("Пучков", "Иван", "Иванович", 1999, "email@email.ru"),
        new User("Гришин", "Виктор", "Иванович", 2000, "email@email.ru"),
        new User("Ли", "Андрей", "Иванович", 1993, "email@email.ru"),
        new User("Кранов", "Никита", "Иванович", 1980, "email@email.ru"),
        new User("Кусин", "Евгений", "Иванович", 1965, "email@email.ru"),
        new User("Иванов", "Антон", "Иванович", 1995, "email@email.ru"),
        new User("Иванов", "Кирилл", "Иванович", 1988, "email@email.ru")
        };


            for (int i = 0; i < users.length; i++) {
                if(2024 - users[i].getBirthYear() > 40) {
                    users[i].info();
                    System.out.println();
                }
            }
        Box box = new Box(3,6,4,"black",true, "something");
            box.info();
            box.clear("something");
    }
}