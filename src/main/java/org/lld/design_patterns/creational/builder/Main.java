package org.lld.design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        StudentDirector director = new StudentDirector(new MbaStudentBuilder());
        Student student =  director.createStudent();
        System.out.println(student);
    }
}
