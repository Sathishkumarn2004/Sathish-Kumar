package Basic;
public class Methods {
	public static void main(String args[])
	{
		System.out.println("Main");
		method_main();
		System.out.println(method_two());
		System.out.println(method_three("Sathish", " " + "kumar"));
	}
	public static void method_main()
	{
		int a=100;
		int b=200;
		int c= a+b;
		System.out.println(c);
	}
	public static int method_two()
	{
		return 8 + 9;
	}
	public static String method_three(String name1, String name2)
	{
		return name1 + name2;
	}
}
