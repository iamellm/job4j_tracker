package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Lim Evgeny");
        student.setGroup("A101");
        student.setEntryDate(new Date());
        System.out.println(student.getFullName() + " is in a group " + student.getGroup() + " and entry date is " + student.getEntryDate());
    }
}
