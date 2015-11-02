public class MyScript {
	public static void main(String[] args){
		Calculator c = new Calculator();
		System.out.println(c.add(5, 5));
		System.out.println(c.subtract(5, 5));
		System.out.println(c.multiply(5, 5));
		System.out.println(c.divide(5, 5));
		System.out.println(c.modulus(5, 5));
	}
}