import java.awt.*;
import java.awt.event.*;
class A  extends Frame  implements Runnable
{
	String s1="my name is ram ";
	public void paint(Graphics g)
	{
		g.drawString(s1,50,50);
	}
	public void run()
	{
		for(;;)
		{
			repaint();
			try{Thread.sleep(100);}catch(Exception e){}
			s1=s1.substring(1)+s1.charAt(0);
		}
		
	}
}
class t3
{
	public static void main(String aa[])
	{
	A a=new A();
	a.setVisible(true);
	a.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	a.setBounds(100,100,500,500);
	Thread d=new Thread(a);
	d.start();
	// System.out.println(Thread.currentThread());
	
	}
	
}