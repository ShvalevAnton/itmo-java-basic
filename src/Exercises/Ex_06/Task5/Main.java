package Exercises.Ex_06.Task5;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса-родитель
        ParentClass parent = new ParentClass();
        parent.getUserData();

        // Создаем объект класса-наследника
        ChildClass child = new ChildClass();
        // Используем переопределенный метод
        child.getUserData();
    }
}
