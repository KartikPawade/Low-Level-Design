package org.lld.design_patterns.creational.builder;

public abstract class StudentBuilder {
    Integer rollNo;
    Integer age;
    String name;
    String surName;
    String fatherName;
    String motherName;
    String address;
    Sector sector;

    public StudentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setSector(Sector sector) {
        this.sector = sector;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}