import java.awt.*;
import java.applet.*;

public class Ht extends Applet
{
	public void init()
	{
		Label name = new Label("Username: "); 
		Label password = new Label("Password: ");
		TextField  userNameText = new TextField(20); //Textield(20) maa 20 le Textfield ko length increase garxa
		TextField  passwordText = new TextField(20);
		Button login = new Button("Login");  //For login button
		Button cancel = new Button("Cancel");  //For cancel button

		/*
			add(login) garena vaney applet show hunda login button dekhaudaina
		*/

		add(name);
		add(userNameText);
		add(password);
		add(passwordText);
		add(login);
		add(cancel);
	}
}