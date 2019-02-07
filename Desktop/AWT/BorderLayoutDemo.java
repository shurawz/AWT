import java.awt.*;

public class BorderLayoutDemo extends Frame
{
	public BorderLayoutDemo(String title)
	{
		super(title); 
		//setLayout(new BorderLayout());
		add("North", new Button("North"));
		add("South", new Button("South"));
		add("East", new Button("East"));
		add("West", new Button("West"));
		add("Center", new Button("Centerhc hfch"));
	}

	public static void main(String[] args) 
	{
		BorderLayoutDemo bld = new BorderLayoutDemo("Demo");
		bld.setSize(300,300);
		bld.setVisible(true);
	}
}