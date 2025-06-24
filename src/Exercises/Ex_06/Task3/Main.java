package Exercises.Ex_06.Task3;

public class Main {
    public static void main(String[] args) {
        // Создаем грузовик
        Truck truck = new Truck(5000, "Volvo FH16", 'B', 90.0f, 10, 25000);

        // Выводим информацию (метод унаследован от Car)
        truck.outPut();

        // Выводим доп. поля грузовика
        System.out.println("Количество колес: " + truck.wheelsCount);
        System.out.println("Максимальный вес: " + truck.maxWeight + "кг");

        // Меняем количество колес
        truck.newWheels(12);
    }
}
