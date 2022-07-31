package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void personConstrictorTest () {
        Person p = new Person(1231313, "Skippy");
        long id = 1354654;
        String name = "Johnny";
        p.setName(name);
        p.id = id;
        Assert.assertEquals(p.getName(), name);
        Assert.assertEquals(p.getId(), id);
    }


    @Test
    public void setNameTest() {
        Person p = new Person(12323, "Cool Joe");
        p.setName("Cool Jack");
        Assert.assertEquals(p.getName(), "Cool Jack");

    }
}
