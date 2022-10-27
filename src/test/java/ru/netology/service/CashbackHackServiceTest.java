package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainLessThanBorder() {

        assertEquals(200,service.remain(800));
    }

    @Test
    public void testRemainEqualsBorder() {
        assertEquals(0,service.remain(1000));
    }

    @Test
    public void testRemainAboveTheBorder() {
        assertEquals(600, service.remain(1400));
    }
}