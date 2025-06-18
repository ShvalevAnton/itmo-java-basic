package Exercises.Ex_02;

public class Calculator {
    // Сложение
    public int sum(int a, int b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    // Вычитание
    public int subtract(int a, int b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Умножение
    public int multiply(int a, int b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Деление
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Ошибка! Деление на ноль.");
        return (double) a / b;
    }

    public double divide(long a, long b) {
        if (b == 0) throw new ArithmeticException("Ошибка! Деление на ноль.");
        return (double) a / b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Ошибка! Деление на ноль.");
        return a / b;
    }
}
