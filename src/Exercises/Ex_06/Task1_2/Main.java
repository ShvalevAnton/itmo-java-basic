package Exercises.Ex_06.Task1_2;


public class Main {
    public static void main(String[] args) {
        Man client = new Client("Иван", "Иванов", "Сбербанк");
        Man employee = new BankEmployee("Петр", "Петров", "Альфа-Банк");

        client.displayInfo();
        employee.displayInfo();
    }
}
