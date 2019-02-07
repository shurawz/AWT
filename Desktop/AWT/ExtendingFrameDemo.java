import java.awt.*;

class ExtendingFrameDemo extends Frame
{
	ExtendingFrameDemo()
	{
		Label name = new Label("Name: ");
		add(name); //this.add(name)
		setVisible(true); //now frame will be visible , by default not visible

	}

	public static void main(String[] args) 
	{
		ExtendingFrameDemo efd = new ExtendingFrameDemo();	
	}
}