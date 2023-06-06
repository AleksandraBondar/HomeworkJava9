package ru.netology.javaqa62;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetQuantitySt() {

        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);

        Assertions.assertEquals(29, radio.currentRadioStation);
    }

    @Test
    public void shouldGoNextWithQuantitySt() {

        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);

        radio.currentRadioStation = 16;
        radio.nextRadioStation();

        int expected = 17;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBackWithQuantitySt() {

        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);

        radio.currentRadioStation = 16;
        radio.prevRadioStation();

        int expected = 15;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToZeroWithQuantitySt() {
        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);

        radio.currentRadioStation = 29;
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBackToBorderWithQuantitySt() {
        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);

        radio.currentRadioStation = 0;
        radio.prevRadioStation();

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveLimitWithQuantitySt() {

        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);
        radio.setRadioStation(30);

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowTheLimitWithQuantitySt() {

        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);
        radio.setRadioStation(-1);

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationWithQuantity() {

        ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio(30);

        radio.setRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    ru.netology.javaqa62.Radio radio = new ru.netology.javaqa62.Radio();

    @Test
    public void shouldGoToZeroSt() {

        radio.currentRadioStation = 9;
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldGoToNextSt() {

        radio.currentRadioStation = 2;
        radio.nextRadioStation();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoToNinthSt() {

        radio.currentRadioStation = 8;
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoNextFrom0St() {

        radio.currentRadioStation = 0;
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBackToNinthSt() {

        radio.currentRadioStation = 0;
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBackSt() {

        radio.currentRadioStation = 5;
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBackFrom9St() {

        radio.currentRadioStation = 9;
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveLimit() {

        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTo9() {

        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowTheLimit() {

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToZero() {

        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation() {

        radio.setRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolAboveLimit() {

        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderMaxVolTest1() {

        radio.currentVolume = 99;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void borderMaxVolTest2() {

        radio.currentVolume = 101;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.currentVolume = 65;
        radio.increaseVolume();

        int expected = 66;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolBelowLimit() {

        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void borderMinVolTest1() {

        radio.currentVolume = -1;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderMinVolTest2() {

        radio.currentVolume = 1;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        radio.currentVolume = 65;
        radio.decreaseVolume();

        int expected = 64;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
