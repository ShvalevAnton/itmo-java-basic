package Exercises.Ex_03;

public class Tree {
    // Поля класса
    private int age;          // возраст дерева
    private boolean isAlive;  // живое ли дерево
    private String name;      // название дерева

    // 1-й конструктор: устанавливает только возраст и название
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 2-й конструктор: устанавливает все переменные класса
    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    // 3-й конструктор: пустой, выводит сообщение
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    // Главный метод для теста класса
    public static void main(String[] args) {
        // Создаём три объекта, используя разные конструкторы:

        // 1. Используем конструктор с age и name
        Tree oak = new Tree(50, "Дуб");

        // 2. Используем конструктор со всеми параметрами
        Tree pine = new Tree(30, true, "Сосна");

        // 3. Используем пустой конструктор
        Tree emptyTree = new Tree();
    }
}