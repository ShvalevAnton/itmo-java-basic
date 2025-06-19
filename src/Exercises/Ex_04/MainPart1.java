package Exercises.Ex_04;

import java.util.Scanner;

public class MainPart1 {
    public static void main(String[] args) {
        // Задание 1
        //OddNumbers();
        // Задание 2
        //divBy35();
        // Задание 3
        //checkSum();
        // Задание 4
        //isIncreasing();
        // Задание 5
        //StartsOrEndsWithThree();
        // Задание 6
        containsOneOrThree();
    }

    public static void OddNumbers() {
        // Вывод нечетного числа от 1 до 99 с шагом 2
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i); // Вывод числа с новой строки
        }
    }

    public static void divBy35() {
        // Создаем три объекта StringBuilder для накопления чисел:
        // 1. Числа, делящиеся только на 3
        StringBuilder divBy3 = new StringBuilder("Делится на 3: ");
        // 2. Числа, делящиеся только на 5
        StringBuilder divBy5 = new StringBuilder("Делится на 5: ");
        // 3. Числа, делящиеся и на 3, и на 5 (т.е. на 15)
        StringBuilder divBy3And5 = new StringBuilder("Делится на 3 и на 5: ");

        // Проходим по всем числам от 1 до 100
        for (int i = 1; i <= 100; i++) {
            // Проверяем, делится ли число и на 3, и на 5 (т.е. на 15)
            if (i % 3 == 0 && i % 5 == 0) {
                // Если да, добавляем его в список divBy3And5
                divBy3And5.append(i).append(" ");
            }
            // Если не делится на оба, проверяем, делится ли только на 3
            else if (i % 3 == 0) {
                // Добавляем в divBy3
                divBy3.append(i).append(" ");
            }
            // Если не делится на 3, проверяем, делится ли только на 5
            else if (i % 5 == 0) {
                // Добавляем в divBy5
                divBy5.append(i).append(" ");
            }
        }

        // Выводим результаты
        System.out.println(divBy3);
        System.out.println(divBy5);
        System.out.println(divBy3And5);
    }

    public static void checkSum() {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя три числа
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Вычисляем сумму первых двух чисел
        int sum = num1 + num2;
        boolean result = (sum == num3);
        System.out.println("Результат: " + result);
    }

    public static void isIncreasing() {
        Scanner scanner = new Scanner(System.in);

        // Ввод трёх чисел от пользователя
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Проверка условия: num2 > num1 И num3 > num2
        boolean result = (num2 > num1) && (num3 > num2);
        System.out.println("Результат: " + result);
    }

    public static void StartsOrEndsWithThree() {
        Scanner scanner = new Scanner(System.in);

        // Ввод длины массива
        System.out.print("Введите длину массива (минимум 2): ");
        int length = scanner.nextInt();

        // Создание и заполнение массива
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Проверка, есть ли 3 в начале или конце
        boolean result = (array[0] == 3) || (array[length - 1] == 3);

        // Вывод массива и результата
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nРезультат: " + result);
    }

    public static void containsOneOrThree() {
        Scanner scanner = new Scanner(System.in);

        // Ввод длины массива
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        // Создание и заполнение массива
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Проверка наличия 1 или 3
        boolean containsOneOrThree = false;
        for (int num : array) {
            if (num == 1 || num == 3) {
                containsOneOrThree = true;
                break;
            }
        }
        System.out.println("Массив содержит 1 или 3: " + containsOneOrThree);
    }

}
