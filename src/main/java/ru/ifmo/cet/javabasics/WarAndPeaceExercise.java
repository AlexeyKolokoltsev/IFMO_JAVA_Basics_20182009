package ru.ifmo.cet.javabasics;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;


public class WarAndPeaceExercise {

    public static String warAndPeace() throws IOException {
        // Открываем оба файла, читаем построчно и сливаем (concat) строки в общий список
        return Stream.concat(readAllLines(Paths.get("src", "main", "resources", "WAP12.txt"), Charset.forName("windows-1251")).stream(),
                readAllLines(Paths.get("src", "main", "resources", "WAP34.txt"), Charset.forName("windows-1251")).stream())
                .map(s -> s.replaceAll("[^a-zA-Zа-яА-Я]", " ").toLowerCase()) // В каждой строке меняем всё кроме букв на пробелы
                .flatMap(s -> Arrays.stream(s.split(" "))) // Каждую строку преобразуем в список слов (split), потом сливаем списки всех слов в один (flatMap)
                .collect(Collectors.groupingBy(s -> s)).entrySet().stream() // Группируем слова по встречаемости и преобразуем в список пар ключ-значение. Ключом будет само слово, значением все вхождения этого слова
                .filter(kv -> kv.getKey().length() >= 4 && kv.getValue().size() >= 10) // Отбираем нужные слова: длиной более 4 символов, встречающиеся более 10 раз
                .sorted((kv1, kv2) -> kv1.getValue().size() == kv2.getValue().size() ? // Сортируем: если встречаемость одинаковая, то по алфавиту,
                        (kv1.getKey().compareTo(kv2.getKey())) : kv2.getValue().size() - kv1.getValue().size()) // Иначе по встречаемости
                .map(kv -> kv.getKey() + " - " + kv.getValue().size()) // Формируем строку для представления результатов
                .collect(Collectors.joining("\n")); // Сливаем все строки с разделителем перевод строки

        // TODO map lowercased words to its amount in text and concatenate its entries.
        // TODO Iff word "котик" occurred in text 23 times then its entry would be "котик - 23\n".
        // TODO Entries in final String should be also sorted by amount and then in alphabetical order iff needed.
        // TODO Also omit any word with lengths less than 4 and frequency less than 10
    }

}