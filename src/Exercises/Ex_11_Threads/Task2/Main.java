package Exercises.Ex_11_Threads.Task2;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int threadCount = 100;
        CountDownLatch latch = new CountDownLatch(threadCount);

        Thread[] threads = new Thread[threadCount];

        // Создаем и запускаем 100 потоков
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
                latch.countDown(); // Уменьшаем счетчик, когда поток завершается
            });
            threads[i].start();
        }

        try {
            latch.await(); // Ждем, пока счетчик не достигнет нуля
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Основной поток был прерван");
        }

        System.out.println("Результат: " + counter.getCount()); // Должно быть 100000
    }
}
