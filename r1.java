
class A implements Runnable
{
	
	   int x;
	public    void run()
	{ int i;
		for(i=1;i<=10000;i++)
		{
			A a=new A();
			synchronized(a)
			{
			x++;
				
			}
		}
	}
	
	
}

class r1
{

public static void main(String a[]) throws Exception
{
A a1=new A();
A a2=new A();

Thread t1=new Thread(a1);
Thread t2=new Thread(a1);
// t1=null;
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println(a1.x);
System.out.println(a2.x);

}
}