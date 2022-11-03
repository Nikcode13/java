import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class LearnAWT extends Frame
{
    Label l1=new Label("frist number");
    Label l2=new Label("second number");
    Label l3=new Label("result");

    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();

    Button b=new Button("add");

    LearnAWT()
    {
		 setTitle("Adder");

		 l1.setBounds(50,100,100,20);
		 l2.setBounds(50,140,100,20);
		 l3.setBounds(50,180,100,20);

		 t1.setBounds(200,100,100,20);
		 t2.setBounds(200,140,100,20);
		 t3.setBounds(200,180,100,20);

		 b.setBounds(170,250,50,20);


		 add(b);
		 add(l1);
		 add(l2);
		 add(l3);
	     add(t1);
	     add(t2);
	     add(t3);

		 setSize(400,350);
		 setVisible(true);

		 b.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent e)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;

				t3.setText(String.valueOf(c));
			}
		 });
	}

	public static void main(String args[])
	{
		new LearnAWT();
	}
}