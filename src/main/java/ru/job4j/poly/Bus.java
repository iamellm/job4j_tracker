package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус поехал.");
    }

    @Override
    public void totalPassengers(int countPassengers) {
        System.out.println("Число всех пассажиров: " + countPassengers);
    }

    @Override
    public double fillUpTheTank(double remainingFuel) {
        double fuelPrice = 2.34;
        return fuelPrice * remainingFuel;
    }
}
