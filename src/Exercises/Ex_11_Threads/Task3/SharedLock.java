package Exercises.Ex_11_Threads.Task3;

// Класс для синхронизации потоков
class SharedLock {
    // Флаг, указывающий, чей сейчас ход (true - первый поток, false - второй)
    private boolean isFirstTurn = true;

    public synchronized void waitForTurn(boolean isFirst) throws InterruptedException {
        // Пока не наступил наш ход - ждем
        while (isFirst != isFirstTurn) {
            wait();
        }
    }

    public synchronized void switchTurn() {
        // Меняем ход и уведомляем другой поток
        isFirstTurn = !isFirstTurn;
        notifyAll();
    }
}
