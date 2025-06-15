package Exercises.Ex_01;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("\nЗадание 1");
        System.out.println("Я\nхорошо\nзнаю\nJava");

        // Задание 2
        System.out.println("\nЗадание 2");
        double res1 = ( 46 + 10 ) * ( 10d / 3d );
        double res2 = ( 29 ) * ( 4 ) * (- 15 );
        System.out.println("res1 = " + res1 + " , res2 = " + res2);

        // Задание 3
        System.out.println("\nЗадание 3");
        int number = 10500;
        double result = ((double)number/10)/10;
        System.out.println("result = " + result);

        // Задание 4
        System.out.println("\nЗадание 4");
        result = (double) 3.6 * (double)4.1 * (double)5.9;
        System.out.println("result = " + result);

        // Задание 5
        System.out.println("\nЗадание 5");
        Scanner scanner = new Scanner(System.in);
        while (true) {  // Бесконечный цикл (выход через break)
            System.out.print("Введите число (0 для выхода): ");

            if (scanner.hasNextInt()) {  // Проверяем, что введено число
                number = scanner.nextInt();

                if (number == 0) {
                    System.out.println("Выход из программы.");
                    break;  // Выход из цикла
                }

                System.out.println("Вы ввели: " + number);
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();  // Очистка некорректного ввода
            }
        }


        // Задание 6
        System.out.println("\nЗадание 6");
        System.out.print("Введите число: ");
        int b = scanner.nextInt();

        if (b%2 == 1 && b > 100){
            System.out.println("Выход за пределы диапазона”");
        }
        else if (b%2 == 0){
            System.out.println("Чётное");
        }
        else {
            System.out.println("Нечётное");
        }
        scanner.close();
    }
}
