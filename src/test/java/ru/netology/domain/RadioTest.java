package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextStation() {
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStation() {
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPlusSound() {
        radio.plusSound();
        assertEquals(6, radio.getCurrentSound());
    }

    @Test
    public void shouldMinusSound() {
        radio.minusSound();
        assertEquals(4, radio.getCurrentSound());
    }

    @Test
    public void shouldMinSound() {
        radio.setCurrentSound(-1);
        assertEquals(0, radio.getCurrentSound());
    }

    @Test
    public void shouldMaxSound() {
        radio.setCurrentSound(11);
        assertEquals(10, radio.getCurrentSound());
    }

    @Test
    public void shouldNextMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }
}
