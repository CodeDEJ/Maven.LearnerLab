package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    public Student(long id, String name) {
        super(id, name);
    }

    double totalStudyTime;


    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
