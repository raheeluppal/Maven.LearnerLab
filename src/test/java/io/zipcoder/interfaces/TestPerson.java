package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestPerson {
    private static final Logger LOGGER = Logger.getLogger(TestPerson.class.getName());

    @Test
    public void constructorTest(){
        Person raheel = new Person(25L,"Raheel");
        String expected = "Raheel";
        String actual = raheel.getName();

        Long idexpected = raheel.getId();
        Long idActual = 25L;

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(idexpected,idActual);
    }

    @Test
    public void setNameTest(){
        Person raheel = new Person(25L,"Raheel");
        raheel.setName("Rara");

        String expected = "Rara";
        String actual = raheel.getName();

        Assert.assertEquals(expected,actual);
    }
}
