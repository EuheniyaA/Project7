package ru.netology.Domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation == 9 | currentRadioStation < 0 | currentRadioStation > 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void prev() {

        if (currentRadioStation < 0 | currentRadioStation > 9) {
            currentRadioStation = 0;
            return;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
        else {
            currentRadioStation = currentRadioStation - 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setManualSelection() {
        currentRadioStation = 5;
        if (currentRadioStation < 0 | currentRadioStation > 9) {
            return;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume < 0 | currentVolume > 10)  {
            currentVolume = 0;
            return;
        }

        if (currentVolume==10) {
            return;
        }
        this.currentVolume= currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume < 0 | currentVolume > 10)  {
            currentVolume = 0;
            return;
        }

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

        if (currentVolume==0) {
            return;
        }
        this.currentVolume= currentVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }
}





