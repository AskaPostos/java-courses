

public class Calculator {
	public static void main(String[] args) {
		System.out.println("calculate");
		int arg1 = Integer.valueOf(args[0]);
		int arg2 = Integer.valueOf(args[1]);
		int summ = arg1 + arg2;
		System.out.println("sum:" + summ);
	}
}