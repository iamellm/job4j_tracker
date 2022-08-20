package ru.job4j.oop.ball;

public class Ball {

    public void tryRun(boolean condition) {

        if (condition) {
            System.out.println("The ball has been eaten");
        } else {
            System.out.println("The ball has been able to escape");
        }
    }
}
