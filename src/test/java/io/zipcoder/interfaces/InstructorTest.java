package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(25L,"Raheel");

        Assert.assertTrue(instructor instanceof  Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(25L,"Raheel");

        Assert.assertTrue(instructor instanceof  Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(25L,"Raheel");
        Student student = new Student(25L,"Raheel");

        instructor.teach(student,10.0);
        Double expected =student.getTotalStudyTime();
        Double actual = 10.0;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(25L,"Raheel");
        Student student1 = new Student(25L,"Raheel");
        Student student2 = new Student(25L,"Raheel");
        Student student3 = new Student(25L,"Raheel");
        Student[] students = new Student[]{student1,student2,student3};

        instructor.lecture(students,30.0);
        Double expected = 30.0/students.length;
        Double actual = 10.0;

        Assert.assertEquals(expected,actual);
    }
}