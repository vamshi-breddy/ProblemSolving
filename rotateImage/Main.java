package com.rotateImage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        PrintRotatedMatrix printRotatedMatrix = new PrintRotatedMatrix();
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();
        int [][]matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              matrix[i][j] = input.nextInt();
          }
        }
        rotateImage.rotate(matrix);
        printRotatedMatrix.printRotatedMatrix(matrix);
    }

}
