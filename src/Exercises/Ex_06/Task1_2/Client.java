package Exercises.Ex_06.Task1_2;

class Client extends Man {
    private String bankName;

    // Конструктор
    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    // Реализация метода для вывода информации
    @Override
    public void displayInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName() +
                ", Банк: " + bankName);
    }
}