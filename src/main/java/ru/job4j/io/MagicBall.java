package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.println(question);
        int number = new Random().nextInt(3);
        String answer = number == 0 ? "Да" : number == 1 ? "Нет" : "Может быть";
        System.out.println(answer);
    }
}
