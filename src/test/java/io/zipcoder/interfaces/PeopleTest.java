package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.beans.PersistenceDelegate;

public class PeopleTest {

    @Test
    public void TestAdd(){
        People people = new People();
        Person person1 = new Person(25L,"Raheel");
        Person person2 = new Person(25L,"Raheel");
        people.add(person1);
        people.add(person2);
        Integer expected = people.count();
        Integer actual = 2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestRemove(){
        People people = new People();
        Person raheel = new Person(25L,"Raheel");
        people.add(raheel);
        people.add(new Person(25L,"Roberto"));
        people.add(new Person(25L,"Dolio"));
        people.add(new Person(25L,"Froilon"));

        people.remove(raheel);
        Integer expected = people.count();
        Integer actual = 3;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testFindById(){
        People people = new People();
        Person person1 = new Person(25L,"Raheel");
        Person person2 = new Person(30L,"Raheel");
        Person person3 = new Person(10L,"Raheel");
        Person person4 = new Person(5L,"Raheel");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        Person expected = people.findById(25L);
        Person actual = person1;

        Assert.assertEquals(expected,actual);
    }
}
