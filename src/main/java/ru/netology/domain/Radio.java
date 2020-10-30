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
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public void nextStation() {
        // 9 подставлено , вместо currentStation для выполнения задания, по бранчам.
        setCurrentStation(9 + 1);
        if (currentStation > highStation) {
            setCurrentStation(lowStation);
            return;
        }
    }

    public void previousStation() {
        // 0 подставлено , вместо currentStation для выполнения задания, по бранчам.
        setCurrentStation(0 - 1);
        if (currentStation < lowStation) {
            setCurrentStation(highStation);
            return;
        }
    }

    public void plusSound() {
        // 10 подставлено , вместо currentSound для выполнения задания, по бранчам.
        setCurrentSound(10 + 1);
        if (currentSound > maxSound) {
            setCurrentSound(maxSound);
            return;
        }
    }

    public void minusSound() {
        // 9 подставлено , вместо currentSound для выполнения задания, по бранчам.
        setCurrentSound(0 - 1);
        if (currentSound < minSound) {
            setCurrentSound(minSound);
            return;
        }
    }
}
