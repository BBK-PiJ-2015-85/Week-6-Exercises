public class Matrix {
	
	private int[][] myIntMatrix;
	
	// constructor
	
	public Matrix(int x, int y){
		myIntMatrix = new int[x][y];
		for (int i = 0; i < x; i++){
			for (int j = 0; i < y; j++){
				myIntMatrix[i][j] = 1;
			}
		}
	}
	
	// methods
	
	public void setElement(int row, int column, int newValue){
		/// .to do
	}
	
	public void setRow(int row, String str) {
		/// .to do
	}
	
	public void setColumn(int column, String str) {
		/// .to do
	}
	
	public String toString(){
		/// .to do
	}
	
	public void prettyPrint(){
		/// .to do
	}
}