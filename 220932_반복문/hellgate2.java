package edu;

public class hellgate2 {

	public static void main(String[] args) {
		int [][] a = new int [2][4];
		int [][] b = new int [3][4];
		int [][] c = new int [2][4];
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int k = 0 ; k < a[i].length; k++) {
				a[i][k] = (int)(Math.random()*100);
			}
		}
		for(int k = 0; k < a.length; k++) {
			for(int j = 0 ; j < b[k].length; j++) {
				b[k][j] = (int)(Math.random()*100);
			}
		}
		result += a[i][k] * b[k][j]
	}
}
