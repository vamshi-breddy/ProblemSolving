package com.designPatterns.compositeDesignPattern.sol1withCompositeDesignPattern;

public class Main {

    public static void main(String args[]){

        Directory movieDirectory = new Directory("Movie");

        File2 border = new File2("Border");

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File2 hulchul = new File2("Hulchul");
        movieDirectory.add(comedyMovieDirectory);
        comedyMovieDirectory.add(hulchul);
        comedyMovieDirectory.add(border);

        movieDirectory.ls();

    }
}