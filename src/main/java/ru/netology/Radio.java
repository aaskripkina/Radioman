package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int minStation = 0;
    private int numberStation = 9;
    private int maxStation = 9;
    private final int maxVolume = 10;
    private final int minVolume = 0;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxStation = numberStation;
    }

    public Radio(int currentStation, int currentVolume, int numberStation, int maxStation) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.numberStation = numberStation;
        this.maxStation = maxStation;
    }

    public Radio() {
    }

    public int getMinStation() {
        return minStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int nextStation() {
        currentStation = currentStation < maxStation ? currentStation + 1 : minStation;
        return currentStation;
    }

    public int prevStation() {
        currentStation = currentStation > minStation ? currentStation - 1 : maxStation;
        return currentStation;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return currentVolume;
    }
}
