package b06.s066;

public class Dog implements BarkAndWag {
	@Override
	public String bark() {
		return "woof!";
	}

	// esempio di overloading, per Java bark sono due metodi completamente diversi
	// in quanto dipendono da parametri diversi
	public String bark(int count) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; i++) {
			sb.append(bark());
		}

		return sb.toString();
	}

	@Override
	public int tailWaggingSpeed() {
		return BarkAndWag.AVG_WAGGING_SPEED;
	}
}