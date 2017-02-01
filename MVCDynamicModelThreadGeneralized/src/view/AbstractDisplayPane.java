package view;

import javax.swing.*;

import model.*;

public abstract class AbstractDisplayPane extends JPanel implements Observer {
	private static final long serialVersionUID = -2767764579227738552L;
	private static Observable observable; // in this application all Panes use the same model.

	/**
	 * Reference to the object this display pane is observing
	 * 
	 * @return returning an observable
	 */
	public static Observable getObservable() {
		return observable;
	}
	
	/**
	 * Defines the object this pane should observe. Note that this
	 * method only registers an observable object. 
	 * @param observable
	 */
	public static void setObservable(Observable observable) {
		AbstractDisplayPane.observable = observable;
	}

	/**
	 * Constructor for the class
	 * @param observable register the object we would like to observe
	 */
	public AbstractDisplayPane(Observable observable) {
		observe(observable);
	}
	
	/**
	 * 
	 * @param observable
	 */
	public void observe(Observable observable){
		setObservable(observable);
		getObservable().registerObserver(this);
	}
	
	public Model getModel() {
		return (Model) getObservable();
	}
	
	public void updateView() {
		repaint();
	}
	
	public void update(){
		updateView();
	}
}
