package Exercises.Ex_11_Threads.Task3;

public class AlternateThreads {

    public static void main(String[] args) {
        SharedLock lock = new SharedLock();

        // Создаем два потока с общим объектом блокировки
        Thread thread1 = new NamePrinter("Поток 1", lock);
        Thread thread2 = new NamePrinter("Поток 2", lock);

        // Запускаем потоки
        thread1.start();
        thread2.start();
    }
}




