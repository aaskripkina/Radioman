package ru.netology;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());

        radio.setCurrentStation(16);
        assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeOutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetToMinStation() {
        Radio radio = new Radio();


        int expected = 0;
        int actual = radio.getMinStation();

        assertEquals(expected, actual);


    }
    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();


        int expected = 0;
        int actual = radio.getMinVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();


        int expected = 100;
        int actual = radio.getMaxVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxStation() {
        Radio radio = new Radio();


        int expected = 9;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio (5);
        Radio radio2 = new Radio ();

        int expected = 4;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);

        expected = 9;
        actual = radio2.getMaxStation();

        assertEquals(expected, actual);
    }

}