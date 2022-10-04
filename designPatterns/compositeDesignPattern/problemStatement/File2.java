package com.designPatterns.compositeDesignPattern.problemStatement;

public class File2 {

    String fileName;

    public File2(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}

