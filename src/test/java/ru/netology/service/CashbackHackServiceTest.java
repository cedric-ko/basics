package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldCalculateFromEqual() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldCalculateFromBoundaryVolume() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldCalculateFromZero() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldCalculateFromNegative() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(1001, service.remain(-1));
    }
}