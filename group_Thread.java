import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class group_Thread  extends JPanel  implements Runnable
{
	group_Thread()
	{
		
	}
	public  void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		System.out.println("paint entry...");
	}
	public synchronized  void run()
	{
		System.out.println("run +> "+Thread.currentThread().getName());
	}
}
