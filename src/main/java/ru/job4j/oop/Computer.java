package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    Computer() {
    }

    Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void showInfo() {
        System.out.println("Many monitors? " + multiMonitor + " SSD: " + ssd + " GB" + " CPU model: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(true, 512, "Intel Core I7-10700K");
        computer1.showInfo();
        Computer computer2 = new Computer(true, 1024, "AMD Ryzen 5 3600");
        computer2.showInfo();
        Computer computer3 = new Computer();
        computer3.showInfo();
    }
}
