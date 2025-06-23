package Exercises.Ex_06.Task1_2;

abstract class Man {
    private String firstName;
    private String lastName;

    // Конструктор
    public Man(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Метод для получения имени
    public String getFirstName() {
        return firstName;
    }

    // Метод для получения фамилии
    public String getLastName() {
        return lastName;
    }

    // Абстрактный метод для вывода всей информации
    public abstract void displayInfo();
}
