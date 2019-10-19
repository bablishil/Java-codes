class Transpose{
	public static void main(String args[]){


		int[][] arr = {{1, 2, 3},{5, 6, 7}};
		int[][] arr1 = new int[3][2];

		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				arr1[i][j] = arr[j][i];
			}
		}
	System.out.println("transposed matrix is-:\t");
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.print(arr1[i][j]);
				System.out.print("\t");
			}	
			System.out.print("\n");
		}
	}
}