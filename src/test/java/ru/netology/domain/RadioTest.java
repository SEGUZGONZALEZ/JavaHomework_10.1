package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOverInvalidStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(42);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationUnderInvalidStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextToMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevToMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentUnderMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentOverMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(42);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseOverMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetReduceOverMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}