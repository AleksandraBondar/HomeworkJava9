package ru.netology.smartHome;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public Radio(int quantitySt) {
        this.maxStation = quantitySt - 1;
        this.currentRadioStation = maxStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > maxStation) {
            return;
        }
        if (newRadioStation < minStation) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (volume < minVolume) {
            currentVolume = minVolume;
        }
        currentVolume = volume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}

