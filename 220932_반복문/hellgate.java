package edu;
public class hellgate {

	public static void main(String[] args) {
		int [][] arr = new int[2][2];
		int [][] arr2 = new int[2][2];
		int [][] arr3 = new int[2][2];
		
		for(int i = 0; i < arr.length; i++) {
		  for(int j = 0; j < arr[i].length; j++) {
			  arr[i][j]=(int)(Math.random()*100);
			}
		}
			for(int i = 0; i < arr.length; i++)	 {
				for(int j = 0; j <arr[i].length; j++) {
					System.out.print(arr[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");	
	    }System.out.println("\t");
			
		for(int i = 0; i < arr2.length; i++) {
		  for(int j = 0; j < arr2[i].length; j++) {
			  arr2[i][j]=(int)(Math.random()*100);
			}
		}
			for(int i = 0; i < arr2.length; i++)  {
				for(int j = 0; j <arr2[i].length; j++) {
					System.out.print(arr2[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");		
	    }System.out.println("\t");
		for(int i = 0; i < arr3.length; i++) {
		  for(int j = 0; j < arr3[i].length; j++) {
			  arr3[i][j]=arr[i][j]+arr2[i][j];
		  	}
		}
			for(int i = 0; i < arr3.length; i++)	 {
				for(int j = 0; j <arr3[i].length; j++) {
					System.out.print(arr3[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");								
	}
					
  }
	
}
