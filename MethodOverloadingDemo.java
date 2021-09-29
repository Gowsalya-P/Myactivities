package myprograms;

/*
 * Method Overloading(If a class has multiple methods having same name but different in parameters, it is known as 
 * Method Overloading)::
 *--number of arguments
  -- order of arguments
  --data type of arguments
  
 Method overloading is not possible by changing the return type of the method
only!!!!

 */

public class MethodOverloadingDemo
{
	String personname;
	long contact1;
	long contact2;
	int a,b;//instance variable
	
	//this keyword=>refers current class instance variable or method
	//this keyword eliminate confusion between instance and local variable
		
	void calc(int a,int b)//local variable! //shadowing !
	{
		//LHS=>INSTANCE VARIABLE,RHS=>LOCAL VARIABLE
		this.a=a;
		this.b=b;
		testing();	//one method calling another method	
	}
	void testing()
	{
		System.out.println("Testing Method loaded!");
	}
	void showrec(String x,long y)//2 args
	{
		//here this keyword is optional
		personname=x;
		this.contact1=y;
		System.out.println("Res:: "+personname+ " "+contact1);
	}
	void showrec(String x,long y,long z)//3 args->datatypes are same. but order is different!
	{
		personname=x;
		contact1=y;
		contact2=z;
		System.out.println("Res:: "+personname+ " "+contact1+ " "+contact2);
	}
	void showrec(long x,long y,String z)//3 args->datatypes are same. but order is different!
	{
		contact1=x;
		contact2=y;
		personname=z;
		System.out.println("Res:: "+personname+ " "+contact1+ " "+contact2);
	}
	/*
	INVALID
	int showrec(long x,long y,String z)//3 args
	{
		
	}
	*/
	//Overloading main method is possible!
	public static void main(String a)//not a entry point method!
	{
	System.out.println("Main:: "+a);	
	}
	public static void main(String[] args) //JVM calls main() method which receives string array as arguments only
	{
		main("Java");//no need of object bcos it is a static method
		
		MethodOverloadingDemo obj1=new MethodOverloadingDemo();
		System.out.println("Before ADD():: "+obj1.a + " "+obj1.b);
		obj1.calc(12, 10);//calc() internally calls testing()!!
		System.out.println("After ADD():: "+obj1.a + " "+obj1.b);
		
		obj1.showrec("Devi", 9789962180L,98404045003L);//2nd version	
		obj1.showrec("Devi", 9789962180L);//1st version
		obj1.showrec(9789962180l, 9840405003L, "Thananya");//3rd version
		
	}
	

}
