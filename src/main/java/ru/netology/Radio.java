package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int minStation;
    private int amountOfStation;
    private int maxStation;
    private final int maxVolume;
    private final int minVolume;


    public Radio() {
        setAmountOfStation(10);
        setMaxStation(getAmountOfStation()-1);
        minStation = 0;
        maxVolume = 100;
        minVolume = 0;

    }

    public Radio(int amountOfStation) {
        setAmountOfStation(amountOfStation);
        setMaxStation(getAmountOfStation()-1);
        minStation = 0;
        maxVolume = 100;
        minVolume = 0;
    }



    public void setAmountOfStation(int amountOfStation) {
        this.amountOfStation = amountOfStation;
    }

    public int getAmountOfStation() {
        return amountOfStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    private void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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