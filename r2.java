
class A implements Runnable
{    int t=2;
	public  synchronized void run()
		{
			if(t>0)
			{
				synchronized(this)
				{
				System.out.println(Thread.currentThread().getName());
				t=t-1;
				
				}
			}
		}

 
}
class r2
{
public static void main(String aa[])throws Exception
{
A a1=new A();
Thread t[]=new Thread[10];
String s[]={"a","b","c","d","e","f","g","h","i","j"};
int i;
for(i=0;i<10;i++)
{
	t[i]=new Thread(a1,s[i]);
}
for(i=0;i<10;i++)
{
t[i].start();
	
}
}
}