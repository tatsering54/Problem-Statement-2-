//Run Time error Main class need to declare inside the class
class Parent
{
	private void method1()
	{
		System.out.println ("Parent's method1()");
	}
	public void method2() 
	{
		System.out.println ("Parent's method2()");
		method1();
	}
}
	class Child extends Parent 
	{
	public void method1() 
	{
		System.out.println ("Child's method1()");
	}
 	public static void main(String args[])   
	{
		Parent p = new Child();
		p.method2();
 	}
}



