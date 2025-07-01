package Exercises.Ex_09.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UserPointsGame {
    public static void main(String[] args) {
        // Создаём Map для хранения пользователей и их очков
        Map<User, Integer> userPointsMap = new HashMap<>();

        // Добавляем несколько пользователей со случайными очками
        Random random = new Random();
        userPointsMap.put(new User("Алексей"), random.nextInt(1000));
        userPointsMap.put(new User("Мария"), random.nextInt(1000));
        userPointsMap.put(new User("Антон"), random.nextInt(1000));
        userPointsMap.put(new User("Ольга"), random.nextInt(1000));
        userPointsMap.put(new User("Дмитрий"), random.nextInt(1000));

        // Создаём сканер для ввода имени
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        // Ищем пользователя и выводим его очки
        boolean found = false;
        for (Map.Entry<User, Integer> entry : userPointsMap.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(userName)) {
                System.out.println("У пользователя " + userName + " очков: " + entry.getValue());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Пользователь '" + userName + "' не найден.");
        }

        scanner.close();
    }
}
