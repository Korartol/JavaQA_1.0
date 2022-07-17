package ru.netology.javaqa_1.services;

public class Radio {

    // Блок станции
    private int quantityStation = 10;  // количество радиостанций по умолчанию
    private int minStation = 0;  // минимально возможная станция
    private int maxStation = quantityStation - 1;
    private int currentStation;

    public Radio () {  // Конструктор без параметров

    }
    public Radio (int quantityStation) {  // Конструктор
        this.quantityStation = quantityStation;
        this.maxStation = quantityStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMinStation () {
        return minStation;
    }
    public int getMaxStation () {
        return maxStation;
    }
    public int getQuantityStation () {
        return quantityStation;
    }

    // ввод конкретного значения станции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {  // при попытке ввести меньше минимальной станции - ничего не происходит
            return;
        }
        if (newCurrentStation > maxStation) {  // при попытке ввести больше максимальной станции - ничего не происходит
            return;
        }
        currentStation = newCurrentStation;  // при вводе значения от минимальной до максимальной станции - значение обновляется до введенного
    }

    // кнопка next
    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;  // переключаемся на следующую, если текущая меньше максимальной станции
        } else {
            currentStation = minStation;  // переключаемся на минимальную станцию, если текущая - максимальная
        }
    }

    // кнопка prev
    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;  // переключаемся на следующую вниз, если текущая больше минимальной станции
        } else {
            currentStation = maxStation;  // переключаемся на максимальную станцию, если текущая минимальная
        }
    }


    // Блок громкости


    private int minVolume = 0; // минимальная громкость
    private  int maxVolume = 100;  // максимальная громкость
    private int currentVolume;  // громкость по умолчанию

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMinVolume () {
        return minVolume;
    }
    public int getMaxVolume () {
        return maxVolume;
    }

    // ввод конкретного значения громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {  // при попытке ввести меньше minVolume - ничего не происходит
            return;
        }
        if (newCurrentVolume > maxVolume) {  // при попытке ввести больше maxVolume - ничего не происходит
            return;
        }
        currentVolume = newCurrentVolume;  // при вводе значения от minVolume до maxVolume - значение обновляется до введенного
    }

    // кнопка +
    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;  // переключаемся на следующую, если текущая меньше maxVolume
        }
    }

    // кнопка -
    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;  // переключаемся на следующую вниз, если текущая больше minVolume
        }
    }
}
