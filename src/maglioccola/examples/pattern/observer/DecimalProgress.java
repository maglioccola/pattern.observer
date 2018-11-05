package maglioccola.examples.pattern.observer;

import java.util.Observable;
import java.util.Observer;

class DecimalProgress implements Observer {
	@Override
	public void update(final Observable o, final Object arg) {
		final Integer value = (Integer) arg;
		System.out.println("Progress decimal: " + (value / 10) + "/10");
	}
}
