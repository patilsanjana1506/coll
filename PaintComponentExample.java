import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fdemo extends JFrame
{
	 JPdemo jp1;
	Fdemo()
	{
		super.setTitle("Snake & Ladder");
		jp1=new JPdemo();
		add(jp1);
	}
}
class JPdemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4;
	ImageIcon img5,img6,img7;
	ImageIcon img8,img9,img10,img11;
	Image soft,a9,a21,a22,a23;
	Image a19,a20;
	Image a119,a120;
	Image a15,aa1;
	int px1=45,py1=620;
	int px2=130,py2=620;
	// Image a119,a120;
	// Image a7,a18;
	JButton b,b1,b2,b3,b4,b5;
	JTextField tx1,tx2,tx3;
	int count=0,count2=0;
	int count1=0,count_2=0;
	int chance=0;
	int k=1;
	int i=0;
	JPdemo()
	{
		setBackground(Color.black);
		img1=new ImageIcon("soft.jpg");
		img2=new ImageIcon("a9.jpg");
		img3=new ImageIcon("a21.jpg");
		img4=new ImageIcon("a23.jpg");
		img5=new ImageIcon("about.gif");
		img6=new ImageIcon("a18.png");
		img7=new ImageIcon("start.gif");
		img8=new ImageIcon("a19.png");
		img9=new ImageIcon("a20.png");
		img10=new ImageIcon("dice.gif");
		img11=new ImageIcon("aa1.png");
		soft=img1.getImage();
		a9=img2.getImage();
		a21=img3.getImage();
		a23=img4.getImage();
		a19=img8.getImage();
		a20=img9.getImage();
		a119=img8.getImage();
		a120=img9.getImage();
		a15=img10.getImage();
		aa1=img11.getImage();
		// a7=img5.getImage();
		setLayout(null);
		b=new JButton(img5);
		b.setBounds(50,120,100,30);	
		b.setBackground(new Color(4,129,255));
		add(b);
//**************************************************************************
		Font f1=new Font("Bauhaus 93",Font.ITALIC,25);
		b2=new JButton("Roll");
		b2.setBounds(50,500,100,30);	
		b2.setBackground(new Color(4,129,255));
		b2.setForeground(Color.red);
		b2.setFont(f1);
		b2.addActionListener(this);
		add(b2);
//**************************************************************************
		b3=new JButton(img7);
		b3.setBounds(25,560,150,60);	
		b3.setBackground(new Color(4,129,255));
		b3.setForeground(Color.red);
		b3.setFont(f1);
		add(b3);
//**************************************************************************
		// b2=new JButton(img6);
		// b2.setBounds(50,160,100,30);	
		// b2.setBackground(new Color(4,129,255));
		// add(b2);
//**************************************************************************
		Font f=new Font("Bauhaus 93",Font.ITALIC,25);
		tx1=new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		tx1.setFont(f);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		add(tx1);
//******************************************************************
		tx2=new JTextField("Start Game");
		tx2.setBounds(50,270,150,35);
		tx2.setFont(f);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		add(tx2);
//******************************************************************
		tx3=new JTextField("Start Game");
		tx3.setBounds(50,310,150,35);
		tx3.setFont(f);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		add(tx3);
//******************************************************************
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(new Color(4,129,255));
		g.fillRect(0,0,200,735);
		
		g.drawImage(soft,0,0,this);
		g.drawImage(a9,200,0,this);
		g.drawImage(a21,920,15,this);
		g.drawImage(a23,25,550,this);
		
		// g.setColor(Color.blue);
		g.drawImage(a19,px1,py1,this);
		// g.drawImage(a20,130,620,this);
		g.drawImage(a20,px2,py2,this);
		g.drawImage(a119,10,240,this);
		g.drawImage(a120,10,310,this);
		g.drawImage(a15,10,410,this);
		g.drawImage(aa1,110,420,this);
		// g.drawImage(a7,50,120,this);
	}
	public void  actionPerformed(ActionEvent e)
	{
		{
		if(e.getSource()==b2)
	for(i=1;i<=100;i++)
	{
		if(i%2==0)
			
		{
			int r1=(int)Math.round(Math.random()*5+1);
			switch(r1)
			{
				case 1://
					img11=new ImageIcon("b1.png");//
					if(count2+1<=100){
					count2+=1;}
					break;//
					case 2://
					img11=new ImageIcon("b2.png");//
					if(count2+2<=100){
					count2+=2;}
					break;//
					case 3://
					img11=new ImageIcon("b3.png");//
					if(count2+3<=100){
					count2+=3;}
					break;//
					case 4://
					img11=new ImageIcon("b4.png");//
					if(count2+4<=100){
					count2+=4;}
					break;//
					case 5://
					img11=new ImageIcon("b5.png");//
					if(count2+5<=100){
					count2+=5;}
					break;//
					case 6://
					img11=new ImageIcon("b6.png");//
					if(count2+6<=100){
					count2+=6;}
					break;//

			}
			aa1=img11.getImage();
		// System.out.println(r1);
		k=1;
			px1=210;
			py1=645;
			count_2=0;	
			// System.out.println(count2+" p2");
			
		
			M:
			for(int i=1;i<=10;i++)
		{
				
				if(k==11){
					px1-=70;
					k--;
				}
				else if(k==0){
					px1+=70;
					k++;
				}
				for(int j=1;j<=10;j++){
					count_2++;
					try{Thread.sleep(20);}
					catch(Exception ex){}
	
					repaint();
			// repaint();
	
					if(count_2==count2)break M;
					if(i%2==1)
					{
					px1+=70;
					k++;
					}
					else
					{
						px1-=70;
						k--;
	
					}
				}
				py1-=70;
			
			
			
		}}
//************************************************************+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++/*+/*/+*++*/*+****************************************/*+++++++++++++++++++++++++++++++++++/+*********************/+++++++++++++*/+*
		else
		// if(e.getSource()==b2)
		{
			int r1=(int)Math.round(Math.random()*5+1);
			switch(r1)
			{
				case 1://
					img9=new ImageIcon("b1.png");//
					if(count2+1<=100){
					count2+=1;}
					break;//
					case 2://
					img9=new ImageIcon("b2.png");//
					if(count2+2<=100){
					count2+=2;}
					break;//
					case 3://
					img9=new ImageIcon("b3.png");//
					if(count2+3<=100){
					count2+=3;}
					break;//
					case 4://
					img9=new ImageIcon("b4.png");//
					if(count2+4<=100){
					count2+=4;}
					break;//
					case 5://
					img9=new ImageIcon("b5.png");//
					if(count2+5<=100){
					count2+=5;}
					break;//
					case 6://
					img9=new ImageIcon("b6.png");//
					if(count2+6<=100){
					count2+=6;}
					break;//

			}
			a20=img9.getImage();
		// System.out.println(r1);
		}
		k=1;
			px2=130;
			py2=645;
			count_2=0;	
			// System.out.println(count2+" p2");
			
		
			M:
			for(int i=1;i<=10;i++){
				
				if(k==11){
					px2-=70;
					k--;
				}
				else if(k==0){
					px2+=70;
					k++;
				}
				for(int j=1;j<=10;j++){
					count_2++;
					try{Thread.sleep(20);}
					catch(Exception ex){}
	
					repaint();
			// repaint();
	
					if(count_2==count2)break M;
					if(i%2==1)
					{
					px2+=70;
					k++;
					}
					else
					{
						px2-=70;
						k--;
	
					}
				}
				py2-=70;
		// }
		}
			
		}
	}
	}
}
class ladder
{
	public static void main(String []aamn)
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setBounds(200,100,990,735);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
//**********************************I N C O M.****S N A K E******L A D D E R********/********************************************************************************
