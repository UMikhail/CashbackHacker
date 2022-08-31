package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1100() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int amount = 1100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}