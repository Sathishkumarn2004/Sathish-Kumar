package Basic;
import java.util.*;
class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a =sc.nextInt();
     String arr[] = new String[a];
     for(int i=0; i<arr.length; i++)
     {
    	 arr[i] = sc.next();
     }
     for(int i=0; i<arr.length; i++)
     {
    	 System.out.println(arr[i].length());
     }
   }
}
