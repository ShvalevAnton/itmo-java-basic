package Exercises.Ex_11_Threads.Task1;

public class ThreadStatesDemo {
    public static void main(String[] args) {
        NumberPrinterThread[] threads = new NumberPrinterThread[10];

        // Создаем и запускаем потоки
        for (int i = 0; i < 10; i++) {
            threads[i] = new NumberPrinterThread("Поток-" + i);
            System.out.println(threads[i].getName() + " состояние до старта: " + threads[i].getState());
            threads[i].start();
            System.out.println(threads[i].getName() + " состояние сразу после начала: " + threads[i].getState());
        }

        // Проверяем состояния TERMINATED
        while (true) {
            boolean allTerminated = true;

            for (Thread thread : threads) {
                Thread.State state = thread.getState();

                if (state == Thread.State.TERMINATED) {
                    System.out.println(thread.getName() + " текущее состояние потока: " + state);
                } else {
                    allTerminated = false;
                }
            }
            // Выход из while, если все потоки TERMINATED
            if (allTerminated) {
                System.out.println("Все потоки завершили работу. Выход из цикла мониторинга.");
                break;
            }

            try {
                Thread.sleep(1000); // Проверяем состояния раз в секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

