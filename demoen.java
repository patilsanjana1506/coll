import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fdemo extends JFrame // implements Runnable , ActionListener
{
	group_Thread group_Thread1;
	Fdemo() throws Exception	
	{
		group_Thread1=new group_Thread();
		add(group_Thread1);
		Thread t1=new Thread(group_Thread1,"main_1");
		t1.start();
		t1.join(100);
		Thread t2=new Thread(group_Thread1,"main_2");
		t2.start();
		t2.join(100);
		
	}
}
class demoen 
{
	public static void main(String []dv) throws Exception
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setBounds(100,50,1000,600);
		
		System.out.println("ram ji");
	}
}