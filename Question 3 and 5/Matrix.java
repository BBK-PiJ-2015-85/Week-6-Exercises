
public class Matrix {
	
	private int[][] myIntMatrix;
	
	// constructor
	
	public Matrix(int row, int column){
		myIntMatrix = new int[row][column];
		for (int i = 0; i < row; i++){
			for (int j = 0; j < column; j++){
				myIntMatrix[i][j] = 1;
			}
		}
	}
	
	// methods
	
	//change any element in the matrix
	public void setElement(int row, int column, int newValue){
		if (row < myIntMatrix.length && row >= 0 && column < myIntMatrix[row].length && column >= 0) {
			myIntMatrix[row][column] = newValue;
		}
	}
	
	//change a whole row in the matrix (given as a string with numbers separated by commas and no spaces)
	public void setRow(int row, String str) {		
		//check the amount of numbers in str (separated by commas)
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == ','){
				count ++;//count will be 1 less than total numbers in the string (e.g "4,5,6" 2 commas 3 numbers)
			}
		}
		//check for validity and perform operation
		if (row < myIntMatrix.length && row >= 0 && count + 1 == myIntMatrix[row].length){
			int marker = 0;
			int num;
			int count2 = 0;
			for (int i = 0; i < str.length(); i++){
				if (str.charAt(i) == ',' || i == str.length() - 1){
					if (i == str.length() - 1){
						myIntMatrix[row][count2] = Integer.parseInt(str.substring(marker));
					} else {
						myIntMatrix[row][count2] = Integer.parseInt(str.substring(marker, i));
						count2++;
						marker = i+1;
					}					
					
				}
			}
		}
	}
	
	//change a whole column in the matrix
	public void setColumn(int column, String str) {
		//check the amount of numbers in str (separated by commas)
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == ','){
				count ++;//count will be 1 less than total numbers in the string (e.g "4,5,6" 2 commas 3 numbers)
			}
		}
		//check for validity and perform operation
		if (column < myIntMatrix[0].length && column >= 0 && count + 1 == myIntMatrix.length){
			int marker = 0;
			int num;
			int count2 = 0;
			for (int i = 0; i < str.length(); i++){
				if (str.charAt(i) == ',' || i == str.length() - 1){
					if (i == str.length() - 1){
						myIntMatrix[count2][column] = Integer.parseInt(str.substring(marker));
					} else {
						myIntMatrix[count2][column] = Integer.parseInt(str.substring(marker, i));
						count2++;
						marker = i+1;
					}					
					
				}
			}
		}
	}
	
	//return the whole matrix as a string with numbers separated by commas and arrays separated by semi colons
	public String turnToString(){
		String str = "[";
		for (int i = 0; i < myIntMatrix.length; i++){
			for (int j = 0; j < myIntMatrix[i].length; j++){
				str = str + myIntMatrix[i][j];
				if (j < myIntMatrix[i].length - 1){
					str = str + ",";
				} else if (i < myIntMatrix.length - 1){
					str = str + ";";
				} else {
					str = str + "]";
				}
			}
		}
		return str;
	}
	
	//take a string to reset the whole matrix (with elements separated by commas and rows separated by semi colons)
	public void setMatrix(String str) {
		int marker = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ';' || i == str.length() - 1) {
				if (i == str.length() - 1) {
					setRow(count, str.substring(marker));
				} else {
					setRow(count, str.substring(marker, i));
					marker = i + 1;
					count++;
				}
			}
		}
	}
	
	
	
	
	
	
	
	//print the matrix
	public void prettyPrint(){		
		for (int i = 0; i < myIntMatrix.length; i++){
			for (int j = 0; j < myIntMatrix[i].length; j++){
				System.out.print(myIntMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//check if any given row is symmetrical
	public boolean isRowSymmetrical(int row){
		MatrixChecker check = new MatrixChecker();
		return check.isSymmetrical(myIntMatrix[row]);
	}
	
	//check if the whole matrix is symmetrical
	public boolean isMatrixSymmetrical(){
		MatrixChecker check = new MatrixChecker();
		return check.isSymmetrical(myIntMatrix);
	}
	
	//check if the matrix is (up)triangular
	public boolean isMatrixTriangular() {
		MatrixChecker check = new MatrixChecker();
		return check.isTriangular(myIntMatrix);
	}
}