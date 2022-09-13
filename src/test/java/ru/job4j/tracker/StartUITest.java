package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replacedName = "New Test Name";
        Input in = new StubInput(new String[] {"0", String.valueOf(one.getId()), replacedName, "1"});
        UserAction[] actions = new UserAction[]{new EditAction(out), new FinishAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Edit an item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit an item ===" + ln
                        + "Заявка успешно изменена." + ln
                        + "Menu:" + ln
                        + "0. Edit an item" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
    public void whenFindAllItemsTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[] {"0", "1"});
        UserAction[] actions = new UserAction[] {new FindAllActions(out), new FinishAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + "Хранилище еще не содержит заявок." + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
    public void whenFindByNameActionTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(new String[] {"0", one.getName(), "1"});
        UserAction[] actions = new UserAction[] {new FindActionByName(out), new FinishAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find Items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find Items by name ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find Items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
    public void whenFindByIdActionTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(new String[] {"0", String.valueOf(one.getId()), "1"});
        UserAction[] actions = new UserAction[] {new FindActionById(out), new FinishAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find an Item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find an Item by id ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find an Item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }
}