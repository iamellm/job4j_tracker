package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    Error() {
    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Is active? " + active + ", status: " + status + ", message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 1, "Everything is running well.");
        Error error3 = new Error(false, 404, "Page Not Found.");
        Error error4 = new Error(false, 504, "Gateway Time-out.");
        error1.showInfo();
        error2.showInfo();
        error3.showInfo();
        error4.showInfo();
    }
}
