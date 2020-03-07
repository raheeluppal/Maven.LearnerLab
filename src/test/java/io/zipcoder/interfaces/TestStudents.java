package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test1() {
        Students instance = Students.getInstance();
        boolean expected = instance.contains(instance.findById(1L));

        Assert.assertTrue(expected);

    }
}
