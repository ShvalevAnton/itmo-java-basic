package Exercises.Ex_11_Threads.Task3;

// Класс-поток, выводящий свое имя
class NamePrinter extends Thread {
    private final SharedLock lock;

    public NamePrinter(String name, SharedLock lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        boolean isFirst = getName().equals("Поток 1");

        try {
            while (true) {
                // Ждем своего хода
                lock.waitForTurn(isFirst);

                // Выводим имя
                System.out.println(getName());

                // Передаем ход другому потоку
                lock.switchTurn();

                // Небольшая задержка для наглядности
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}