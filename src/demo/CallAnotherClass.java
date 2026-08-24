package demo;

public class CallAnotherClass {
	public static void main(String[] args) {
		System.out.println("class A");
		B.main(null);
	}
	
	public static void call() {
		System.out.println("call method from class a");
	}
	
	

}
