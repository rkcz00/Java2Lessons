package com.lesson1;

public class Course {

    private int level_1;
    private int level_2;
    private int level_3;

    public Course(int level_1, int level_2, int level_3) {
        this.level_1 = level_1;
        this.level_2 = level_2;
        this.level_3 = level_3;
    }

    public void doIt(Team team){
        int sum = level_1+level_2+level_3;
        if (team.getPower() >= sum) {
            System.out.println(team.getName() + " прошел полосу");
        } else {
            System.out.println(team.getName() + " не прошел полосу");
        }
    }
}
