import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import javax.sound.midi;
class Fdemo extends JFrame
{
	Jpdemo jp;
	Fdemo()
	{
	setTitle("Snake game");	
	jp=new Jpdemo();
	add(jp);
	setResizable(false);
	}
}
class Jpdemo extends JPanel implements ActionListener,KeyListener
{
	int x[]=new int[1000];
	int y[]=new int[1000];
	int dots=5;
	int time=150;
	JButton b;
	Timer t;
	boolean start_game=false;
	
	boolean left=false,right=false,up=false,down=false,enter=false;
	int k=0;
	int r1=0,r2=0;
	Jpdemo()
	{
		x[0]=120;
		y[0]=100;
		
		x[1]=100;
		y[1]=100;
		
		x[2]=80;
		y[2]=100;
		
		x[3]=60;
		y[3]=90;
		
		x[4]=40;
		y[4]=100;
	t=new Timer(time,this);
	t.start();	
	
	addKeyListener(this);
	setFocusable(true);
	randomdemo();
	}
	void randomdemo()
	{
		r1=(int)Math.round(Math.random()*45+1);
		r1=r1*20;
		r2=(int)Math.round(Math.random()*45+1);
		r2=r2*20;
	}
	
		public void paintComponent(Graphics g)
	{
				
				
				for(int j=0;j<10;j++)
		{
			if(x[0]==x[j+1] && y[0]==y[j+1])
			{
				start_game=false;
					{
						 b=new JButton("restart!!");
						b.setSize(100,40);
						b.setLocation(500,600);		
						add(b);
						b.addActionListener(this);
					}
			}
		}	
				if(x[0]==1010||y[0]==1010||x[0]==0||y[0]==0)
				{
					start_game=false;
					{
						 b=new JButton("restart!!");
						b.setSize(100,40);
						b.setLocation(500,600);		
						add(b);
						b.addActionListener(this);
					}
				}
		super.paintComponent(g);
		ImageIcon ii=new ImageIcon("a6.png");
		Image im=ii.getImage();
		g.drawImage(im,0,0,this);
		g.setColor(Color.red);
		g.fillOval(r1,r2,20,20);
		if(start_game==false)
		{
			g.drawRect(3,5,973,945);
		}
		
		for(int i=0;i<dots;i++)
		{
			if(i==0)
			{	
				if(start_game)
				{
				// Color c1=new Color((int)Math.round(Math.random()*255),(int)Math.round(Math.random()*255),(int)Math.round(Math.random()*255));
				// g.setColor(c1);
				g.setColor(Color.red);
				g.fillOval(x[i],y[i],20,20);
				}
			}
			else
			{
				// Color c2=new Color((int)Math.round(Math.random()*255),(int)Math.round(Math.random()*255),(int)Math.round(Math.random()*255));
				// Color c2=new Color(255,255,0);
				if(start_game)
				{
				// g.setColor(c2);
				g.setColor(Color.yellow);
				}
				g.fillOval(x[i],y[i],15,15);
			}
		}
	}		
		public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
		 snake.object().dispose();
		 snake.main(null);
		 b.addActionListener(this);
		}
			if(start_game)
			{
		if(x[0]==r1 && y[0]==r2)
		{
			
			dots++;
			k=k+10;
			time=time+300;
			Timer t=new Timer(time,this);
			t.start();	

			// Timer();
			randomdemo();
			}
			}
		
		if(start_game)
		{
		for(int i=dots;i>0;i--)
		{
		x[i]=x[i-1];
		y[i]=y[i-1];
		}
		if(left)
		{
		x[0]=x[0]-20;
		}	
		if(right)
		{
		x[0]=x[0]+20;
		}	
		if(up)
		{
		y[0]=y[0]-20;
		}	
		if(down)
		{
		y[0]=y[0]+20;
		}	
		}
		repaint();
		// if(x[0]==1000||x[0]==0||y[0]==0||y[0]==1000)
		// {
			// start_game=false;
			// left=false;
			// right=false;
			// up=false;
			// down=false;
				if(x[0]==1000||y[0]==1000||x[0]==0||y[0]==0)
				{
				start_game=false;
				
				
		// if(start_game==false)
		
	

				// Color c7=new Color((int)Math.round(Math.random()*255),(int)Math.round(Math.random()*255),(int)Math.round(Math.random()*255));
				Font f=new Font("Ink Free",100,40);
				Color c7=new Color(255,0,0);
				
				Label up = new Label("                                    game over");
				up.setSize(1000,43);
				up.setLocation(0,440);
				up.setFont(f);
				up.setBackground(c7);
				add(up);
				Label pu = new Label("                                 Total Score=>"+k);
				pu.setSize(1000,43);
				pu.setLocation(0,490);
				up.setBackground(c7);
				pu.setFont(f);
				pu.setBackground(c7);
				add(pu);
				// break;
				t.stop();
				}
		// }
		for(int j=0;j<10;j++)
		{
			if(x[0]==x[j+1] && y[0]==y[j+1])
			{
				start_game=false;
				dots=0;
				Font f1=new Font("Ink Free",100,40);
				Color c8=new Color(255,0,0);
				
				Label upa = new Label("                                    game over");
				upa.setSize(1000,43);
				upa.setLocation(0,440);
				upa.setFont(f1);
				upa.setBackground(c8);
				add(upa);
				Label pua = new Label("                                 Total Score=>"+k);
				pua.setSize(1000,43);
				pua.setLocation(0,490);
				// up.setBackground(c7);
				pua.setFont(f1);
				pua.setBackground(c8);
					add(pua);
					t.stop();

			}
		}
	}
		public void keyReleased(KeyEvent e){
			
			
		}
		public void keyPressed(KeyEvent e)
	{
		
		{start_game=true;
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			left=true;
			right=false;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			left=false;
			right=true;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			left=false;
			right=false;
			up=true;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			left=false;
			right=false;
			up=false;
			down=true; 
		}
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			start_game=false;
			left=false;
			right=false;
			up=false;
			down=false;
		
		}
			if(x[0]==0||x[0]==1000||y[0]==0||y[0]==1000)
		{
			start_game=false;
			dots=0;
		}
	}
		public void keyTyped(KeyEvent e){
	
	}
}
class snake
{
	static Fdemo f;
public static  void main(String []ar)
{
     f=new Fdemo();
	f.setVisible(true);
	f.setSize(1000,1000);
	f.setLocation(500,20);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	// f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}
static Fdemo object()
{
	return f; 
}
}
//************************************S N A K E**************G A M E*****************************************************************
