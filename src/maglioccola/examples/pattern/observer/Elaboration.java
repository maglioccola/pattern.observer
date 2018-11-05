package maglioccola.examples.pattern.observer;

import java.util.Observable;

public class Elaboration extends Observable {
	public void updateProgress(final Integer value) {
		setChanged();
		notifyObservers(value);
	}

}