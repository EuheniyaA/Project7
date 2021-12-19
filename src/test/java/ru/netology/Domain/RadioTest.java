package ru.netology.Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    public void myTestCurrRad9NextStation9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad9NextStation8() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void myTestCurrRad0PrevStation5() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.prev();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRadPrevStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRadStation1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRadStationLess0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRadStationOver10() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestSetToMax() {
        Radio rad = new Radio();
        rad.setToMax();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestSetToMin() {
        Radio rad = new Radio();
        rad.setToMin();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolume8() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.increaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void myTestCurrVolMinVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolume5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.decreaseVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolumeLessMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolumeMoreMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setCurrentVolume(11);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}



