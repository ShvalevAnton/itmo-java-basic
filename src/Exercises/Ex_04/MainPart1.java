package Exercises.Ex_04;

import java.util.Scanner;

public class MainPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("\nЗадание 1:");
        String res1 = oddNumbers();
        System.out.println(res1);

        // Задание 2
        System.out.println("\nЗадание 2:");
        String res2 = divBy35();
        System.out.println(res2);

        System.out.print("\nВведите 3 числа для задания 3 и 4:");
        System.out.print("\nВведите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Задание 3
        System.out.println("\nЗадание 3:");
        boolean res3 = checkSum(num1, num2, num3);
        System.out.println("Результат: " + res3);

        // Задание 4
        System.out.println("\nЗадание 4:");
        boolean res4 = isIncreasing(num1, num2, num3);
        System.out.println("Результат: " + res4);

        System.out.print("\nВведите длину массива для задания 5 и 6 (минимум 2):");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Задание 5
        System.out.println("\nЗадание 5:");
        boolean res5 = StartsOrEndsWithThree(array);
        System.out.println("Результат: " + res5);

        // Задание 6
        System.out.println("\nЗадание 6:");
        boolean res6 = containsOneOrThree(array);
        System.out.println("Массив содержит 1 или 3: " + res6);

        scanner.close();
    }

    public static String oddNumbers() {
        String str = "";
        // Вывод нечетного числа от 1 до 99 с шагом 2
        for (int i = 1; i <= 99; i += 2) {
            str += i + " ";
        }
        return str;
    }

    public static String divBy35() {
        StringBuilder divBy3 = new StringBuilder("Делится на 3: ");
        StringBuilder divBy5 = new StringBuilder("Делится на 5: ");
        StringBuilder divBy3And5 = new StringBuilder("Делится на 3 и на 5: ");

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divBy3And5.append(i).append(" ");
            } else if (i % 3 == 0) {
                divBy3.append(i).append(" ");
            } else if (i % 5 == 0) {
                divBy5.append(i).append(" ");
            }
        }
        // Объединяем с переносами строк
        String result = divBy3 + "\n" +
                        divBy5 + "\n" +
                        divBy3And5;

        return result;
    }

    public static boolean checkSum(int num1,int num2, int num3) {
        // Вычисляем сумму первых двух чисел
        int sum = num1 + num2;
        boolean result = (sum == num3);

        return  result;
    }

    public static boolean isIncreasing(int num1,int num2, int num3) {
        // Проверка условия: num2 > num1 И num3 > num2
        boolean result = (num2 > num1) && (num3 > num2);
        return  result;
    }

    public static boolean StartsOrEndsWithThree(int[] array) {
        // Проверка, есть ли 3 в начале или конце
        boolean result = (array[0] == 3) || (array[array.length - 1] == 3);
        return result;
    }

    public static boolean containsOneOrThree( int[] array) {
        // Проверка наличия 1 или 3
        boolean containsOneOrThree = false;
        for (int num : array) {
            if (num == 1 || num == 3) {
                containsOneOrThree = true;
                break;
            }
        }
        return containsOneOrThree;
    }
}
