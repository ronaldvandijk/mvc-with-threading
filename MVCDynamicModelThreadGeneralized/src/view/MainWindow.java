package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;

public class MainWindow {
	private JFrame mainwindow;
	private JPanel buttonpane;
	
	public MainWindow(AbstractDisplayPane leftpane, AbstractDisplayPane rightpane, Controller controller){
		
		mainwindow=new JFrame("Model View Controller/Dynamic Model with thread");
		mainwindow.setSize(450, 285);
		mainwindow.setResizable(false);
		mainwindow.setLayout(null);
		mainwindow.getContentPane().add(leftpane);
		mainwindow.getContentPane().add(rightpane);
		
		leftpane.setBounds(10, 10, 200, 200);
		rightpane.setBounds(230, 10, 200, 200);
				
		buttonpane = new JPanel();
		buttonpane.setBounds(0, 210, 450, 50);
		buttonpane.setSize(450, 50);
		mainwindow.getContentPane().add(buttonpane);
		
		JButton decreaseStep;
		JButton increaseStep;
	    JButton start;
		JButton stop;
		JButton reset;
		
		decreaseStep=new JButton("-1");
		decreaseStep.addActionListener(controller);
		increaseStep=new JButton("+1");
		increaseStep.addActionListener(controller);
		start=new JButton("Start");
		start.addActionListener(controller);
		stop=new JButton("Stop");
		stop.addActionListener(controller);
		
		reset=new JButton("Reset");
		reset.addActionListener(controller);
		
		buttonpane.setLayout(new FlowLayout());
		buttonpane.add(decreaseStep);
		buttonpane.add(increaseStep);
		buttonpane.add(start);
		buttonpane.add(stop);
		buttonpane.add(reset);
		
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	
	}
	
}
