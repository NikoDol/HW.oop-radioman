package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextStation() {
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPreviousStation() {
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPlusSound() {
        radio.plusSound();
        assertEquals(10, radio.getCurrentSound());
    }

    @Test
    public void shouldMinusSound() {
        radio.minusSound();
        assertEquals(0, radio.getCurrentSound());
    }
}
