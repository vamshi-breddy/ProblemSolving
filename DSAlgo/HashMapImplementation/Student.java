package com.DSAlgo.HashMapImplementation;

import java.util.Objects;

public class Student {

    int studId;
    String studName;

    public Student(int studId, String studName) {
        this.studId = studId;
        this.studName = studName;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studId == student.studId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studId);
    }
}
