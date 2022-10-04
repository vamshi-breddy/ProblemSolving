package com.designPatterns.compositeDesignPattern.sol1withCompositeDesignPattern;

public class File2 implements FileSystem{
    String fileName;

    public File2(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}
