package gitpack;

class MultiplicationExample {
	public int mul(int x, int y) {
		int mul=x*y;
		return mul;
	}
}

public class Sample {
	public static void main(String[] args) {
		MultiplicationExample obj = new MultiplicationExample();
		int result=obj.mul(10, 20);
		System.out.println("Multiplication of two numbers:"+result);
	}
}