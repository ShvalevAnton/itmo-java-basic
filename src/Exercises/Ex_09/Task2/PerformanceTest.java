package Exercises.Ex_09.Task2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PerformanceTest {
    private static final int ELEMENTS_COUNT = 1_000_000;
    private static final int ACCESS_COUNT = 100_000;

    public static void main(String[] args) {
        // Тестирование ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long arrayListFillTime = measureArrayListFillTime(arrayList);
        System.out.println("Добавление в ArrayList: " + arrayListFillTime + " мс");

        long arrayListAccessTime = measureArrayListAccessTime(arrayList);
        System.out.println("Случайный доступ в ArrayList: " + arrayListAccessTime + " мс");

        // Тестирование LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long linkedListFillTime = measureLinkedListFillTime(linkedList);
        System.out.println("Добавление в LinkedList: " + linkedListFillTime + " мс");

        long linkedListAccessTime = measureLinkedListAccessTime(linkedList);
        System.out.println("Случайный доступ в LinkedList: " + linkedListAccessTime + " мс");
    }

    // Методы для работы с ArrayList
    private static long measureArrayListFillTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        fillList(list);
        return System.currentTimeMillis() - startTime;
    }

    private static long measureArrayListAccessTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        randomAccess(list);
        return System.currentTimeMillis() - startTime;
    }

    // Методы для работы с LinkedList
    private static long measureLinkedListFillTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        fillList(list);
        return System.currentTimeMillis() - startTime;
    }

    private static long measureLinkedListAccessTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        randomAccess(list);
        return System.currentTimeMillis() - startTime;
    }

    // Общие методы для заполнения и доступа
    private static void fillList(List<Integer> list) {
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(i);
        }
    }

    private static void randomAccess(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < ACCESS_COUNT; i++) {
            int index = random.nextInt(ELEMENTS_COUNT);
            list.get(index);
        }
    }
}