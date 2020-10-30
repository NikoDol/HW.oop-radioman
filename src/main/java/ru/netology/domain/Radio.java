package ru.netology.domain;

public class Radio {
    private int currentStation = 5;
    private int currentSound = 5;
    private int highStation = 9;
    private int lowStation = 0;
    private int minSound = 0;
    private int maxSound = 10;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation > highStation) {
            setCurrentStation(lowStation);
            return;
        }
        if (currentStation < lowStation) {
            setCurrentStation(highStation);
            return;
        }
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
        if (currentSound < minSound) {
            setCurrentSound(minSound);
            return;
        }
        if (currentSound > maxSound) {
            setCurrentSound(maxSound);
            return;
        }
    }

    public void nextStation() {
        setCurrentStation(currentStation + 1);
    }

    public void previousStation() {
        setCurrentStation(currentStation - 1);
    }

    public void plusSound() {
        setCurrentSound(currentSound + 1);
    }

    public void minusSound() {
        setCurrentSound(currentSound - 1);
    }
}
