package Basic;

public class Different_class {

	public static void main(String[] args) {
	      System.out.println("Subraction:");
	      One obj1 = new One();
	      obj1.method_one();
	      Two obj2 = new Two();
	      System.out.println("Addition:");
	      System.out.println(obj2.method_two());
	      System.out.print("Name:");
	      Three obj3 = new Three();
	      System.out.print(obj3.three("Sathish", " Kumar"));
	}
}
class One
{
	public static void method_one()
	{
		int a=100;
	    int b=200;
	    int c=a-b;
	    System.out.println(c);
	}
}
class Two
{
	public static int method_two() {
		return 8+ 100;
	}
}
class Three
{
	public static String three(String name , String name2)
	{
		return name + name2;
	}
}
