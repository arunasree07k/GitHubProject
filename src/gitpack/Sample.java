package gitpack;

class SubtractionExample {
	public int sub(int x, int y) {
		int sub=x+y;
		return sub;
	}
}

public class Sample {
	public static void main(String[] args) {
		SubtractionExample obj = new SubtractionExample();
		int result=obj.sub(40, 20);
		System.out.println("Sub of two numbers:"+result);
	}
}
