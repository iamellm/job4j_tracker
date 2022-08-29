package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaForDummies = new Book("Java for Dummies", 564);
        Book effectiveJava = new Book("Effective Java", 857);
        Book headFirstJava = new Book("Head First Java", 598);
        Book cleanCode = new Book("Clean code", 938);
        Book[] books = new Book[4];
        books[0] = javaForDummies;
        books[1] = effectiveJava;
        books[2] = headFirstJava;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPageCount() + " pages.");
        }
        System.out.println();
        System.out.println("Switching first book with the last one");
        books[0] = cleanCode;
        books[3] = javaForDummies;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPageCount() + " pages.");
        }
        System.out.println();
        System.out.println("Printing out the book \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPageCount());
            }
        }
    }
}
