import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame implements ActionListener
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Book");
		this.setBackground(Color.green);
	}
	public void paint(Graphics g)
	{
		Font f = new Font("arial",Font.BOLD+Font.ITALIC,40);
		g.setFont(f);
		this.setForeground(Color.black);
		g.drawString("RaGav",200,200);
	}
}
class  AA
{
	public static void main(String[] args) 
	{
		myframe m = new myframe();
	}
}
