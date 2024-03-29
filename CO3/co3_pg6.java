import java.util.Scanner;

public class co3_pg6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		do {
			System.out.println("1.Find area of circle\n2.Find area of rectangle\n3.Exit");
			c=s.nextInt();
			switch(c) {
			case 1: System.out.println("----Circle----");
					Circle obj1= new Circle();
					obj1.area();
					obj1.perimeter();
					break;
			case 2: System.out.println("----Rectangle----");
					Rect obj2=new Rect();
					obj2.area();
					obj2.perimeter();
			case 3: System.out.println("Exiting....");
					break;
			default: System.out.println("Invalid");
			}
		}while(c!=3);		
		
	}
}

interface Shape{
	void area();
	void perimeter();

}

class Circle implements Shape{
	int r;
	Circle(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=s.nextInt();
	}
	public void area(){
		System.out.println("Area of Circle= "+(3.14*r*r));
		
	}
	public void perimeter(){
		System.out.println("Perimeter of Circle= "+(2*3.14*r));
	}
}

class Rect implements Shape{
	int l,b;
	Rect(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the l and b");
		l=s.nextInt();
		b=s.nextInt();
	}
	public void area(){
		System.out.println("Area of Rectangle= "+(l*b));
	}
	
	public void perimeter(){
		System.out.println("Perimeter of Rectangle= "+(2*(l+b)));
	}
}
