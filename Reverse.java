package Yogeshlee;                                                                                             
import java.util.Scanner;                                                                                      
public class User{                                                                                      
	public static void main(String[] args) {                                                                   
		int values;
		Scanner obj = new Scanner(System.in);
		values =obj.nextInt();
		int arr[] = new int[values];
		for(int i=0; i<values; i++)
		{
			arr[i]=obj.nextInt();
		}
		for(int i=values-1; i>=0; i--)
		{
                 System.out.println(arr[i]);
		}
	}
}
