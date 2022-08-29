package ru.job4j.pojo;

import ru.job4j.pojo.License;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Evgeny Lim");
        license.setModel("Toyota");
        license.setCode("xxx111xx");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
