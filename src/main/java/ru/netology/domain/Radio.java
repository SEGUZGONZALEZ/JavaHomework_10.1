package ru.netology.domain;

public class Radio {

    private int currentStation;
    private final int minStation = 0;
    private int numberStation = 10;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;


    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation >= numberStation - 1) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(numberStation - 1);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > numberStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}