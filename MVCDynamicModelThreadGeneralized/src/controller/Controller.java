package controller;

import model.*;

import java.awt.event.*;

public class Controller extends AbstractController {
	public Controller(Model model) {
		super(model);		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getActionCommand().equals("-1")) {
			model.setAantal(model.getAantal()-1);
		}
		
		if (e.getActionCommand().equals("+1")) {
			model.setAantal(model.getAantal()+1);
		}
		
		if (e.getActionCommand().equals("Start")) {
			model.start();
		}
		
		if (e.getActionCommand().equals("Stop")) {
			model.stop();
		}
		
		if (e.getActionCommand().equals("Reset")) {
			model.reset();
		}
		
	}
}
