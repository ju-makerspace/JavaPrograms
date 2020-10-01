package constructors;

import java.util.*;

class A{
	int a,b;
	int result;
	
	A(int a,int b){
		System.out.println("Parameterized Constructor");
		
		this.a=a;
		this.b=b;
		
		result=this.a+this.b;
		
		System.out.println("the addition of a+b is "+result);
	}
}


public class ParameterizedConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Values ");
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		
		
		
		A obj1=new A(n1,n2);
		

	}

}
