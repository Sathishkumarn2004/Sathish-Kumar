package Yogeshlee;
import java.util.*;
interface circle{
	void area(int r);
}
interface rectangle {
	void area(int l , int b);
}
interface triangle{
	void area(int b , int h);
}
class x1 implements triangle{
	int bt , ht ;
    float a ;
	public void area(int bt , int ht) {
		a = 0.5f * bt * ht ;
	System.out.println("Area of Triangle of "+ bt + " and " +ht+" is "+a );
	System.out.println();
	}
}
class x2 implements circle,rectangle{
	int r , l , b ,ar  ;
	float a;
	public void area(int r) {
		a = 3.14f * r * r ;
	  System.out.println("Area of Circle of "+ r +" is "+a);
	  System.out.println();
	}
	public void area(int l , int b) {
		ar = l * b ;
		System.out.println("Area of Rectangle of "+ l +" and "+ b +" is "+ar );
		 System.out.println();
	}
}
 public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle :");
		int r = sc.nextInt();
		x2 x = new x2();
		x.area(r);
		System.out.println("Enter the length and breadth of the Rectangle :");
		int l = sc.nextInt();
		int b = sc.nextInt();
		x.area(l, b);
		System.out.println("Enter the base and height of the Triangle :");
		int bt = sc.nextInt();
		int ht = sc.nextInt();
		x1 e = new x1();
		e.area(bt,ht);

	}

}
