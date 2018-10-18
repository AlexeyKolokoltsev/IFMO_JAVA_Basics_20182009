package ru.ifmo.cet.javabasics;
import java.util.*;
public class BottleSong {

    static final int TOTAL_BOTTLES = 99;
    final private  static String[] UNITS = {"no more","one","two","three","four",
            "five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen",
            "sixteen","seventeen","eighteen","nineteen"};
    final private static String[] TENS = {"twenty","thirty","forty","fifty",
            "sixty","seventy","eighty","ninety"};

    int m_taken_at_once; // Сколько берём бутылок за раз

    public BottleSong(int bottleTakenAtOnce) {
        // При создании проверяем допустимость количества бутылок за раз
        if (bottleTakenAtOnce < 1 || bottleTakenAtOnce > TOTAL_BOTTLES)
            throw new IllegalArgumentException("One can take from ` to 99 bottles at once");

        m_taken_at_once = bottleTakenAtOnce;
    }

    public String getBottleSongLyrics(){
        List<String> lines = new ArrayList<>();
        int left = TOTAL_BOTTLES; // Сколько бутылок осталось

        // Стихотворение всегда начинается с этой строки
        lines.add("99 bottles of beer on the wall, 99 bottles of beer.");

        // Снимаем бутылки, пока есть что снимать
        for (int i = TOTAL_BOTTLES - m_taken_at_once; i > 0; i-= m_taken_at_once){
            lines.add(String.format("Take %s down and pass around, %d bottle%s of beer on the wall.",
                    getNumberName(m_taken_at_once), // Сколько бутылок сняли (прописью)
                    i, // Сколько осталось после этого
                    i > 1 ? "s" : "")); // Если осталась одна бутылка, окончание s не добавляем

            // После того, как что-то сняли, идёт строчка о том, сколько осталось
            lines.add(String.format("%d bottle%s of beer on the wall, %d bottle%s of beer.",
                    i, i > 1 ? "s" : "", i, i > 1 ? "s" : "")); // Тоже обрабатываем одна - не одна
            left = i; // После цикла for переменная i не сохраняется, нужна другая
        }

        // Остались последние бутылки, число которых не превышает количество,
        // которое берём за раз. Текст взятия этих бутылок немного отличается
        lines.add(String.format("Take %s down and pass around, no more bottles of beer on the wall.",
                getNumberName(left)));

        // Стихотворение всегда заканчивается этими строками
        lines.add("No more bottles of beer on the wall, no more bottles of beer.");
        lines.add("Go to the store and buy some more, 99 bottles of beer on the wall.\n");

        // Объединяем список строк в одну строку
        return String.join("\n",lines);
    }

    private static String getNumberName(int number) {
        if (number < UNITS.length) // Первые 20 чисел называются одним словом, которое есть в массиве
            return UNITS[number];
        else if (number % 10 == 0) // Если число круглое, то выводим только десятки
            return  TENS[(number / 10) - 2]; // Список десяток начинается с 20, поэтому - 2
        else
            return String.format("%s %s", TENS[(number / 10) - 2], UNITS[number % 10]); // Выводим десятки и единицы
    }
}