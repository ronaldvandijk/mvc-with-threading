package run;

import java.util.ArrayList;

import controller.*;
import model.*;
import view.*;

public class MVCDDynamicModelThreadGeneralized {
	private Model model;
	private AbstractDisplayPane countpane;
	private AbstractDisplayPane piepane;
	private Controller controller;
	private ArrayList<AbstractController> controllers;
	
	public MVCDDynamicModelThreadGeneralized() {
		model=new Model();
		controller=new Controller(model);
		//controllers = new ArrayList<AbstractController>();
		
		
		countpane=new CountPane(model);
		piepane=new PiePane(model);
		
		MainWindow mainWindow = new MainWindow(countpane, piepane, controller);
		
		
	}
	
		public static void main(String[] args) {
			new MVCDDynamicModelThreadGeneralized();
		}
	
}
