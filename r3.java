class B	{}
class A{}


class C implements Runnable
{ 
A a;
B b;
		C(){}
		C(A a,B b)
		{
			this.a=a;
			this.b=b;
		}
		public void run()
		{
			System.out.println("class C run method");
			synchronized(a)
			{
				System.out.println("sysnchronized blovc_1");
				
				synchronized(b)
			{
				System.out.println("sysnchronized blovc_2");
			}
			}
		}

 
}
class D implements Runnable
{ 
A a;
B b;
		D(){}
		D(A a,B b)
		{
			this.a=a;
			this.b=b;
		}
		public void run()
		{
			System.out.println("class D run method");
			synchronized(b)
			{
				System.out.println("sysnchronized blovc_1");
				synchronized(a)
			{
				System.out.println("sysnchronized blovc_2");
			}
			}
		}

 
}
class r3
{
public static void main(String aa[])throws Exception
{
A a=new A();
B b=new B();
C c=new C(a,b);
D d=new D(a,b);
Thread t1=new Thread(c,"aa");
Thread t2=new Thread(d	,"b");
t1.start();
t2.start();
t1.join();
t2.join();
// System.out.println(a1.x);
// System.out.println(a.x);
}
}