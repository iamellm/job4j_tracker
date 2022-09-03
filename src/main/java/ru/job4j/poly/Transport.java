package ru.job4j.poly;

public interface Transport {

    void drive();

    void totalPassengers(int countPassengers);

    double fillUpTheTank(double remainingFuel);
}
