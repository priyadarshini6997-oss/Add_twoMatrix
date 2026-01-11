package com.index;

import java.util.Scanner;

public class Ass8_pro5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows in matrix 1: ");
		int row1 = sc.nextInt();
		
		System.out.println("Enter number of column in matrix 1: ");
		int col1 = sc.nextInt();
		
		int[][] matrix1 = new int[row1][col1];
		
		System.out.println("The elements of the matrix1 are: ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
		matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter number of rows in matrix 2: ");
		int row2 = sc.nextInt();
		
		System.out.println("Enter number of column in matrix 2: ");
		int col2 = sc.nextInt();
		
		int[][] matrix2 = new int[row2][col2];
		System.out.println("The elements of the matrix2 are: ");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
		matrix2[i][j] = sc.nextInt();
			}
		}
		
		if(row1==row2 && col1==col2) {
			int[][] sum = new int[row1][col1];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		System.out.println("The sum of the two matrix: ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				System.out.println(sum[i][j]+" ");
			}
			System.out.println();
			}
		}
		
		

	}

}
