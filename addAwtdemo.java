// awt program to add two numbers

import java.awt.*;
import java.awt.event.*;
class addawt extends Frame implements ActionListener
{

	Label l1,l2,l3;
	TextField txt1;
	TextField txt2;
    Button b;

    public addawt()
    {
		setSize(1000,600); // w/h
		setLayout(null);
		setVisible(true);


         l1=new Label("Enter frist number : ");
         l1.setBounds(10,50,100,30);

         txt1=new TextField();
         txt1.setBounds(150,50,250,30);

         l2=new Label("enter second number :");
         l2.setBounds(10,100,100,30);

         txt2 =new TextField();
         txt2.setBounds(150,100,250,30);

         b=new Button("click me");
         b.setBounds(150,150,100,30);
         b.addActionListener(this);

         l3=new Label("--");
         l3.setBounds(10,200,300,30);

         add(l1);
         add(txt1);
         add(l2);
         add(txt2);
         add(b);
         add(l3);
    }

    public void actionPerformed(ActionEvent e)
    {
		String s1=txt1.getText();
		String s2=txt2.getText();

		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;

		String result=String.valueOf(c);
		l3.setText("Total:"+result);

	}
}


public class addAwtdemo
{

    public static void main(String args[])
    {
		addawt frm=new addawt();
    }
}