package gitpack;

class DivisionExample {
	public int div(int x, int y) {
		int sum=x/y;
		return sum;
	}
}

public class Sample {
	public static void main(String[] args) {
		DivisionExample obj = new DivisionExample();
		int result=obj.div(20, 10);
		System.out.println("Sum of two numbers:"+result);
	}
}
