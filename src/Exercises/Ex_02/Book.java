package Exercises.Ex_02;

public class Book {
    // Поля класса
    private String title;
    private String author;
    private int year;
    private int pages;
    private double price;
    private boolean isAvailable;

    // 1. Конструктор без параметров (по умолчанию)
    public Book() {
        this.title = "";
        this.author = "";
        this.year = 0;
        this.pages = 0;
        this.price = 0.0;
        this.isAvailable = false;
    }

    // 2. Конструктор со всеми параметрами
    public Book(String title, String author, int year, int pages, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // 3. Конструктор копирования
    public Book(Book other) {
        this(other.title, other.author, other.year, other.pages, other.price, other.isAvailable);
    }

    // Метод для вывода информации
    @Override
    public String toString() {
        return String.format("Book[title='%s', author='%s', year=%d, pages=%d, price=%.2f, available=%b]",
                title, author, year, pages, price, isAvailable);
    }
}
