package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RadioTest {
    Radio radio = new Radio(9);

    @Test
    public void setCurrentStation() {
        int expected = 8;
        radio.setCurrentStation(expected);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationOutLimit() {
        radio.setCurrentStation(13);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNextStationInLimit() {
        radio.setCurrentStation(7);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void shouldPrevStationInLimit() {
        radio.setCurrentStation(8);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    public void shouldNextStationMax() {
        radio.setCurrentStation(9);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldPrevStationMin() {
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationOutLimit() {
        radio.setCurrentStation(9);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationOutLimit() {
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void setCurrentVolume() {
        int expected = 8;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        radio.setCurrentVolume(16);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldIncreaseVolumeInLimit() {
        radio.setCurrentVolume(9);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolumeInLimit() {
        radio.setCurrentVolume(5);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        radio.setCurrentVolume(10);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeOutLimit() {
        Radio radio = new Radio(5, 0, 9,9);
        radio.setCurrentVolume(110);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolumeOutLimit() {
        Radio radio;
        radio = new Radio();
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

}
