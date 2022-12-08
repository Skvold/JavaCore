package HW4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{"слово", "первое", "повтор", "второе", "Дима", "повтор", "еще повтор",
                "еще повтор", "четвертое", "пятое", "еще повтор", "третье", "Дима", "Дима", "Дима"};
        uniqueElements(array);
        calculateElementsCount(array);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "123123123");
        phonebook.add("Петров", "34523416462");
        phonebook.add("Сидоров", "2468252052");
        phonebook.add("Петров", "59589852235");

        String surName = "Петров";
        List<String> phoneNumbersBySurName = phonebook.get(surName);

        if (phoneNumbersBySurName != null) {
            System.out.println("По фамилии " + surName + " найдены номера: " + phoneNumbersBySurName);
        } else {
            System.out.println("По фамилии " + surName + " записей нет");
        }
    }

    //#1
    //ищет
    private static void uniqueElements(String[] array) {
        List<String> listFromArray = Arrays.asList(array);
        Set<String> uniqueElements = new HashSet<>(listFromArray);
        System.out.println("Уникальные элементы массива: " + uniqueElements);
    }

    //считает
    private static void calculateElementsCount(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : array) {
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count + 1);
            }
        }
        System.out.println("Количество повторов слов: ");
        System.out.println(map);
    }

}
