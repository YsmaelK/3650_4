//Ysmael Kamgaing
//013952523
package main;

import gui.CustomerGUI;
import gui.OrderGUI;
public class Driver
{
	public static void main(String[] args)
	{
		CustomerGUI mainGUI = new CustomerGUI();
		mainGUI.showWindow();
		OrderGUI oGUI = new OrderGUI();
		oGUI.showWindow();
	}
}
