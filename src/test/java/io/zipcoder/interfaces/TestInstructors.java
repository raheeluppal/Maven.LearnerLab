package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test1() {
        Instructors instance = Instructors.getInstance();
        boolean expected = instance.contains(instance.findById(1L));

        Assert.assertTrue(expected);

    }

}
