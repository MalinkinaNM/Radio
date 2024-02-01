package ru.netology.statistic;

public class Radio {


    private int currentVolume;          // текущая громкость
    private int currentRadioStation;        // текущая радиостанция

    public int getCurrentRadioStation() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {  // установка радиостанции
        if (CurrentRadioStation > 9) {
            return;
        }
        if (CurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }
    public int getCurrentVolume() {
        return currentRadioStation;
    }


    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }


    public void volumeUp() {                // увеличение громкости на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {              // уменьшение громкости на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {                // следущая радиостанция
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {                // предыдущая радиостанция
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

}

