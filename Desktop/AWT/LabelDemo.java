import java.awt.*;
import java.applet.*;

public class LabelDemo extends Applet
{
	public void init()
	{
		Label name = new Label("Name: ", Label.LEFT);
		Label address = new Label("Address: ");
		Label roll = new Label("Roll no: ");

		add(name);
		this.add(address);
		add(roll);
		Label thahachaina = new Label();
		thahachaina.setText("Salary");
		String naaam = thahachaina.getText();
		System.out.println(naaam);
		System.out.println(Label.LEFT);
		address.setAlignment(Label.RIGHT);


	}
}
