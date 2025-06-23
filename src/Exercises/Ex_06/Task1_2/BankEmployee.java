package Exercises.Ex_06.Task1_2;

class BankEmployee extends Man {
    private String bankName;

    // Конструктор
    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    // Реализация метода для вывода информации
    @Override
    public void displayInfo() {
        System.out.println("Работник банка: " + getFirstName() + " " + getLastName() +
                ", Банк: " + bankName);
    }
}
