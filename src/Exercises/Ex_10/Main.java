package Exercises.Ex_10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.nio.file.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.printf("0. Создаём файл 1\n");
            writeStringToFile("file1.txt", "Содержание файла 1...");
            printFileContents("file1.txt");

            System.out.printf("1. Чтение файла 1 и запись в список строк\n");
            List<String> str = readFileToList("file1.txt");
            printListContents(str);

            System.out.printf("2. Запись в файла 2\n");
            writeStringToFile("file2.txt", "Содержание файла 2...");
            printFileContents("file2.txt");

            System.out.printf("3.1 Создание нового текстового файла путем объединения файла 1 и файла 2\n");
            mergeFiles("file1.txt", "file2.txt", "newFile.txt");
            printFileContents("newFile.txt");

            System.out.printf("3.2 Конкатенация файлов\n");
            appendFileToAnother("file1.txt", "file2.txt");
            printFileContents("file1.txt");

            // 4. Замена символов
            System.out.printf("4. Замена символов на $\n");
            String text = "Код доступа: №XK-75;%%:: ввести пароль?? (****)\n";
            System.out.printf(text);
            writeStringToFile("source.txt", text);
            replaceNonAlphanumericWithDollar_1("source.txt");
            printFileContents("source.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFileToList(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public static void writeStringToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            writer.newLine();
        }
    }

    public static void mergeFiles(String file1Path, String file2Path, String outputPath) throws IOException {
        List<String> file1Lines = readFileToList(file1Path);
        List<String> file2Lines = readFileToList(file2Path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String line : file1Lines) {
                writer.write(line);
                writer.newLine();
            }
            for (String line : file2Lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    public static void appendFileToAnother(String targetFilePath, String sourceFilePath) throws IOException {
        // Читаем все строки из второго файла
        String contentToAppend = Files.readString(Path.of(sourceFilePath));

        // Добавляем их в конец первого файла
        Files.writeString(
                Path.of(targetFilePath),
                contentToAppend,
                StandardOpenOption.APPEND  // Режим дописывания
        );
    }

    public static void printListContents(List<String> str) {
        // Вариант 1: Простой вывод через for-each
        System.out.println("Содержимое списка:");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println("----------------------------------");
    }

    public static void printFileContents(String filePath) throws IOException {
        System.out.println("Содержимое файла " + filePath + ":");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.printf("%s%n", s);
            }
        }
        System.out.println("----------------------------------");
    }

    public static void replaceNonAlphanumericWithDollar(String filePath) throws IOException {
        // Читаем содержимое файла
        Path path = Paths.get(filePath);
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        // Заменяем все символы, кроме букв и цифр, на '$'
        StringBuilder modifiedContent = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                modifiedContent.append(c);
            } else {
                modifiedContent.append('$');
            }
        }
        // Записываем изменённое содержимое обратно в файл
        Files.write(path, modifiedContent.toString().getBytes(StandardCharsets.UTF_8));
    }

    public static void replaceNonAlphanumericWithDollar_1(String filePath) throws IOException {
        // Читаем содержимое файла
        Path path = Paths.get(filePath);
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        // Заменяем все символы, кроме букв и цифр, на '$' с помощью регулярного выражения
        String modifiedContent = content.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$");

        // Записываем изменённое содержимое обратно в файл
        Files.write(path, modifiedContent.getBytes(StandardCharsets.UTF_8));
    }
}
