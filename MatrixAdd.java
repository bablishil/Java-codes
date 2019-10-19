class MatrixAdd{
	public static void main(String args[]){
		 int[][] arr1 = {{1,2,3}, {4, 5, 6}};
		 int[][] arr2 = {{3,2,1}, {6, 5, 4}};
		 int[][] sum = new int[2][3];
		 for(int i =0; i<2; i++){
		 	for(int j = 0; j<3; j++){
		 		sum[i][j] = arr1[i][j] + arr2[i][j];
		 	}
		 }
		 System.out.println("Sum of two matrices-:");
		 for(int i = 0; i<2; i++){
		 	for(int j = 0; j<3; j++){
		 		System.out.print(sum[i][j] + "\t");
		 	}
		 	System.out.print("\n");
		 }
	}
}