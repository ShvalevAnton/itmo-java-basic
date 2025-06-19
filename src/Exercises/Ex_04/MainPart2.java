package Exercises.Ex_04;

import java.util.Scanner;
import java.util.Random;

public class MainPart2 {
    public static void main(String[] args) {
        // Задание 1
        //isSortedAscending();
        // Задание 2
        //enterArr();
        // Задание 3
        //swapFirstAndLast();
        // Задание 4
        //findFirstUnique();
        // Задание 5
        sortRndArr();
    }

    public static void isSortedAscending() {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива
        System.out.print("Введите количество элементов: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Проверка сортировки
        boolean sorted = true;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "OK" : "Please, try again");
    }

    public static void enterArr() {
        Scanner scanner = new Scanner(System.in);

        // Ввод длины массива
        System.out.println("Array length:");
        int length = scanner.nextInt();

        // Создание массива
        int[] array = new int[length];

        // Ввод элементов массива
        System.out.println("Numbers of array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Вывод результата
        System.out.print("Result: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void swapFirstAndLast() {


        int[] array = {5, 6, 7, 2};

        // Вывод исходного массива
        System.out.print("Array 1: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Создаем копию массива вручную
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        // Меняем местами первый и последний элементы в копии
        int temp = arrayCopy[0];
        arrayCopy[0] = arrayCopy[arrayCopy.length - 1];
        arrayCopy[arrayCopy.length - 1] = temp;

        // Вывод измененного массива
        System.out.print("Array 2: [");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i]);
            if (i < arrayCopy.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void findFirstUnique() {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива
        System.out.print("Введите количество элементов: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Поиск первого уникального числа
        int firstUnique = -1; // -1 означает, что уникальное число не найдено

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;

            // Проверяем, есть ли такое же число в массиве
            for (int j = 0; j < length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            // Если число уникальное, запоминаем его и выходим из цикла
            if (isUnique) {
                firstUnique = arr[i];
                break;
            }
        }

        // Вывод результата
        if (firstUnique != -1) {
            System.out.println("Первое уникальное число: " + firstUnique);
        } else {
            System.out.println("Уникальных чисел нет");
        }
    }

    public static void sortRndArr() {
        // Создаем массив из 10 случайных чисел (от 0 до 99)
        int[] array = new int[10];
        Random random = new Random();

        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Сортировка слиянием
        mergeSort(array, 0, array.length - 1);

        System.out.print("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Реализация сортировки слиянием
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Сортируем левую и правую части
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Сливаем отсортированные части
            merge(arr, left, middle, right);
        }
    }

    // Метод для слияния двух подмассивов
    public static void merge(int[] arr, int left, int middle, int right) {
        // Размеры временных массивов
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные массивы
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        // Слияние временных массивов
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }


}
