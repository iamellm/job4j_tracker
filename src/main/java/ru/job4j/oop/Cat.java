package ru.job4j.oop;

public class Cat {

    private String food;
    private String nickname;

    public void show() {
        System.out.println("nickname: " + this.nickname + " " + "food: " + this.food);
    }

    public void giveNickname(String nickname) {
        this.nickname = nickname;
    }

    public void eat(String food) {
        this.food = food;
    }

    public String sound() {
        return "May-may";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        peppy.sound();
        String say = peppy.sound();
        System.out.println("Peppy says: " + say);
        System.out.println("There is Gav's food:");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNickname("Cutiepie");
        gav.show();
        System.out.println("There is black's food:");
        Cat black = new Cat();
        black.giveNickname("Shadow");
        black.eat("fish");
        black.show();
    }
}
