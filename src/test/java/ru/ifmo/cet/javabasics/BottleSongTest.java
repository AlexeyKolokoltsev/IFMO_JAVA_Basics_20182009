package ru.ifmo.cet.javabasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


 //
class BottleSongTest {

    @Test
    public void test1(){
        final String bottleSongLyrics = new BottleSong(1).getBottleSongLyrics();
        assertEquals(
            "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass around, 98 bottles of beer on the wall.\n" +
                
                "98 bottles of beer on the wall, 98 bottles of beer.\n" +
                "Take one down and pass around, 97 bottles of beer on the wall.\n" +
                
                "97 bottles of beer on the wall, 97 bottles of beer.\n" +
                "Take one down and pass around, 96 bottles of beer on the wall.\n" +
                
                "96 bottles of beer on the wall, 96 bottles of beer.\n" +
                "Take one down and pass around, 95 bottles of beer on the wall.\n" +
                
                "95 bottles of beer on the wall, 95 bottles of beer.\n" +
                "Take one down and pass around, 94 bottles of beer on the wall.\n" +
                
                "94 bottles of beer on the wall, 94 bottles of beer.\n" +
                "Take one down and pass around, 93 bottles of beer on the wall.\n" +
                
                "93 bottles of beer on the wall, 93 bottles of beer.\n" +
                "Take one down and pass around, 92 bottles of beer on the wall.\n" +
                
                "92 bottles of beer on the wall, 92 bottles of beer.\n" +
                "Take one down and pass around, 91 bottles of beer on the wall.\n" +
                
                "91 bottles of beer on the wall, 91 bottles of beer.\n" +
                "Take one down and pass around, 90 bottles of beer on the wall.\n" +
                
                "90 bottles of beer on the wall, 90 bottles of beer.\n" +
                "Take one down and pass around, 89 bottles of beer on the wall.\n" +
                
                "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take one down and pass around, 88 bottles of beer on the wall.\n" +
                
                "88 bottles of beer on the wall, 88 bottles of beer.\n" +
                "Take one down and pass around, 87 bottles of beer on the wall.\n" +
                
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take one down and pass around, 86 bottles of beer on the wall.\n" +
                
                "86 bottles of beer on the wall, 86 bottles of beer.\n" +
                "Take one down and pass around, 85 bottles of beer on the wall.\n" +
                
                "85 bottles of beer on the wall, 85 bottles of beer.\n" +
                "Take one down and pass around, 84 bottles of beer on the wall.\n" +
                
                "84 bottles of beer on the wall, 84 bottles of beer.\n" +
                "Take one down and pass around, 83 bottles of beer on the wall.\n" +
                
                "83 bottles of beer on the wall, 83 bottles of beer.\n" +
                "Take one down and pass around, 82 bottles of beer on the wall.\n" +
                
                "82 bottles of beer on the wall, 82 bottles of beer.\n" +
                "Take one down and pass around, 81 bottles of beer on the wall.\n" +
                
                "81 bottles of beer on the wall, 81 bottles of beer.\n" +
                "Take one down and pass around, 80 bottles of beer on the wall.\n" +
                
                "80 bottles of beer on the wall, 80 bottles of beer.\n" +
                "Take one down and pass around, 79 bottles of beer on the wall.\n" +
                
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take one down and pass around, 78 bottles of beer on the wall.\n" +
                
                "78 bottles of beer on the wall, 78 bottles of beer.\n" +
                "Take one down and pass around, 77 bottles of beer on the wall.\n" +
                
                "77 bottles of beer on the wall, 77 bottles of beer.\n" +
                "Take one down and pass around, 76 bottles of beer on the wall.\n" +
                
                "76 bottles of beer on the wall, 76 bottles of beer.\n" +
                "Take one down and pass around, 75 bottles of beer on the wall.\n" +
                
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take one down and pass around, 74 bottles of beer on the wall.\n" +
                
                "74 bottles of beer on the wall, 74 bottles of beer.\n" +
                "Take one down and pass around, 73 bottles of beer on the wall.\n" +
                
                "73 bottles of beer on the wall, 73 bottles of beer.\n" +
                "Take one down and pass around, 72 bottles of beer on the wall.\n" +
                
                "72 bottles of beer on the wall, 72 bottles of beer.\n" +
                "Take one down and pass around, 71 bottles of beer on the wall.\n" +
                
                "71 bottles of beer on the wall, 71 bottles of beer.\n" +
                "Take one down and pass around, 70 bottles of beer on the wall.\n" +
                
                "70 bottles of beer on the wall, 70 bottles of beer.\n" +
                "Take one down and pass around, 69 bottles of beer on the wall.\n" +
                
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take one down and pass around, 68 bottles of beer on the wall.\n" +
                
                "68 bottles of beer on the wall, 68 bottles of beer.\n" +
                "Take one down and pass around, 67 bottles of beer on the wall.\n" +
                
                "67 bottles of beer on the wall, 67 bottles of beer.\n" +
                "Take one down and pass around, 66 bottles of beer on the wall.\n" +
                
                "66 bottles of beer on the wall, 66 bottles of beer.\n" +
                "Take one down and pass around, 65 bottles of beer on the wall.\n" +
                
                "65 bottles of beer on the wall, 65 bottles of beer.\n" +
                "Take one down and pass around, 64 bottles of beer on the wall.\n" +
                
                "64 bottles of beer on the wall, 64 bottles of beer.\n" +
                "Take one down and pass around, 63 bottles of beer on the wall.\n" +
                
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take one down and pass around, 62 bottles of beer on the wall.\n" +
                
                "62 bottles of beer on the wall, 62 bottles of beer.\n" +
                "Take one down and pass around, 61 bottles of beer on the wall.\n" +
                
                "61 bottles of beer on the wall, 61 bottles of beer.\n" +
                "Take one down and pass around, 60 bottles of beer on the wall.\n" +
                
                "60 bottles of beer on the wall, 60 bottles of beer.\n" +
                "Take one down and pass around, 59 bottles of beer on the wall.\n" +
                
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take one down and pass around, 58 bottles of beer on the wall.\n" +
                
                "58 bottles of beer on the wall, 58 bottles of beer.\n" +
                "Take one down and pass around, 57 bottles of beer on the wall.\n" +
                
                "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                "Take one down and pass around, 56 bottles of beer on the wall.\n" +
                
                "56 bottles of beer on the wall, 56 bottles of beer.\n" +
                "Take one down and pass around, 55 bottles of beer on the wall.\n" +
                
                "55 bottles of beer on the wall, 55 bottles of beer.\n" +
                "Take one down and pass around, 54 bottles of beer on the wall.\n" +
                
                "54 bottles of beer on the wall, 54 bottles of beer.\n" +
                "Take one down and pass around, 53 bottles of beer on the wall.\n" +
                
                "53 bottles of beer on the wall, 53 bottles of beer.\n" +
                "Take one down and pass around, 52 bottles of beer on the wall.\n" +
                
                "52 bottles of beer on the wall, 52 bottles of beer.\n" +
                "Take one down and pass around, 51 bottles of beer on the wall.\n" +
                
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take one down and pass around, 50 bottles of beer on the wall.\n" +
                
                "50 bottles of beer on the wall, 50 bottles of beer.\n" +
                "Take one down and pass around, 49 bottles of beer on the wall.\n" +
                
                "49 bottles of beer on the wall, 49 bottles of beer.\n" +
                "Take one down and pass around, 48 bottles of beer on the wall.\n" +
                
                "48 bottles of beer on the wall, 48 bottles of beer.\n" +
                "Take one down and pass around, 47 bottles of beer on the wall.\n" +
                
                "47 bottles of beer on the wall, 47 bottles of beer.\n" +
                "Take one down and pass around, 46 bottles of beer on the wall.\n" +
                
                "46 bottles of beer on the wall, 46 bottles of beer.\n" +
                "Take one down and pass around, 45 bottles of beer on the wall.\n" +
                
                "45 bottles of beer on the wall, 45 bottles of beer.\n" +
                "Take one down and pass around, 44 bottles of beer on the wall.\n" +
                
                "44 bottles of beer on the wall, 44 bottles of beer.\n" +
                "Take one down and pass around, 43 bottles of beer on the wall.\n" +
                
                "43 bottles of beer on the wall, 43 bottles of beer.\n" +
                "Take one down and pass around, 42 bottles of beer on the wall.\n" +
                
                "42 bottles of beer on the wall, 42 bottles of beer.\n" +
                "Take one down and pass around, 41 bottles of beer on the wall.\n" +
                
                "41 bottles of beer on the wall, 41 bottles of beer.\n" +
                "Take one down and pass around, 40 bottles of beer on the wall.\n" +
                
                "40 bottles of beer on the wall, 40 bottles of beer.\n" +
                "Take one down and pass around, 39 bottles of beer on the wall.\n" +
                
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take one down and pass around, 38 bottles of beer on the wall.\n" +
                
                "38 bottles of beer on the wall, 38 bottles of beer.\n" +
                "Take one down and pass around, 37 bottles of beer on the wall.\n" +
                
                "37 bottles of beer on the wall, 37 bottles of beer.\n" +
                "Take one down and pass around, 36 bottles of beer on the wall.\n" +
                
                "36 bottles of beer on the wall, 36 bottles of beer.\n" +
                "Take one down and pass around, 35 bottles of beer on the wall.\n" +
                
                "35 bottles of beer on the wall, 35 bottles of beer.\n" +
                "Take one down and pass around, 34 bottles of beer on the wall.\n" +
                
                "34 bottles of beer on the wall, 34 bottles of beer.\n" +
                "Take one down and pass around, 33 bottles of beer on the wall.\n" +
                
                "33 bottles of beer on the wall, 33 bottles of beer.\n" +
                "Take one down and pass around, 32 bottles of beer on the wall.\n" +
                
                "32 bottles of beer on the wall, 32 bottles of beer.\n" +
                "Take one down and pass around, 31 bottles of beer on the wall.\n" +
                
                "31 bottles of beer on the wall, 31 bottles of beer.\n" +
                "Take one down and pass around, 30 bottles of beer on the wall.\n" +
                
                "30 bottles of beer on the wall, 30 bottles of beer.\n" +
                "Take one down and pass around, 29 bottles of beer on the wall.\n" +
                
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take one down and pass around, 28 bottles of beer on the wall.\n" +
                
                "28 bottles of beer on the wall, 28 bottles of beer.\n" +
                "Take one down and pass around, 27 bottles of beer on the wall.\n" +
                
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take one down and pass around, 26 bottles of beer on the wall.\n" +
                
                "26 bottles of beer on the wall, 26 bottles of beer.\n" +
                "Take one down and pass around, 25 bottles of beer on the wall.\n" +
                
                "25 bottles of beer on the wall, 25 bottles of beer.\n" +
                "Take one down and pass around, 24 bottles of beer on the wall.\n" +
                
                "24 bottles of beer on the wall, 24 bottles of beer.\n" +
                "Take one down and pass around, 23 bottles of beer on the wall.\n" +
                
                "23 bottles of beer on the wall, 23 bottles of beer.\n" +
                "Take one down and pass around, 22 bottles of beer on the wall.\n" +
                
                "22 bottles of beer on the wall, 22 bottles of beer.\n" +
                "Take one down and pass around, 21 bottles of beer on the wall.\n" +
                
                "21 bottles of beer on the wall, 21 bottles of beer.\n" +
                "Take one down and pass around, 20 bottles of beer on the wall.\n" +
                
                "20 bottles of beer on the wall, 20 bottles of beer.\n" +
                "Take one down and pass around, 19 bottles of beer on the wall.\n" +
                
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take one down and pass around, 18 bottles of beer on the wall.\n" +
                
                "18 bottles of beer on the wall, 18 bottles of beer.\n" +
                "Take one down and pass around, 17 bottles of beer on the wall.\n" +
                
                "17 bottles of beer on the wall, 17 bottles of beer.\n" +
                "Take one down and pass around, 16 bottles of beer on the wall.\n" +
                
                "16 bottles of beer on the wall, 16 bottles of beer.\n" +
                "Take one down and pass around, 15 bottles of beer on the wall.\n" +
                
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take one down and pass around, 14 bottles of beer on the wall.\n" +
                
                "14 bottles of beer on the wall, 14 bottles of beer.\n" +
                "Take one down and pass around, 13 bottles of beer on the wall.\n" +
                
                "13 bottles of beer on the wall, 13 bottles of beer.\n" +
                "Take one down and pass around, 12 bottles of beer on the wall.\n" +
                
                "12 bottles of beer on the wall, 12 bottles of beer.\n" +
                "Take one down and pass around, 11 bottles of beer on the wall.\n" +
                
                "11 bottles of beer on the wall, 11 bottles of beer.\n" +
                "Take one down and pass around, 10 bottles of beer on the wall.\n" +
                
                "10 bottles of beer on the wall, 10 bottles of beer.\n" +
                "Take one down and pass around, 9 bottles of beer on the wall.\n" +
                
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take one down and pass around, 8 bottles of beer on the wall.\n" +
                
                "8 bottles of beer on the wall, 8 bottles of beer.\n" +
                "Take one down and pass around, 7 bottles of beer on the wall.\n" +
                
                "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take one down and pass around, 6 bottles of beer on the wall.\n" +
                
                "6 bottles of beer on the wall, 6 bottles of beer.\n" +
                "Take one down and pass around, 5 bottles of beer on the wall.\n" +
                
                "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take one down and pass around, 4 bottles of beer on the wall.\n" +
                
                "4 bottles of beer on the wall, 4 bottles of beer.\n" +
                "Take one down and pass around, 3 bottles of beer on the wall.\n" +
                
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass around, 2 bottles of beer on the wall.\n" +
                
                "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass around, 1 bottle of beer on the wall.\n" +
                
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass around, no more bottles of beer on the wall.\n" +
                
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }

    @Test
    public void test2(){
        final String bottleSongLyrics = new BottleSong(2).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take two down and pass around, 97 bottles of beer on the wall.\n" +
                "97 bottles of beer on the wall, 97 bottles of beer.\n" +
                "Take two down and pass around, 95 bottles of beer on the wall.\n" +
                "95 bottles of beer on the wall, 95 bottles of beer.\n" +
                "Take two down and pass around, 93 bottles of beer on the wall.\n" +
                "93 bottles of beer on the wall, 93 bottles of beer.\n" +
                "Take two down and pass around, 91 bottles of beer on the wall.\n" +
                "91 bottles of beer on the wall, 91 bottles of beer.\n" +
                "Take two down and pass around, 89 bottles of beer on the wall.\n" +
                "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take two down and pass around, 87 bottles of beer on the wall.\n" +
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take two down and pass around, 85 bottles of beer on the wall.\n" +
                "85 bottles of beer on the wall, 85 bottles of beer.\n" +
                "Take two down and pass around, 83 bottles of beer on the wall.\n" +
                "83 bottles of beer on the wall, 83 bottles of beer.\n" +
                "Take two down and pass around, 81 bottles of beer on the wall.\n" +
                "81 bottles of beer on the wall, 81 bottles of beer.\n" +
                "Take two down and pass around, 79 bottles of beer on the wall.\n" +
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take two down and pass around, 77 bottles of beer on the wall.\n" +
                "77 bottles of beer on the wall, 77 bottles of beer.\n" +
                "Take two down and pass around, 75 bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take two down and pass around, 73 bottles of beer on the wall.\n" +
                "73 bottles of beer on the wall, 73 bottles of beer.\n" +
                "Take two down and pass around, 71 bottles of beer on the wall.\n" +
                "71 bottles of beer on the wall, 71 bottles of beer.\n" +
                "Take two down and pass around, 69 bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take two down and pass around, 67 bottles of beer on the wall.\n" +
                "67 bottles of beer on the wall, 67 bottles of beer.\n" +
                "Take two down and pass around, 65 bottles of beer on the wall.\n" +
                "65 bottles of beer on the wall, 65 bottles of beer.\n" +
                "Take two down and pass around, 63 bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take two down and pass around, 61 bottles of beer on the wall.\n" +
                "61 bottles of beer on the wall, 61 bottles of beer.\n" +
                "Take two down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take two down and pass around, 57 bottles of beer on the wall.\n" +
                "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                "Take two down and pass around, 55 bottles of beer on the wall.\n" +
                "55 bottles of beer on the wall, 55 bottles of beer.\n" +
                "Take two down and pass around, 53 bottles of beer on the wall.\n" +
                "53 bottles of beer on the wall, 53 bottles of beer.\n" +
                "Take two down and pass around, 51 bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take two down and pass around, 49 bottles of beer on the wall.\n" +
                "49 bottles of beer on the wall, 49 bottles of beer.\n" +
                "Take two down and pass around, 47 bottles of beer on the wall.\n" +
                "47 bottles of beer on the wall, 47 bottles of beer.\n" +
                "Take two down and pass around, 45 bottles of beer on the wall.\n" +
                "45 bottles of beer on the wall, 45 bottles of beer.\n" +
                "Take two down and pass around, 43 bottles of beer on the wall.\n" +
                "43 bottles of beer on the wall, 43 bottles of beer.\n" +
                "Take two down and pass around, 41 bottles of beer on the wall.\n" +
                "41 bottles of beer on the wall, 41 bottles of beer.\n" +
                "Take two down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take two down and pass around, 37 bottles of beer on the wall.\n" +
                "37 bottles of beer on the wall, 37 bottles of beer.\n" +
                "Take two down and pass around, 35 bottles of beer on the wall.\n" +
                "35 bottles of beer on the wall, 35 bottles of beer.\n" +
                "Take two down and pass around, 33 bottles of beer on the wall.\n" +
                "33 bottles of beer on the wall, 33 bottles of beer.\n" +
                "Take two down and pass around, 31 bottles of beer on the wall.\n" +
                "31 bottles of beer on the wall, 31 bottles of beer.\n" +
                "Take two down and pass around, 29 bottles of beer on the wall.\n" +
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take two down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take two down and pass around, 25 bottles of beer on the wall.\n" +
                "25 bottles of beer on the wall, 25 bottles of beer.\n" +
                "Take two down and pass around, 23 bottles of beer on the wall.\n" +
                "23 bottles of beer on the wall, 23 bottles of beer.\n" +
                "Take two down and pass around, 21 bottles of beer on the wall.\n" +
                "21 bottles of beer on the wall, 21 bottles of beer.\n" +
                "Take two down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take two down and pass around, 17 bottles of beer on the wall.\n" +
                "17 bottles of beer on the wall, 17 bottles of beer.\n" +
                "Take two down and pass around, 15 bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take two down and pass around, 13 bottles of beer on the wall.\n" +
                "13 bottles of beer on the wall, 13 bottles of beer.\n" +
                "Take two down and pass around, 11 bottles of beer on the wall.\n" +
                "11 bottles of beer on the wall, 11 bottles of beer.\n" +
                "Take two down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take two down and pass around, 7 bottles of beer on the wall.\n" +
                "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take two down and pass around, 5 bottles of beer on the wall.\n" +
                "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take two down and pass around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take two down and pass around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test3(){
        final String bottleSongLyrics = new BottleSong(3).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take three down and pass around, 96 bottles of beer on the wall.\n" +
                "96 bottles of beer on the wall, 96 bottles of beer.\n" +
                "Take three down and pass around, 93 bottles of beer on the wall.\n" +
                "93 bottles of beer on the wall, 93 bottles of beer.\n" +
                "Take three down and pass around, 90 bottles of beer on the wall.\n" +
                "90 bottles of beer on the wall, 90 bottles of beer.\n" +
                "Take three down and pass around, 87 bottles of beer on the wall.\n" +
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take three down and pass around, 84 bottles of beer on the wall.\n" +
                "84 bottles of beer on the wall, 84 bottles of beer.\n" +
                "Take three down and pass around, 81 bottles of beer on the wall.\n" +
                "81 bottles of beer on the wall, 81 bottles of beer.\n" +
                "Take three down and pass around, 78 bottles of beer on the wall.\n" +
                "78 bottles of beer on the wall, 78 bottles of beer.\n" +
                "Take three down and pass around, 75 bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take three down and pass around, 72 bottles of beer on the wall.\n" +
                "72 bottles of beer on the wall, 72 bottles of beer.\n" +
                "Take three down and pass around, 69 bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take three down and pass around, 66 bottles of beer on the wall.\n" +
                "66 bottles of beer on the wall, 66 bottles of beer.\n" +
                "Take three down and pass around, 63 bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take three down and pass around, 60 bottles of beer on the wall.\n" +
                "60 bottles of beer on the wall, 60 bottles of beer.\n" +
                "Take three down and pass around, 57 bottles of beer on the wall.\n" +
                "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                "Take three down and pass around, 54 bottles of beer on the wall.\n" +
                "54 bottles of beer on the wall, 54 bottles of beer.\n" +
                "Take three down and pass around, 51 bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take three down and pass around, 48 bottles of beer on the wall.\n" +
                "48 bottles of beer on the wall, 48 bottles of beer.\n" +
                "Take three down and pass around, 45 bottles of beer on the wall.\n" +
                "45 bottles of beer on the wall, 45 bottles of beer.\n" +
                "Take three down and pass around, 42 bottles of beer on the wall.\n" +
                "42 bottles of beer on the wall, 42 bottles of beer.\n" +
                "Take three down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take three down and pass around, 36 bottles of beer on the wall.\n" +
                "36 bottles of beer on the wall, 36 bottles of beer.\n" +
                "Take three down and pass around, 33 bottles of beer on the wall.\n" +
                "33 bottles of beer on the wall, 33 bottles of beer.\n" +
                "Take three down and pass around, 30 bottles of beer on the wall.\n" +
                "30 bottles of beer on the wall, 30 bottles of beer.\n" +
                "Take three down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take three down and pass around, 24 bottles of beer on the wall.\n" +
                "24 bottles of beer on the wall, 24 bottles of beer.\n" +
                "Take three down and pass around, 21 bottles of beer on the wall.\n" +
                "21 bottles of beer on the wall, 21 bottles of beer.\n" +
                "Take three down and pass around, 18 bottles of beer on the wall.\n" +
                "18 bottles of beer on the wall, 18 bottles of beer.\n" +
                "Take three down and pass around, 15 bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take three down and pass around, 12 bottles of beer on the wall.\n" +
                "12 bottles of beer on the wall, 12 bottles of beer.\n" +
                "Take three down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take three down and pass around, 6 bottles of beer on the wall.\n" +
                "6 bottles of beer on the wall, 6 bottles of beer.\n" +
                "Take three down and pass around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take three down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test4(){
        final String bottleSongLyrics = new BottleSong(4).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take four down and pass around, 95 bottles of beer on the wall.\n" +
                "95 bottles of beer on the wall, 95 bottles of beer.\n" +
                "Take four down and pass around, 91 bottles of beer on the wall.\n" +
                "91 bottles of beer on the wall, 91 bottles of beer.\n" +
                "Take four down and pass around, 87 bottles of beer on the wall.\n" +
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take four down and pass around, 83 bottles of beer on the wall.\n" +
                "83 bottles of beer on the wall, 83 bottles of beer.\n" +
                "Take four down and pass around, 79 bottles of beer on the wall.\n" +
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take four down and pass around, 75 bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take four down and pass around, 71 bottles of beer on the wall.\n" +
                "71 bottles of beer on the wall, 71 bottles of beer.\n" +
                "Take four down and pass around, 67 bottles of beer on the wall.\n" +
                "67 bottles of beer on the wall, 67 bottles of beer.\n" +
                "Take four down and pass around, 63 bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take four down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take four down and pass around, 55 bottles of beer on the wall.\n" +
                "55 bottles of beer on the wall, 55 bottles of beer.\n" +
                "Take four down and pass around, 51 bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take four down and pass around, 47 bottles of beer on the wall.\n" +
                "47 bottles of beer on the wall, 47 bottles of beer.\n" +
                "Take four down and pass around, 43 bottles of beer on the wall.\n" +
                "43 bottles of beer on the wall, 43 bottles of beer.\n" +
                "Take four down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take four down and pass around, 35 bottles of beer on the wall.\n" +
                "35 bottles of beer on the wall, 35 bottles of beer.\n" +
                "Take four down and pass around, 31 bottles of beer on the wall.\n" +
                "31 bottles of beer on the wall, 31 bottles of beer.\n" +
                "Take four down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take four down and pass around, 23 bottles of beer on the wall.\n" +
                "23 bottles of beer on the wall, 23 bottles of beer.\n" +
                "Take four down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take four down and pass around, 15 bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take four down and pass around, 11 bottles of beer on the wall.\n" +
                "11 bottles of beer on the wall, 11 bottles of beer.\n" +
                "Take four down and pass around, 7 bottles of beer on the wall.\n" +
                "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take four down and pass around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take three down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test5(){
        final String bottleSongLyrics = new BottleSong(5).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take five down and pass around, 94 bottles of beer on the wall.\n" +
                "94 bottles of beer on the wall, 94 bottles of beer.\n" +
                "Take five down and pass around, 89 bottles of beer on the wall.\n" +
                "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take five down and pass around, 84 bottles of beer on the wall.\n" +
                "84 bottles of beer on the wall, 84 bottles of beer.\n" +
                "Take five down and pass around, 79 bottles of beer on the wall.\n" +
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take five down and pass around, 74 bottles of beer on the wall.\n" +
                "74 bottles of beer on the wall, 74 bottles of beer.\n" +
                "Take five down and pass around, 69 bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take five down and pass around, 64 bottles of beer on the wall.\n" +
                "64 bottles of beer on the wall, 64 bottles of beer.\n" +
                "Take five down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take five down and pass around, 54 bottles of beer on the wall.\n" +
                "54 bottles of beer on the wall, 54 bottles of beer.\n" +
                "Take five down and pass around, 49 bottles of beer on the wall.\n" +
                "49 bottles of beer on the wall, 49 bottles of beer.\n" +
                "Take five down and pass around, 44 bottles of beer on the wall.\n" +
                "44 bottles of beer on the wall, 44 bottles of beer.\n" +
                "Take five down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take five down and pass around, 34 bottles of beer on the wall.\n" +
                "34 bottles of beer on the wall, 34 bottles of beer.\n" +
                "Take five down and pass around, 29 bottles of beer on the wall.\n" +
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take five down and pass around, 24 bottles of beer on the wall.\n" +
                "24 bottles of beer on the wall, 24 bottles of beer.\n" +
                "Take five down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take five down and pass around, 14 bottles of beer on the wall.\n" +
                "14 bottles of beer on the wall, 14 bottles of beer.\n" +
                "Take five down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take five down and pass around, 4 bottles of beer on the wall.\n" +
                "4 bottles of beer on the wall, 4 bottles of beer.\n" +
                "Take four down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test6(){
        final String bottleSongLyrics = new BottleSong(6).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take six down and pass around, 93 bottles of beer on the wall.\n" +
                "93 bottles of beer on the wall, 93 bottles of beer.\n" +
                "Take six down and pass around, 87 bottles of beer on the wall.\n" +
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take six down and pass around, 81 bottles of beer on the wall.\n" +
                "81 bottles of beer on the wall, 81 bottles of beer.\n" +
                "Take six down and pass around, 75 bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take six down and pass around, 69 bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take six down and pass around, 63 bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take six down and pass around, 57 bottles of beer on the wall.\n" +
                "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                "Take six down and pass around, 51 bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take six down and pass around, 45 bottles of beer on the wall.\n" +
                "45 bottles of beer on the wall, 45 bottles of beer.\n" +
                "Take six down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take six down and pass around, 33 bottles of beer on the wall.\n" +
                "33 bottles of beer on the wall, 33 bottles of beer.\n" +
                "Take six down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take six down and pass around, 21 bottles of beer on the wall.\n" +
                "21 bottles of beer on the wall, 21 bottles of beer.\n" +
                "Take six down and pass around, 15 bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take six down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take six down and pass around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take three down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test7(){
        final String bottleSongLyrics = new BottleSong(7).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take seven down and pass around, 92 bottles of beer on the wall.\n" +
                "92 bottles of beer on the wall, 92 bottles of beer.\n" +
                "Take seven down and pass around, 85 bottles of beer on the wall.\n" +
                "85 bottles of beer on the wall, 85 bottles of beer.\n" +
                "Take seven down and pass around, 78 bottles of beer on the wall.\n" +
                "78 bottles of beer on the wall, 78 bottles of beer.\n" +
                "Take seven down and pass around, 71 bottles of beer on the wall.\n" +
                "71 bottles of beer on the wall, 71 bottles of beer.\n" +
                "Take seven down and pass around, 64 bottles of beer on the wall.\n" +
                "64 bottles of beer on the wall, 64 bottles of beer.\n" +
                "Take seven down and pass around, 57 bottles of beer on the wall.\n" +
                "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                "Take seven down and pass around, 50 bottles of beer on the wall.\n" +
                "50 bottles of beer on the wall, 50 bottles of beer.\n" +
                "Take seven down and pass around, 43 bottles of beer on the wall.\n" +
                "43 bottles of beer on the wall, 43 bottles of beer.\n" +
                "Take seven down and pass around, 36 bottles of beer on the wall.\n" +
                "36 bottles of beer on the wall, 36 bottles of beer.\n" +
                "Take seven down and pass around, 29 bottles of beer on the wall.\n" +
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take seven down and pass around, 22 bottles of beer on the wall.\n" +
                "22 bottles of beer on the wall, 22 bottles of beer.\n" +
                "Take seven down and pass around, 15 bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take seven down and pass around, 8 bottles of beer on the wall.\n" +
                "8 bottles of beer on the wall, 8 bottles of beer.\n" +
                "Take seven down and pass around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
     @Test
     public void test60(){
         final String bottleSongLyrics = new BottleSong(60).getBottleSongLyrics();
         assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                         "Take sixty down and pass around, 39 bottles of beer on the wall.\n" +
                         "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                         "Take thirty nine down and pass around, no more bottles of beer on the wall.\n" +
                         "No more bottles of beer on the wall, no more bottles of beer.\n" +
                         "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
                 bottleSongLyrics);
     }
    @Test
    public void test8(){
        final String bottleSongLyrics = new BottleSong(8).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take eight down and pass around, 91 bottles of beer on the wall.\n" +
                "91 bottles of beer on the wall, 91 bottles of beer.\n" +
                "Take eight down and pass around, 83 bottles of beer on the wall.\n" +
                "83 bottles of beer on the wall, 83 bottles of beer.\n" +
                "Take eight down and pass around, 75 bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take eight down and pass around, 67 bottles of beer on the wall.\n" +
                "67 bottles of beer on the wall, 67 bottles of beer.\n" +
                "Take eight down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take eight down and pass around, 51 bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take eight down and pass around, 43 bottles of beer on the wall.\n" +
                "43 bottles of beer on the wall, 43 bottles of beer.\n" +
                "Take eight down and pass around, 35 bottles of beer on the wall.\n" +
                "35 bottles of beer on the wall, 35 bottles of beer.\n" +
                "Take eight down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take eight down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take eight down and pass around, 11 bottles of beer on the wall.\n" +
                "11 bottles of beer on the wall, 11 bottles of beer.\n" +
                "Take eight down and pass around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take three down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test9(){
        final String bottleSongLyrics = new BottleSong(9).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take nine down and pass around, 90 bottles of beer on the wall.\n" +
                "90 bottles of beer on the wall, 90 bottles of beer.\n" +
                "Take nine down and pass around, 81 bottles of beer on the wall.\n" +
                "81 bottles of beer on the wall, 81 bottles of beer.\n" +
                "Take nine down and pass around, 72 bottles of beer on the wall.\n" +
                "72 bottles of beer on the wall, 72 bottles of beer.\n" +
                "Take nine down and pass around, 63 bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take nine down and pass around, 54 bottles of beer on the wall.\n" +
                "54 bottles of beer on the wall, 54 bottles of beer.\n" +
                "Take nine down and pass around, 45 bottles of beer on the wall.\n" +
                "45 bottles of beer on the wall, 45 bottles of beer.\n" +
                "Take nine down and pass around, 36 bottles of beer on the wall.\n" +
                "36 bottles of beer on the wall, 36 bottles of beer.\n" +
                "Take nine down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take nine down and pass around, 18 bottles of beer on the wall.\n" +
                "18 bottles of beer on the wall, 18 bottles of beer.\n" +
                "Take nine down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take nine down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test10(){
        final String bottleSongLyrics = new BottleSong(10).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take ten down and pass around, 89 bottles of beer on the wall.\n" +
                "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take ten down and pass around, 79 bottles of beer on the wall.\n" +
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take ten down and pass around, 69 bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take ten down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take ten down and pass around, 49 bottles of beer on the wall.\n" +
                "49 bottles of beer on the wall, 49 bottles of beer.\n" +
                "Take ten down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take ten down and pass around, 29 bottles of beer on the wall.\n" +
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take ten down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take ten down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take nine down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }

    @Test
    public void test12(){
        final String bottleSongLyrics = new BottleSong(12).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take twelve down and pass around, 87 bottles of beer on the wall.\n" +
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take twelve down and pass around, 75 bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take twelve down and pass around, 63 bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take twelve down and pass around, 51 bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take twelve down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take twelve down and pass around, 27 bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take twelve down and pass around, 15 bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take twelve down and pass around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take three down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test17(){
        final String bottleSongLyrics = new BottleSong(17).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take seventeen down and pass around, 82 bottles of beer on the wall.\n" +
                "82 bottles of beer on the wall, 82 bottles of beer.\n" +
                "Take seventeen down and pass around, 65 bottles of beer on the wall.\n" +
                "65 bottles of beer on the wall, 65 bottles of beer.\n" +
                "Take seventeen down and pass around, 48 bottles of beer on the wall.\n" +
                "48 bottles of beer on the wall, 48 bottles of beer.\n" +
                "Take seventeen down and pass around, 31 bottles of beer on the wall.\n" +
                "31 bottles of beer on the wall, 31 bottles of beer.\n" +
                "Take seventeen down and pass around, 14 bottles of beer on the wall.\n" +
                "14 bottles of beer on the wall, 14 bottles of beer.\n" +
                "Take fourteen down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test20(){
        final String bottleSongLyrics = new BottleSong(20).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take twenty down and pass around, 79 bottles of beer on the wall.\n" +
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take twenty down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take twenty down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take twenty down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take nineteen down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test30(){
        final String bottleSongLyrics = new BottleSong(30).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take thirty down and pass around, 69 bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take thirty down and pass around, 39 bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take thirty down and pass around, 9 bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take nine down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test40(){
        final String bottleSongLyrics = new BottleSong(40).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take forty down and pass around, 59 bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take forty down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take nineteen down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test50(){
        final String bottleSongLyrics = new BottleSong(50).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take fifty down and pass around, 49 bottles of beer on the wall.\n" +
                "49 bottles of beer on the wall, 49 bottles of beer.\n" +
                "Take forty nine down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
     @Test
     public void test11(){
         final String bottleSongLyrics = new BottleSong(11).getBottleSongLyrics();
         assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                         "Take eleven down and pass around, 88 bottles of beer on the wall.\n" +
                         "88 bottles of beer on the wall, 88 bottles of beer.\n" +
                         "Take eleven down and pass around, 77 bottles of beer on the wall.\n" +
                         "77 bottles of beer on the wall, 77 bottles of beer.\n" +
                         "Take eleven down and pass around, 66 bottles of beer on the wall.\n" +
                         "66 bottles of beer on the wall, 66 bottles of beer.\n" +
                         "Take eleven down and pass around, 55 bottles of beer on the wall.\n" +
                         "55 bottles of beer on the wall, 55 bottles of beer.\n" +
                         "Take eleven down and pass around, 44 bottles of beer on the wall.\n" +
                         "44 bottles of beer on the wall, 44 bottles of beer.\n" +
                         "Take eleven down and pass around, 33 bottles of beer on the wall.\n" +
                         "33 bottles of beer on the wall, 33 bottles of beer.\n" +
                         "Take eleven down and pass around, 22 bottles of beer on the wall.\n" +
                         "22 bottles of beer on the wall, 22 bottles of beer.\n" +
                         "Take eleven down and pass around, 11 bottles of beer on the wall.\n" +
                         "11 bottles of beer on the wall, 11 bottles of beer.\n" +
                         "Take eleven down and pass around, no more bottles of beer on the wall.\n" +
                         "No more bottles of beer on the wall, no more bottles of beer.\n" +
                         "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
                 bottleSongLyrics);
     }

    @Test
    public void test70(){
        final String bottleSongLyrics = new BottleSong(70).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take seventy down and pass around, 29 bottles of beer on the wall.\n" +
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take twenty nine down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test80(){
        final String bottleSongLyrics = new BottleSong(80).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take eighty down and pass around, 19 bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take nineteen down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }



    @Test
    public void test55(){
        final String bottleSongLyrics = new BottleSong(55).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take fifty five down and pass around, 44 bottles of beer on the wall.\n" +
                "44 bottles of beer on the wall, 44 bottles of beer.\n" +
                "Take forty four down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
     @Test
     public void test78(){
         final String bottleSongLyrics = new BottleSong(78).getBottleSongLyrics();
         assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                         "Take seventy eight down and pass around, 21 bottles of beer on the wall.\n" +
                         "21 bottles of beer on the wall, 21 bottles of beer.\n" +
                         "Take twenty one down and pass around, no more bottles of beer on the wall.\n" +
                         "No more bottles of beer on the wall, no more bottles of beer.\n" +
                         "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
                 bottleSongLyrics);
     }
    @Test
    public void tes99(){
        final String bottleSongLyrics = new BottleSong(99).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take ninety nine down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
    @Test
    public void test61(){
        final String bottleSongLyrics = new BottleSong(61).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take sixty one down and pass around, 38 bottles of beer on the wall.\n" +
                "38 bottles of beer on the wall, 38 bottles of beer.\n" +
                "Take thirty eight down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }
     @Test
     public void test24(){
         final String bottleSongLyrics = new BottleSong(24).getBottleSongLyrics();
         assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                         "Take twenty four down and pass around, 75 bottles of beer on the wall.\n" +
                         "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                         "Take twenty four down and pass around, 51 bottles of beer on the wall.\n" +
                         "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                         "Take twenty four down and pass around, 27 bottles of beer on the wall.\n" +
                         "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                         "Take twenty four down and pass around, 3 bottles of beer on the wall.\n" +
                         "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                         "Take three down and pass around, no more bottles of beer on the wall.\n" +
                         "No more bottles of beer on the wall, no more bottles of beer.\n" +
                         "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
                 bottleSongLyrics);
     }

     @Test
     public void test21(){
         final String bottleSongLyrics = new BottleSong(21).getBottleSongLyrics();
         assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                         "Take twenty one down and pass around, 78 bottles of beer on the wall.\n" +
                         "78 bottles of beer on the wall, 78 bottles of beer.\n" +
                         "Take twenty one down and pass around, 57 bottles of beer on the wall.\n" +
                         "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                         "Take twenty one down and pass around, 36 bottles of beer on the wall.\n" +
                         "36 bottles of beer on the wall, 36 bottles of beer.\n" +
                         "Take twenty one down and pass around, 15 bottles of beer on the wall.\n" +
                         "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                         "Take fifteen down and pass around, no more bottles of beer on the wall.\n" +
                         "No more bottles of beer on the wall, no more bottles of beer.\n" +
                         "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
                 bottleSongLyrics);
     }
     @Test
     public void test90(){
         final String bottleSongLyrics = new BottleSong(90).getBottleSongLyrics();
         assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                         "Take ninety down and pass around, 9 bottles of beer on the wall.\n" +
                         "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                         "Take nine down and pass around, no more bottles of beer on the wall.\n" +
                         "No more bottles of beer on the wall, no more bottles of beer.\n" +
                         "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
                 bottleSongLyrics);
     }
    @Test
    public void test86(){
        final String bottleSongLyrics = new BottleSong(86).getBottleSongLyrics();
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take eighty six down and pass around, 13 bottles of beer on the wall.\n" +
                "13 bottles of beer on the wall, 13 bottles of beer.\n" +
                "Take thirteen down and pass around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n",
            bottleSongLyrics);
    }

     @Test
     public void testMinus79(){
         assertThrows(IllegalArgumentException.class, () -> new BottleSong(-79).getBottleSongLyrics());
     }
     @Test
     public void test672(){
         assertThrows(IllegalArgumentException.class, () -> new BottleSong(672).getBottleSongLyrics());
     }

    @Test
    public void test100(){
        assertThrows(IllegalArgumentException.class, () -> new BottleSong(100).getBottleSongLyrics());
    }

    @Test
    public void test0(){
        assertThrows(IllegalArgumentException.class, () -> new BottleSong(0).getBottleSongLyrics());
    }
     @Test
     public void testMinus1(){
         assertThrows(IllegalArgumentException.class, () -> new BottleSong(-1).getBottleSongLyrics());
     }
}