package Exercises.Ex_03;

public class Car {
    // Поля класса
    private String color;  // цвет машины
    private String name;   // название машины
    private double weight; // вес машины

    // Конструктор 1: пустой конструктор
    public Car() {
    }

    // Конструктор 2: только цвет машины
    public Car(String color) {
        this.color = color;
    }

    // Конструктор 3: цвет и вес машины
    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // Метод для вывода всех данных о машине
    public void printCarInfo() {
        System.out.println("Информация о машине:");
        System.out.println("Название: " + (name != null ? name : "не указано"));
        System.out.println("Цвет: " + (color != null ? color : "не указан"));
        System.out.println("Вес: " + (weight != 0 ? weight + " кг" : "не указан"));
        System.out.println(); // пустая строка для разделения
    }

    // Геттеры и сеттеры для полей класса
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Главный метод для теста класса
    public static void main(String[] args) {
        // Создаем первый объект с помощью пустого конструктора
        Car car1 = new Car();
        car1.setName("Toyota Camry");
        car1.setColor("Красный");
        car1.setWeight(1700);

        // Создаем второй объект с помощью конструктора с цветом и весом
        Car car2 = new Car("Синий", 1800.0);
        car2.setName("Ford Focus");

        // Выводим информацию о машинах
        car1.printCarInfo();
        car2.printCarInfo();
    }
}