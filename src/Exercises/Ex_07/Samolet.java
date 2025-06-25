package Exercises.Ex_07;

public class Samolet {
    // Вложенный класс Крыло
    public class Krylo {
        private double weight; // Вес крыла

        public Krylo(double weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " кг");
        }
    }

    public static void main(String[] args) {
        // Создаем первый самолет с крылом весом 1200 кг
        Samolet samolet1 = new Samolet();
        Samolet.Krylo krylo1 = samolet1.new Krylo(1200);

        // Создаем второй самолет с крылом весом 1500 кг
        Samolet samolet2 = new Samolet();
        Samolet.Krylo krylo2 = samolet2.new Krylo(1500);

        // Выводим информацию о весе крыльев
        System.out.println("Первый самолет:");
        krylo1.showWeight();

        System.out.println("\nВторой самолет:");
        krylo2.showWeight();
    }
}
