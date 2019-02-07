import java.awt.*;
//import java.applet.Applet;

public class FlowLayoutDemo extends Frame
{
	FlowLayoutDemo()
	{
		Button button1, button2, button3;
		button1 = new Button("OK");
		button2 = new Button("Open");
		button3 = new Button("Close");
		setLayout(new FlowLayout());  //optional as flowlayout is default
		setVisible(true);
		add(button1);
		//setVisible(true);
		add(button2);
		//setVisible(true);
		add(button3);
	}

	public static void main(String[] args) 
	{
		FlowLayoutDemo fld = new FlowLayoutDemo();	
	}
} 
