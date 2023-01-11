package demo;

public class Byobjectdirectly {
	int a, b;
	 void abc() {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Byobjectdirectly x=new Byobjectdirectly();
		x.a=10;
		x.b=5;
		x.abc();
	}

}
