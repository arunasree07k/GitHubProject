package gitpack;

class AdditionExample {
	public int add(int x, int y) {
		int sum=x+y;
		return sum;
	}
}

public class Sample {
	public static void main(String[] args) {
		AdditionExample obj = new AdditionExample();
		int result=obj.add(10, 20);
		System.out.println("Sum of two numbers:"+result);
	}
}
