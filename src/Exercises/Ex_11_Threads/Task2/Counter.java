package Exercises.Ex_11_Threads.Task2;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
