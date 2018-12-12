package com.tortel.syslog.test;

import org.junit.Before;
import org.junit.Test;
import com.tortel.syslog.*;
import static org.junit.Assert.*;

public class JUnitTest {
    JUnit example;
    @Before
    public void setUp() {
        example=new JUnit();
    }

    @Test
    public void add() throws Exception{
        assertEquals(6,example.add(2,4));
    }

    @Test
    public void add_1() throws  Exception{
        assertEquals(5,example.add(1,2));
    }
}