package ru.job4j.tracker;

public class FinishAction implements UserAction {
    @Override
    public String name() {
        return "Close the program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Program successfully finished.");
        return false;
    }
}
