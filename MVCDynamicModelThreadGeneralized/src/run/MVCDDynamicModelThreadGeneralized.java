package run;

import controller.*;
import model.*;
import view.*;

public class MVCDDynamicModelThreadGeneralized {
	private Model model;
	private AbstractDisplayPane countpane;
	private AbstractDisplayPane piepane;
	private Controller controller;
	
	public MVCDDynamicModelThreadGeneralized() {
		model=new Model();
		controller=new Controller(model);
		countpane=new CountPane(model);
		piepane=new PiePane(model);
		
	    new MainWindow(countpane, piepane, controller);
		
	}
	
		public static void main(String[] args) {
			new MVCDDynamicModelThreadGeneralized();
		}
	
}
