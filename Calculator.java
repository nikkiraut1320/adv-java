import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	JFrame frm;
	JPanel pnl;
	JLabel lno1,lno2,lans;
	JTextField tno1,tno2,tans;
	JButton badd,bsub,bmul,bdiv,bmod,breset,bexit;

	public Calculator()
	{
	frm=new JFrame("CALCULATOR");
	frm.setSize(400,400);
	frm.setVisible(true);
	
	pnl=new JPanel();
	frm.add(pnl);
	pnl.setBackground(Color.pink);
	GridLayout gl=new GridLayout(7,2);
	pnl.setLayout(gl);
	
	lno1=new JLabel("Number 1");
	lno2=new JLabel("Number 2");
	lans=new JLabel("Ans");
	tno1=new JTextField(10);
	tno2=new JTextField(10);
	tans=new JTextField(10);
		
	badd=new JButton("+");
	bsub=new JButton("-");
	bmul=new JButton("*");
	bdiv=new JButton("/");
	bmod=new JButton("%");
	breset=new JButton("Reset");
	bexit=new JButton("Exit..");
	
	pnl.add(lno1);
	pnl.add(tno1);
	pnl.add(lno2);
	pnl.add(tno2);
	pnl.add(lans);
	pnl.add(tans);
	pnl.add(badd);
	pnl.add(bsub);
	pnl.add(bmul);
	pnl.add(bdiv);
	pnl.add(bmod);
	pnl.add(breset);
	pnl.add(bexit);
	
	Font f=new Font("Times new roman",Font.ITALIC+Font.BOLD,24);
	lans.setFont(f);
	lno1.setFont(f);
	lno2.setFont(f);
	

	badd.addActionListener(this);
	bsub.addActionListener(this);
	bdiv.addActionListener(this);
	bmul.addActionListener(this);
	bmod.addActionListener(this);
	breset.addActionListener(this);
	bexit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==badd)
		{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1+n2;
		tans.setText(Integer.toString(ans));
		}

		if(e.getSource()==bsub)
		{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1-n2;
		tans.setText(Integer.toString(ans));
		}

		if(e.getSource()==bmul)
		{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1*n2;
		tans.setText(Integer.toString(ans));
		}

		if(e.getSource()==bdiv)
		{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1/n2;
		tans.setText(Integer.toString(ans));
		}

		if(e.getSource()==bmod)
		{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int ans=n1%n2;
		tans.setText(Integer.toString(ans));
		}

		if(e.getSource()==breset)
		{
		tno1.setText("");
		tno2.setText("");
		tans.setText("");
		}

		if(e.getSource()==bexit)
		{
		frm.setVisible(false);
		}
	}
}		