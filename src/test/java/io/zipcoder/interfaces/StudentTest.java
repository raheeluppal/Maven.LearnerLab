package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void testImplementation() {
        Student raheel = new Student(25L,"Raheel");

            Assert.assertTrue(raheel instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student raheel = new Student(25L,"Raheel");

        Assert.assertTrue(raheel instanceof Person);
    }

    @Test
    public void testLearn() {
        Student raheel = new Student(25L,"Raheel");
        raheel.learn(40.0);
        Double expected = raheel.getTotalStudyTime();
        Double actual = 40.0;

        Assert.assertEquals(expected,actual);
    }
}