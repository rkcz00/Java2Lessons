package com.lesson1;

public class Test {

    public static void main(String[] args) {
        Team[] members = new Team[4];
        members[0] = new Team("Alex", 50);
        members[1] = new Team("Ivan", 100);
        members[2] = new Team("Sonya", 75);
        members[3] = new Team("Vera", 10);


        Course course = new Course(10,10,10);


        for (Team member : members) {
            course.doIt(member);
        }
    }
}
