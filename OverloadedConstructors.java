package constructors;

import java.util.*;

class B{
	int a=10,b=20,c=30;
	
	B(){
		System.out.println("Default Constructor");
	}
	
	
	B(int a){
		System.out.println("Parameterized Constructor 1");
		
		System.out.println("the values are "+this.a+" "+a);
	}
	
	
	B(int a,int b){
		System.out.println("Parameterized Constructor 2");
		
		int res1=this.a+this.b;
		System.out.println("the addition of data members a and b are "+res1);
		
		int res2=a+b;
		System.out.println("the addition of formal parameters a and b are "+res2);
	}
	
	
	B(int a,int b,int c){
		System.out.println("Parameterized Constructor 3");
		
		int res1=this.a+this.b+this.c;
		System.out.println("the addition of data members a,b and c are "+res1);
		
		int res2=a+b+c;
		System.out.println("the addition of formal parameters a,b and c are "+res2);
		
		
		
	}
}


public class OverloadedConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Values ");
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int n3 =sc.nextInt();
		
		B obj1=new B();
		B obj2=new B(n1);
		B obj3=new B(n1,n2);
		B obj4=new B(n1,n2,n3);

	}

}
