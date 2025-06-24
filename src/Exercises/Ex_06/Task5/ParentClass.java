package Exercises.Ex_06.Task5;
import java.util.Scanner;

class ParentClass {
    protected Scanner scanner;

    public ParentClass() {
        scanner = new Scanner(System.in);
    }

    // Метод для получения возраста пользователя
    public void getUserData() {
        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();
        System.out.println("Возраст пользователя: " + age);
    }
}
