package demo;

public class Bymethod {

	int a;
	int b;
	void setdata(int x,int y){
		a=x;
		b=y;
	}
	void abc(){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Bymethod obj=new Bymethod();
		obj.setdata(10,5);
		obj.abc();
	}
	
}
