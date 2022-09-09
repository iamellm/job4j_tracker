package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle localBus1 = new LocalBus();
        Vehicle localBus2 = new LocalBus();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle[] vehicles = new Vehicle[] {localBus1, localBus2, plane1, plane2, train1, train2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
