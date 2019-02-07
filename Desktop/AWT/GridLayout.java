/*
GridLayout:

A container using the GridLayout scheme arranges components in rows and columns in row-major
order. Each component is sized to fit its respective grid cell.

*Constructors:
a) GridLayout()
b) GridLayout(int rows, int cols)
c) GridLayout(int rows, int cols, itn hgap, int vgap)
*/

import java.awt.*;

public class GridLayout extends Frame
{
	public GridLayout(String title)
	{
		super(title);
	//	setLayout(new GridLayout(2,3));
		add(new Button("1")); //sabbai thik xa haii but problem is X,,
								   //X ko thau maa arkai huna parxa, k ho bujhn parxa :-D
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("5"));
		add(new Button("6"));
	}

	public static void main(String[] args) 
	{
		GridLayout gl = new GridLayout("Border Layout");	
		gl.setSize(200,200);
		gl.setVisible(true);
	}
}