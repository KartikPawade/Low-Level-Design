package org.lld.design_patterns.creational.builder;

public class StudentDirector {

    StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof MbaStudentBuilder) {
            return createMbaStrudent();
        } else {
            return createBcaStudent();
        }
    }

    private Student createBcaStudent() {
        return studentBuilder.setName("MBA").setAge(23).setFatherName("MBA").build();
    }

    private Student createMbaStrudent() {
        return studentBuilder.setName("MBA").setAge(23).setFatherName("MBA").build();
    }
}
