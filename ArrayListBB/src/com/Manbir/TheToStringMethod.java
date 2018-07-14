package com.Manbir;

import java.util.ArrayList;

public class TheToStringMethod {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("manbir", 23));
        students.add(new Student("manbir2", 27));
        students.add(new Student("manbir3", 28));
        students.add(new Student("manbir4", 29));

        for (Student student: students) {
            System.out.println(student);
        }

    }
}
