package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldCalculateFromEqual() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldCalculateFromBoundaryVolume() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldCalculateFromZero() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCalculateFromNegative() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(-1), 1001);
    }
}