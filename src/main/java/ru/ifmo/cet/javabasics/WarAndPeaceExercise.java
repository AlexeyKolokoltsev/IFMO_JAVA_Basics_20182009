package ru.ifmo.cet.javabasics;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;

import static java.nio.file.Files.readAllLines;

public class WarAndPeaceExercise {
    public static String warAndPeace() throws IOException {
        Map<String, Integer> words = new HashMap<>(); // Сюда закачаются все тома

        find(Paths.get("src", "main", "resources", "WAP12.txt"), words); // Закачали 1, 2 том
        find(Paths.get("src", "main", "resources", "WAP34.txt"), words); // Закачали 3, 4 том

        // Чтобы отсортировать как нам надо, преобразуем карту в список
        List<Map.Entry<String,Integer>> toList = new ArrayList<>(words.entrySet());

        // Сортируем
        toList.sort(new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // Если встречаемость слов совпадает, то сортируем по тексту слова
                if(o1.getValue().equals(o2.getValue()))
                    return o1.getKey().compareTo(o2.getKey());
                else // иначе сортируем по встречаемости
                    return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Сюда мы запишем результаты
        List<String> lines = new ArrayList<>();

        // Обходим все слова
        for (int i = 0; i < toList.size(); i++) {
            if (toList.get(i).getValue() >= 10) // Если слово встречается более 10 раз
                // Добавляем его в результат
                lines.add(String.format("%s - %d", toList.get(i).getKey(), toList.get(i).getValue()));
        }

        // Преобразуем результаты в одну строку
       return String.join("\n", lines);
    }

    private static void find(Path path, Map<String, Integer> wordMap) throws IOException {

        for (String line : readAllLines(path, Charset.forName("windows-1251"))) {
            // Строки в Java неизменяемы, поэтому чтобы поменять строку,
            // нужно преобразовать её в массив символов
            char[] arr = line.toCharArray();

            // Чтобы оставить только слова, надо все знаки препинания и цифры
            // заменить на пробельные символы
            for (int i = 0; i < arr.length; i++) {
                if (!Character.isLetter(arr[i]))
                    arr[i] = ' ';
            }

            // Обработанный массив преобразовываем обратно к строке
            line = new String(arr);

            for (String word : line.split(" ")) {
                // Сразу отбрасываем слова короче 4 символов
                if (word.length() < 4)
                    continue;

                // Переводим слово в нижний регистр
                word = word.toLowerCase();

                // Записываем счётчики, сколько какого слова
                if (wordMap.containsKey(word)) {
                    wordMap.put(word, wordMap.get(word) + 1);
                }
                else {
                    wordMap.put(word, 1);
                }
            }
        }
    }
}
