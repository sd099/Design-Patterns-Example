package org.example.designPatterns.builderPattern;

import java.util.List;

public class Student {
    int rollNumber;
    String name;
    int age;
    String sex;
    List<String> subs;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.sex = studentBuilder.sex;
        this.subs = studentBuilder.subs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", subs=" + subs +
                '}';
    }
}
