import java.util.Scanner;

public class addition {
     public static int add(int a ,int b) {
    	 int res=0;
    	 res=a+b;
    	 return res;
     }
     public static void main(String[] args) {
    	 Scanner sc =new Scanner(System.in);
    	 int a=sc.nextInt();
    	 int b=sc.nextInt();
    	 int sum=add(a,b);
    	 System.out.println("Sum "+ sum);
    	 
     }
}
