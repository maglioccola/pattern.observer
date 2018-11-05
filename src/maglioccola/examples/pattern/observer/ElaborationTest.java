package maglioccola.examples.pattern.observer;

/**
 * Dimostrazione dell'utilizzo del pattern comportamentale: Observer.<br/>
 * L'oggetto <i>Elaboration</i> viene <i>"osservato" (Observable)</i> da due
 * istanze di diverse classi, quando lo stato di <i>Elaboration</i> varia, i due
 * <i>"osservatori" (Observer)</i> elaborano il nuovo stato.
 */
public class ElaborationTest {

	private static final int STEP = 25;

	public static void main(final String[] args) throws InterruptedException {
		final Elaboration elaboration = new Elaboration();
		final DecimalProgress decimal = new DecimalProgress();
		final PercentProgress percent = new PercentProgress();
		elaboration.addObserver(decimal);
		elaboration.addObserver(percent);

		for (int i = 0; i <= 100; i += STEP) {
			System.out.println("Step: " + ((i / STEP) + 1));
			elaboration.updateProgress(i);
		}
	}

}
