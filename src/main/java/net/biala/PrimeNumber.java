package net.biala;

public class PrimeNumber {

	public boolean isFirstNumber(int number) {

		if (number > 1) {

			for (int i = 2; i < number; ++i) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
