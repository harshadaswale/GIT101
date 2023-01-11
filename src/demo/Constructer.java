package demo;

public class Constructer {
	int a;
	int b;
	Constructer(int x,int y){
		a=x;
		b=y;
	}
	void master(){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Constructer obj=new Constructer(10,5);
		
		obj.master();
		
	}
	

}
