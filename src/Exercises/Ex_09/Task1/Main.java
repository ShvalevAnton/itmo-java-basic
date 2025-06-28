package Exercises.Ex_09.Task1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>(List.of("A", "B", "D", "A", "C", "D"));

        System.out.println("С дубликатами: " + listWithDuplicates);

        Collection<String> listWithoutDuplicates = removeDuplicates(listWithDuplicates);
        System.out.println("Без дубликатов: " + listWithoutDuplicates);
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        // Используем HashSet для удаления дубликатов
        Set<T> set = new HashSet<>(collection);
        // Возвращаем новую коллекцию без дубликатов
        return set;
    }
}
