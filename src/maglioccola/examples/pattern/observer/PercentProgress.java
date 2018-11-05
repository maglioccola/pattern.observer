package maglioccola.examples.pattern.observer;

import java.util.Observable;
import java.util.Observer;

class PercentProgress implements Observer {
	@Override
	public void update(final Observable o, final Object arg) {
		final Integer value = (Integer) arg;
		System.out.println("Progress percent: " + value + "%");
	}
}
