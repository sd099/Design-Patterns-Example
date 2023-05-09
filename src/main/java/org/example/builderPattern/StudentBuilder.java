package org.example.builderPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    String name;
    int age;
    String sex;
    List<String> subs;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public abstract StudentBuilder setSubject();

    public Student build() {
        return new Student(this);
    }
}
