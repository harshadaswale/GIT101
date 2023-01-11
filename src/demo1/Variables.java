package demo1;



public class Variables {
	int a=1;
	static int b=2;
	final static int m=100;
	final int n=200;
	public static void m1() {
		int x=10;
		System.out.println(x);
		System.out.println(b);
		Variables obj1=new Variables();
		System.out.println(obj1.a);
		System.out.println(m);
//		m++;
		System.out.println(obj1.n);
//		n++;
		
	}
	public void m2() {
		int y=20;
		System.out.println(y);
		System.out.println(b);
		System.out.println(a);
		System.out.println(m);
	//	m++;
		System.out.println(n);
	}
	public static void main(String[] args) {
		Variables.m1();
		Variables obj=new Variables();
		obj.m2();
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(m);
		System.out.println(obj.n);
		
//		System.out.println(x);
//		System.out.println(y);
	}
	

}
