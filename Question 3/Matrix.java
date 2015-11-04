
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
	
	public void setElement(int row, int column, int newValue){
		if (row < myIntMatrix.length && row >= 0 && column < myIntMatrix[row].length && column >= 0) {
			myIntMatrix[row][column] = newValue;
		}
	}
	
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
	
	public void prettyPrint(){		
		for (int i = 0; i < myIntMatrix.length; i++){
			for (int j = 0; j < myIntMatrix[i].length; j++){
				System.out.print(myIntMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}