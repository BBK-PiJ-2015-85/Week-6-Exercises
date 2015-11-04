public class ScriptMatrix {
	public static void main(String[] args){
		Matrix myMatrix = new Matrix(10, 5);
		myMatrix.prettyPrint();
		myMatrix.setElement(1, 1, 8);
		System.out.println();
		myMatrix.prettyPrint();
		System.out.println();
		myMatrix.setRow(0, "4,5,9,3,12");
		myMatrix.prettyPrint();
		System.out.println();
		myMatrix.setColumn(0, "0,0,0,13,145,345,444,123,5,66");
		myMatrix.prettyPrint();
		System.out.println();
		System.out.println(myMatrix.turnToString());
	}
}