package Exercises.Ex_02;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("\nЗадание 1");

        Calculator calc = new Calculator();

        System.out.println(calc.sum(5, 3));          // 8 (int)
        System.out.println(calc.sum(5000000000L, 3L)); // 5000000003 (long)
        System.out.println(calc.sum(2.5, 3.1));      // 5.6 (double)

        System.out.println(calc.divide(10, 3));      // 3.333 (double)
        System.out.println(calc.divide(10.0, 3.0));      // 3.333 (double)
        System.out.println(calc.divide(10.0, 3.0));  // 3.333... (double)

        // Задание 2
        System.out.println("\nЗадание 2");
        // Создание объектов разными конструкторами
        Book defaultBook = new Book();
        Book fullBook = new Book("Java Core", "Joshua Bloch", 2018, 416, 45.99, true);
        Book copiedBook = new Book(fullBook);

        System.out.println(defaultBook);
        System.out.println(fullBook);
        System.out.println(copiedBook);
    }
}