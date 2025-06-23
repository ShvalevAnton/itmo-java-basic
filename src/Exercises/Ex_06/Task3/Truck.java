package Exercises.Ex_06.Task3;

public class Truck extends Car {
    public int wheelsCount;    // количество колес
    public int maxWeight;     // максимальный вес

    // Метод для установки нового количества колес и вывода в консоль
    public void newWheels(int wheels) {
        this.wheelsCount = wheels;
        System.out.println("Новое количество колес: " + wheelsCount);
    }

    // Конструктор, устанавливающий все значения (и для Car, и для Truck)
    public Truck(int weight, String model, char color, float speed, int wheelsCount, int maxWeight) {
        super(weight, model, color, speed);  // вызов конструктора родителя (Car)
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }
}
