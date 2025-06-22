package Exercises.Ex_04;

import java.util.Scanner;
import java.util.Random;

public class MainPart2 {
    public static void main(String[] args) {
        // Задание 2
        System.out.println("\nЗадание 2:");
        int[] array = enterArr();
        printArray(array);

        // Задание 1
        System.out.println("\nЗадание 1:");
        printArray(array);
        boolean res1 = isSortedAscending(array);
        System.out.println(res1 ? "OK" : "Please, try again");

        // Задание 3
        System.out.println("\nЗадание 3:");
        printArray(array);
        int[] Arr = swapFirstAndLast(array);
        printArray(Arr);

        // Задание 4
        System.out.println("\nЗадание 4:");
        printArray(Arr);
        int res4 = findFirstUnique(Arr);
        // Вывод результата
        if (res4 != -1) {
            System.out.println("Первое уникальное число: " + res4);
        } else {
            System.out.println("Уникальных чисел нет");
        }

        // Задание 5
        System.out.println("\nЗадание 5:");
        int[] sortArr = sortRndArr();
        System.out.print("Отсортированный массив: ");
        printArray(sortArr);
    }

    public static boolean isSortedAscending(int[] arr) {
        // Проверка сортировки
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    public static int[] enterArr() {
        Scanner scanner = new Scanner(System.in);

        // Ввод длины массива
        System.out.println("Введите размер массива:");
        int length = scanner.nextInt();

        // Создание массива
        int[] array = new int[length];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
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

    public static int[] swapFirstAndLast(int[] array) {
        // Создаем копию массива вручную
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        // Меняем местами первый и последний элементы в копии
        int temp = arrayCopy[0];
        arrayCopy[0] = arrayCopy[arrayCopy.length - 1];
        arrayCopy[arrayCopy.length - 1] = temp;
        return  arrayCopy;
    }

    public static int findFirstUnique(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;  // Прерываем внутренний цикл, если нашли дубликат
                }
            }
            if (isUnique) {
                return arr[i];  // Возвращаем первое уникальное число
            }
        }
        return -1;  // Если уникальных чисел нет
    }

    public static int[] sortRndArr() {
        // Создаем массив из 10 случайных чисел (от 0 до 99)
        int[] array = new int[10];
        Random random = new Random();
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        printArray(array);

        // Сортировка слиянием
        mergeSort(array, 0, array.length - 1);
        return array;
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
