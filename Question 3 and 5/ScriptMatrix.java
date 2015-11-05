public class ScriptMatrix {
	public static void main(String[] args){
		Matrix myMatrix = new Matrix(3, 3);
		myMatrix.prettyPrint();
		myMatrix.setElement(1, 1, 555);
		System.out.println();
		myMatrix.prettyPrint();	
		System.out.println();		
		myMatrix.setRow(0, "4,5,9");
		myMatrix.prettyPrint();
		System.out.println();
		myMatrix.setColumn(0, "9,9,9");
		myMatrix.prettyPrint();
		System.out.println();
		System.out.println(myMatrix.turnToString()); 
		System.out.println("Is row 2 symmetrical?" + myMatrix.isRowSymmetrical(2));
		System.out.println("Is row 0 symmetrical?" + myMatrix.isRowSymmetrical(0));
		System.out.println("Is the matrix symmetrical?" + myMatrix.isMatrixSymmetrical());
		myMatrix.setMatrix("9,9,9;9,9,9;9,9,9");
		myMatrix.prettyPrint();
		System.out.println("Now is the matrix symmetrical?" + myMatrix.isMatrixSymmetrical());
		System.out.println("Is the matrix triangular?" + myMatrix.isMatrixTriangular());
		myMatrix.setElement(2, 0, 0);
		myMatrix.setElement(2, 1, 0);
		myMatrix.setElement(1, 0, 0);
		myMatrix.prettyPrint();
		System.out.println("Now is the matrix triangular?" + myMatrix.isMatrixTriangular());
		myMatrix.setMatrix("5,5,5,5;5,5,5,5;5,5,5,5;5,5,5,5");
		myMatrix.setMatrix("9,8,7;6,5,4;555,333,22");
		myMatrix.prettyPrint();
	}
}