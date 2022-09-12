package ru.job4j.tracker;

public class FindActionById implements UserAction {
    private final Output out;

    public FindActionById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find an Item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find an Item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
