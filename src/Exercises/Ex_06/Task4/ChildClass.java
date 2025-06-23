package Exercises.Ex_06.Task4;

class ChildClass extends ParentClass {
    // Метод для вывода переменной из главного класса
    public void printParentNumber() {
        System.out.println("Число из родительского класса: " + number);
    }
}