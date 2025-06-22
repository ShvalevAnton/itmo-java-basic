package Exercises.Ex_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("\nЗадание 1:");

        String testText = "В детстве я постоянно рисовала путешественника Пржевальского. " +
                "Мама сохранила рисунки: дядька в камзоле, полосатых гетрах, башмаках и панаме идет вдоль берега моря, " +
                "ветер треплет шарф. Слева скалы, вверху парят орлы. То он возле костра сидит под звездами, то шагает " +
                "бескрайней желтой пустыней или взбирается к заоблачным пикам. Все спрашивали: «Кто это?» Я отвечала: «Пржевальский». " +
                "В школе у меня была кличка Лошадь Пржевальского.";
        System.out.println("Cамое длинное слово в тексте: " + findLongestWordAdvanced(testText));

        // Задание 2
        System.out.println("\nЗадание 2:");
        String word = inputWord();
        boolean res2 = isPalindromeWithStringBuilder(word);
        System.out.println(res2 ? "Слово " + word + " является палиндромом" : "Слово " + word + " не является палиндромом");

        // Задание 3
        System.out.println("\nЗадание 3:");
        testText = "Жила-была в тёмном лесу вредная бяка — такая противная, что даже грибы от неё прятались! " +
                "бяка любила пакостить: то лужу на тропинке оставит, то шишку на голову урони.";
        testText = censorBaka(testText);
        System.out.println("\n" + testText);

        // Задание 4
        System.out.println("\nЗадание 4:");
        String text = "ababababab";
        String substring = "aba";
        System.out.println(countSubstringOccurrences(text, substring));

        // Задание 5
        System.out.println("\nЗадание 5:");
        String example = "This is a test string";
        System.out.println("Original string: " + example);
        System.out.println("Reversed words: " + reverseWords(example));
    }

    public static String findLongestWordAdvanced(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        // Удаляем знаки пунктуации и разделяем по пробелам
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static String inputWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.next();  // next() считывает одно слово (до пробела)
        scanner.close();
        return word;
    }

    public static boolean isPalindromeWithStringBuilder(String word) {
        if (word == null) {
            return false;
        }

        String cleaned = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static String censorBaka(String text) {
        if (text == null) {
            return null;
        }
        return text.replace("бяка", "[вырезано цензурой]");
    }

    public static int countSubstringOccurrences(String text, String substring) {
        if (text == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Разделяем строку на слова по пробелам
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Инвертируем каждое слово
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }

        // Удаляем последний пробел и возвращаем результат
        return result.toString().trim();
    }
}
