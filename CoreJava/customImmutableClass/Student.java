package com.CoreJava.customImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private final Integer studId;
    private final String studName;

    private final List<String> subject;

    public Student(Integer studId, String studName,List<String> subList) {
        this.studId = studId;
        this.studName = studName;
        //this.subject = subList;
        this.subject = new ArrayList<>();
        for(String sub:subList){
            subject.add(sub);
        }

    }

    public Integer getStudId() {
        return studId;
    }

    public String getStudName() {
        return studName;
    }

    public List<String> getSubject() {
        List<String> tempList = new ArrayList<>();
        for(String list:subject){
            tempList.add(list);
        }
        return tempList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", subject=" + subject +
                '}';
    }
}
