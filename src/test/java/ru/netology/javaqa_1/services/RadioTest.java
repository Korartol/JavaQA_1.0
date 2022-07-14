package ru.netology.javaqa_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// проверка на ввод станции

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "10,5",
            "0,0",
            "1,1",
            "3,3",
            "9,9",
            "-1,5"
    })
    public void shouldSetStation(int set, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(5);  // предположим что в памяти сейчас 5 станция
        rad.setCurrentStation(set);

        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    // проверка на увеличение

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "5,6",
            "9,0",
            "8,9"
    })
    public void shouldNextStation(int set, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(set);
        rad.nextStation();

        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    // проверка на уменьшение
    @ParameterizedTest
    @CsvSource({
            "9,8",
            "1,0",
            "0,9",
            "5,4"
    })
    public void shouldPrevStation(int set, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(set);
        rad.prevStation();

        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "10,10",
            "11,5",
            "9,9",
            "1,1",
            "0,0",
            "-1,5"
    })
    public void shouldSetVolume(int set, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);  // предположим что в памяти сейчас 5 громкость
        rad.setCurrentVolume(set);

        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тест громкости на увеличение

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "5,6",
            "9,10",
            "10,10"
    })
    public void shouldNextVolume(int set, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(set);
        rad.nextVolume();

        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тест громкости на уменьшение

    @ParameterizedTest
    @CsvSource({
            "10,9",
            "9,8",
            "1,0",
            "0,0"
    })
    public void shouldPrevVolume(int set, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(set);
        rad.prevVolume();

        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void shouldSetStation() {
//        Radio rad = new Radio();
//
//        rad.setCurrentStation(9);
//
//        int expected = 9;
//        int actual = rad.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nextStation() {
//        Radio rad = new Radio();
//        rad.setCurrentStation(8);  // задаем значение которое помнит радио
//
//        rad.nextStation();  // вызываем метод next
//
//        int expected = 9;  // ожидаем увеличения на 1
//        int actual = rad.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void prevStation() {
//        Radio rad = new Radio();
//        rad.setCurrentStation(7);  // задаем значение которое помнит радио
//
//        rad.prevStation();  // вызываем метод prev
//
//        int expected = 6;  // ожидаем уменьшение на 1
//        int actual = rad.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nextVolume() {
//        Radio rad = new Radio();
//        rad.setCurrentVolume(9);  // задаем значение которое помнит радио
//
//        rad.nextVolume();
//
//        int expected = 10;
//        int actual = rad.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void prevVolume() {
//        Radio rad = new Radio();
//        rad.setCurrentVolume(10);  // задаем значение которое помнит радио
//
//        rad.prevVolume();
//
//        int expected = 9;
//        int actual = rad.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

}
