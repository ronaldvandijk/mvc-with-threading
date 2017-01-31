package run;

import javax.swing.*;

import controller.*;
import model.*;
import view.*;

public class MVCDDynamicModelThreadGeneralized {
	private Model model;
	private JFrame screen;
	private AbstractDisplayPane countpane;
	private AbstractDisplayPane piepane;
	private Controller controller;
	
	public MVCDDynamicModelThreadGeneralized() {
		model=new Model();
		controller=new Controller(model);
		countpane=new CountPane(model);
		piepane=new PiePane(model);
		
		
		screen=new JFrame("Model View Controller/Dynamic Model with thread");
		screen.setSize(450, 285);
		screen.setResizable(false);
		screen.setLayout(null);
		screen.getContentPane().add(countpane);
		screen.getContentPane().add(piepane);
		screen.getContentPane().add(controller);
		countpane.setBounds(10, 10, 200, 200);
		piepane.setBounds(230, 10, 200, 200);
		controller.setBounds(0, 210, 450, 50);
		screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		screen.setVisible(true);
	}
	
		public static void main(String[] args) {
			new MVCDDynamicModelThreadGeneralized();
		}
	
}
