import java.awt.*;

class A extends Frame implements Runnable
{
	public void paint(Graphics g)
	{
		// g.drawString(s1,80,80);
	}
	int f=0;
	public void run()
	{
		// for(int i=1;i<=1222121;i++)
		// {
		// s1=s1.substring(1,s1.length())+s1.charAt(0);
		// try{Thread.sleep(111);}catch(Exception d){}
		// repaint();
		// }
		
	}	
}

class Demo1
{
	public static void main(String aa[])
	{
	String s1="ame is ram My n";
		for(int i=1;i<=1222121;i++)
		{
		s1=s1.substring(1,s1.length())+s1.charAt(0);
		try{Thread.sleep(111);}catch(Exception d){}
		System.out.println(s1);
		}
		// A a=new A();
		// a.setVisible(true);
		// a.setBounds(100,100,500,500);
		// Thread d=new Thread(a);
		// d.start();
	}
	
}