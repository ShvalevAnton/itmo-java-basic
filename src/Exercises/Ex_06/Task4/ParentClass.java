package Exercises.Ex_06.Task4;

import java.util.Scanner;

class ParentClass {
    protected int number;  // Защищенное поле для хранения числа

    // Конструктор родительского класса, который считывает число с консоли
    public ParentClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        this.number = scanner.nextInt();
        scanner.close();
    }
}