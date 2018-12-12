package com.tortel.syslog;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class myAppInformationTest {

    myAppInformation example;
    @Before
    public void setUp(){
        example=new myAppInformation();
    }
    @Test
    public void getAppSource() {
        assertEquals(4,example.getAppSource(1,2));
    }

    @Test
    public void getAppSource_1(){
        assertEquals(1,1,0);
    }

    @Test
    public void getFib() {
        assertEquals(5,example.getFib(5));
    }

    @Test
    public void getFib_1(){
        assertEquals(1,example.getFib(0));
    }

    @Test
    public void isPrimeNumber() {
        assertEquals(false,example.isPrimeNumber(9));
    }

    @Test
    public void isPrimeNumber_1(){
        assertEquals(true,example.isPrimeNumber(9));
    }

    @Test
    public void maxPrime() {
        assertEquals(7,example.maxPrime(8));
    }

    @Test
    public void getDis() {
        assertEquals(2,example.getDis(1,2,1,2));
    }
}