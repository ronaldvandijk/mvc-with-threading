package model;

public class Model extends AbstractModel implements Runnable {
	private int aantal;
	private boolean run;
	
	public Model() {
	}
	
	public int getAantal() {
		return aantal;
	}
	
	public void setAantal(int aantal) {
		if (aantal>=0 && aantal <=360) {
			this.aantal=aantal;
			notifyObservers();
		}
	}
	
	public void start() {
		new Thread(this).start();
	}
	
	public void stop() {
		run=false;
	}
	
	@Override
	public void run() {
		run=true;
		while(run) {
			setAantal(getAantal()+1);
			try {
				Thread.sleep(10);
			} catch (Exception e) {} 
		}
	}
}