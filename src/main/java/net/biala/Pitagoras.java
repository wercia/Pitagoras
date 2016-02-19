package net.biala;

public class Pitagoras {

	public Double calculateHypotenuse(Double a, Double b) {

		if (a > 0 && b > 0) {
			return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		}

		throw new RuntimeException();
	}

}
