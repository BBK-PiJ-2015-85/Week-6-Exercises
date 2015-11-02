public class ScriptArrayCopier {
	public static void main(String[] args) {
		ArrayCopier myArray = new ArrayCopier();
		//both arrays the same length
		int[] array1 = {5, 10, 15};
		int[] array2 = {1, 1, 1};
		myArray.prettyPrint(array1);
		myArray.prettyPrint(array2);
		array2 = myArray.copy(array1, array2);
		myArray.prettyPrint(array2);
		
		System.out.println();
		
		//source array is longer
		int[] array3 = {5, 10, 15, 20, 25, 30};
		int[] array4 = {1, 1, 1};
		myArray.prettyPrint(array3);
		myArray.prettyPrint(array4);
		array2 = myArray.copy(array3, array4);
		myArray.prettyPrint(array4);
		
		System.out.println();
		
		//destination array is longer
		int[] array5 = {5, 10, 15};
		int[] array6 = {1, 1, 1, 1, 1, 1, 1, 1};
		myArray.prettyPrint(array5);
		myArray.prettyPrint(array6);
		array2 = myArray.copy(array5, array6);
		myArray.prettyPrint(array6);
	}
}