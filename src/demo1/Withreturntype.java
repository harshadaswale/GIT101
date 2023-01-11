package demo1;

public class Withreturntype {
	int a;
	int b;
	int abc() {
		return(a+b);
	}
	public static void main(String[] args) {
		Withreturntype obj=new Withreturntype();
		obj.a=10;
		obj.b=8;
		int r=obj.abc();
		
		System.out.println(r);
	}

}
