package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainLessThanBorder() {
        Assert.assertEquals(service.remain(800), 200);
    }

    @Test
    public void testRemainEqualsBorder() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testRemainAboveTheBorder() {
        Assert.assertEquals(service.remain(1400), 600);
    }
}