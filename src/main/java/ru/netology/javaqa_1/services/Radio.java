package ru.netology.javaqa_1.services;

public class Radio {

    // Блок станции
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    // ввод конкретного значения станции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {  // при попытке ввести меньше 0 - ничего не происходит
            return;
        }
        if (newCurrentStation > 9) {  // при попытке ввести больше 9 - ничего не происходит
            return;
        }
        currentStation = newCurrentStation;  // при вводе значения от 0 до 9 - значение обновляется до введенного
    }

    // кнопка next
    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;  // переключаемся на следующую, если текущая меньше 9
        } else {
            currentStation = 0;  // переключаемся на 0, если текущая 9
        }
    }

    // кнопка prev
    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;  // переключаемся на следующую вниз, если текущая больше 0
        } else {
            currentStation = 9;  // переключаемся на 9, если текущая 0
        }
    }


    // Блок громкости

    private int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }

    // ввод конкретного значения громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {  // при попытке ввести меньше 0 - ничего не происходит
            return;
        }
        if (newCurrentVolume > 10) {  // при попытке ввести больше 10 - ничего не происходит
            return;
        }
        currentVolume = newCurrentVolume;  // при вводе значения от 0 до 10 - значение обновляется до введенного
    }

    // кнопка +
    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume++;  // переключаемся на следующую, если текущая меньше 10
        }
    }

    // кнопка -
    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;  // переключаемся на следующую вниз, если текущая больше 0
        }
    }
}
