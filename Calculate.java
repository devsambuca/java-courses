public class Calculate {
	
	public static void main(String [] arg){
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double sum = first + second;
		double mul = first * second;
		double dev = first / second;
		double sub = first - second;
		double res = Math.pow(first, second);
		
		System.out.println("Sum " + sum);
		System.out.println("Mult" + mul);
		System.out.println("Dev " + dev);
		System.out.println("Sub " + sub);
		System.out.println("Res" + res);
	}
}