package ru.netology.javaqa_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {
    Radio rad = new Radio();

    // тест переменных по умолчанию
    @Test
    public void variablesTest() {
        Assertions.assertEquals(10, rad.getQuantityStation());
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(9, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getCurrentStation());
        Assertions.assertEquals(0, rad.getMinVolume());
        Assertions.assertEquals(100, rad.getMaxVolume());
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }
//    Radio rad = new Radio();  // объявляем для всех при значении кол-ва станций по умолчанию равное 10
//
//
//    // тест переменных по умолчанию
//    @Test
//    public void variablesTest() {
//        Assertions.assertEquals(10, rad.getQuantityStation());
//        Assertions.assertEquals(0, rad.getMinStation());
//        Assertions.assertEquals(9, rad.getMaxStation());
//        Assertions.assertEquals(0, rad.getCurrentStation());
//        Assertions.assertEquals(0, rad.getMinVolume());
//        Assertions.assertEquals(100, rad.getMaxVolume());
//        Assertions.assertEquals(0, rad.getCurrentVolume());
//    }
//
//
// ТЕСТ РАДИОСТАНЦИЙ

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
//        Radio rad = new Radio();
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
//        Radio rad = new Radio();
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
//        Radio rad = new Radio();
        rad.setCurrentStation(set);
        rad.prevStation();

        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // ТЕСТ ГРОМКОСТИ
    @ParameterizedTest
    @CsvSource({
            "100,100",
            "101,5",
            "9,9",
            "1,1",
            "0,0",
            "-1,5"
    })
    public void shouldSetVolume(int set, int expected) {
//        Radio rad = new Radio();
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
            "99,100",
            "100,100"
    })
    public void shouldNextVolume(int set, int expected) {
//        Radio rad = new Radio();
        rad.setCurrentVolume(set);
        rad.nextVolume();

        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тест громкости на уменьшение

    @ParameterizedTest
    @CsvSource({
            "100,99",
            "99,98",
            "1,0",
            "0,0"
    })
    public void shouldPrevVolume(int set, int expected) {
//        Radio rad = new Radio();
        rad.setCurrentVolume(set);
        rad.prevVolume();

        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    //    ТЕСТ РАДИО С ВВОДОМ КОЛИЧЕСТВА РАДИОСТАНЦИЙ


    // тест переменной количества станций (меняем на 100)
    @Test
    public void variablesTestNewStation() {
        Radio rad = new Radio(100, 0, 99, 0, 0, 100, 0);

        Assertions.assertEquals(100, rad.getQuantityStation());
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(99, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getCurrentStation());
        Assertions.assertEquals(0, rad.getMinVolume());
        Assertions.assertEquals(100, rad.getMaxVolume());
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }


// ТЕСТ РАДИОСТАНЦИЙ

    @ParameterizedTest
    @CsvSource({
            "100,5",
            "0,0",
            "1,1",
            "3,3",
            "99,99",
            "-1,5"
    })
    public void shouldSetStationNewStation(int set, int expected) {
        Radio rad = new Radio(100, 0, 99, 0, 0, 100, 0);
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
            "99,0",
            "98,99"
    })
    public void shouldNextStationNewStation(int set, int expected) {
        Radio rad = new Radio(100, 0, 99, 0, 0, 100, 0);
        rad.setCurrentStation(set);
        rad.nextStation();

        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    // проверка на уменьшение
    @ParameterizedTest
    @CsvSource({
            "99,98",
            "1,0",
            "0,99",
            "5,4"
    })
    public void shouldPrevStationNewStation(int set, int expected) {
        Radio rad = new Radio(100, 0, 99, 0, 0, 100, 0);
        rad.setCurrentStation(set);
        rad.prevStation();

        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}