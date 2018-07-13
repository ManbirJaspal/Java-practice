package com.Manbir;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection2 {

    public static void main(String[] args) {
        Student s1 = new Student(101, "yoyo", 23);
        Student s2 = new Student(102, "asdfg", 22);
        Student s3 = new Student(103, "qwrert", 24);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            Student st = (Student)itr.next();
            System.out.println(st.getRollno() + st.getName() + st.getAge() );

        }

    }
}
