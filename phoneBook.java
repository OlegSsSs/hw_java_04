import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class phoneBook {
    public static void main(String[] args) {

        HashMap<String,Set<Integer>> phoneBook = new HashMap<>();
        menu(phoneBook);

    }

    static void menu(Map<String, Set<Integer>> phoneBook) {

        System.out.println("Введите номер операции для выбора действия: \n" +
                "1. Добавить контакт.\n" +
                "2. Найти контакт.\n" +
                "3. Удалить контакт.\n");

        int num = readInt();

        switch (num) {
            case 1 -> addNumber(phoneBook);
            case 2 -> findNumber(phoneBook);
            case 3 -> deleteNumber(phoneBook);
        }
    }

    static void deleteNumber(Map<String, Set<Integer>> phoneBook) {

        System.out.println("Введите имя контакта для удаления.");
        String name = readStr();
        phoneBook.remove(name);
    }

    static void findNumber(Map<String, Set<Integer>> phoneBook) {
        System.out.println("Введите имя контакта для поиска.");
        String name = readStr();

        Set<Integer> value = phoneBook.get(name);

        System.out.println(value);
    }

    static void addNumber(Map<String, Set<Integer>> phoneBook) {

        System.out.println("Введите имя:");
        String name = readStr();
        System.out.println("Введите номер:");
        int number = readInt();

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(number);
        phoneBook.put(name, numbers);
        System.out.println(phoneBook);
    }

    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // scanner.close();
        return num;
    }
    static String readStr() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // scanner.close();
        return name;
    }    
}
