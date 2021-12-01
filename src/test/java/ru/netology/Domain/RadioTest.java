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
    public void myTestCurrRad9NextStationMore9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad9NextStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.next();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad9NextStation1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.next();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad9NextStationLess0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad9NextStation5() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        rad.next();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void myTestCurrRad0PrevStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad0PrevStation1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad0PrevStationLess0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad0PrevStation9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.prev();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad0PrevStation8() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrRad0PrevStationMore9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        rad.prev();

        int expected = 0;
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
    public void myTestCurrManual() {
        Radio rad = new Radio();

        rad.setManualSelection();

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

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
    public void myTestCurrVolMaxVolume9() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolumeMore10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        rad.increaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolumeLess0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.increaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMaxVolume5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.increaseVolume();

        int expected = 6;
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
    public void myTestCurrVolMinVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolumeLess0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolume9() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.decreaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void myTestCurrVolMinVolumeMore10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

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

}


