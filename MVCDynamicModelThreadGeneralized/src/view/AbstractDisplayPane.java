package view;

import javax.swing.*;

import model.*;

public abstract class AbstractDisplayPane extends JPanel implements Observer {
	private static final long serialVersionUID = -2767764579227738552L;
	private static AbstractModel observable; // in this application all Panes use the same model.

	public static AbstractModel getObservable() {
		return observable;
	}

	public static void setObservable(AbstractModel observable) {
		AbstractDisplayPane.observable = observable;
	}

	public AbstractDisplayPane(AbstractModel observable) {
		observe(observable);
	}
	
	public void observe(AbstractModel observable){
		setObservable(observable);
		getObservable().registerObserver(this);
	}
	
	public Model getModel() {
		return (Model) getObservable();
	}
	
	public void updateView() {
		repaint();
	}
	
	public void update(AbstractModel observable){
		updateView();
	}
}
