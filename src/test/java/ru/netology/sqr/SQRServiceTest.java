package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void test_pozitive_1() {
        SQRService service = new SQRService();
        int actual = service.resault(0, 0);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test_pozitive_2() {
        SQRService service = new SQRService();
        int actual = service.resault(300, 300);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test_pozitive_3() {
        SQRService service = new SQRService();
        int actual = service.resault(100, 250);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test_pozitive_4() {
        SQRService service = new SQRService();
        int actual = service.resault(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}

