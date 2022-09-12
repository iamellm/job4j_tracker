package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                return index;
            }
        }
        throw new ElementNotFoundException("Element " + key + " not found.");
    }

    public static void main(String[] args) {
        String[] months = new String[] {"January", "March", "April", "May"};
        try {
            int index = indexOf(months, "February");
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
