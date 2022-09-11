package ru.job4j.tracker;

public class FindActionByName implements UserAction {
    @Override
    public String name() {
        return "Find an Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Find an Item by name");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}
