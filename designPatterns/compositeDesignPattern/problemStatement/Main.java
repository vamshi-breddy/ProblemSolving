package com.designPatterns.compositeDesignPattern.problemStatement;

public class Main {

    public static void main(String args[]){

        Directory movieDirectory = new Directory("Movie");

        File2 border = new File2("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File2 hulchul = new File2("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
