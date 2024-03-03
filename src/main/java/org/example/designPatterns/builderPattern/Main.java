package org.example.designPatterns.builderPattern;

public class Main {
    public static void main(String[] args){
        StudentBuilder scienceStudentBuilder = new ScienceStudentBuilder();
        Student scienceStudent = scienceStudentBuilder.setAge(17).setName("John Doe").setSex("male").setRollNumber(1).setSubject().build();
        System.out.println(scienceStudent);

        StudentBuilder artsStudentBuilder = new ArtsStudentBuilder();
        Student artsStudent = artsStudentBuilder.setAge(17).setName("Jenny Doe").setSex("female").setRollNumber(1).setSubject().build();
        System.out.println(artsStudent);
    }
}
