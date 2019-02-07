//BY CREATING OBJECT OF FRAME
import java.awt.*;
class CreatingFrameDemo
{
	CreatingFrameDemo()
	{
		Label name = new Label("Name: ");
		Frame frame = new Frame();
		frame.add(name);
		frame.setSize(300,400);
		frame.setVisible(true); //now frame will be visible, by default not visible
	}
	public static void main(String[] args) 
	{
		CreatingFrameDemo cfd = new CreatingFrameDemo();	
	}
}