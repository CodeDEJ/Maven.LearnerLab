package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestInstructor {
    @Test
    public void testImplementation() {
        Instructor i = new Instructor(123456, "Joey JoJo");
        Assert.assertTrue(i instanceof Teacher);
    }
    @Test
    public void testInheritance(){
    Instructor i = new Instructor(123456, "Joey JoJo");
        Assert.assertTrue(i instanceof Person);
    }



    @Test
    public void teachTest() {
        Instructor i = new Instructor(123456, "Joey JoJo");
        Student s = new Student(12345, "Johnny Goodlearn");
        i.teach(s, 555.0);
        double actual = s.getTotalStudyTime();
        Assert.assertEquals(555.0, actual, 0);

    }

    @Test
    public void lectureTest() {
        //Given
        Instructor instructor = new Instructor(0,"Jack");
        double increase = 10;
        Student student = new Student(0,"Stew");
        Student student1 = new Student(0,"B-ri");
        double expected = student.getTotalStudyTime() + increase/2;
        double expected1 = student1.getTotalStudyTime() + increase/2;
        Student[] students = {student, student1};
        //When
        instructor.lecture(students, increase);
        //Then
        double actual = student.getTotalStudyTime();
        double actual1 = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expected1, actual1, 0.1);
    }




    }
