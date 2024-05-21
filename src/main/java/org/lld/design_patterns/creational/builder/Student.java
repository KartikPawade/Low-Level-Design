package org.lld.design_patterns.creational.builder;

public class Student {
    private Integer rollNo;
    private Integer age;
    private String name;
    private String surName;
    private String fatherName;
    private String motherName;
    private String address;

    private Sector sector;

    public Student(StudentBuilder studentBuilder) {
        this.address = studentBuilder.address;
        this.rollNo = studentBuilder.rollNo;
        this.age = studentBuilder.age;
        this.surName = studentBuilder.surName;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.sector = studentBuilder.sector;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("rollNo=").append(rollNo);
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surName='").append(surName).append('\'');
        sb.append(", fatherName='").append(fatherName).append('\'');
        sb.append(", motherName='").append(motherName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", sector=").append(sector);
        sb.append('}');
        return sb.toString();
    }
}



