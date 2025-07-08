package Exercises.Ex_11_Threads.Task1;

import java.util.Map;

public class NumberPrinterThread extends Thread {
    public NumberPrinterThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            // Проверяем и выводим текущее состояние потока
            Thread.State currentState = this.getState();
            System.out.println(getName() + ": " + i + " текущее состояние потока: " + currentState);
        }
    }
}