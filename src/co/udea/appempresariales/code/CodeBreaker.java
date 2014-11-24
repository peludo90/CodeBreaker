package co.udea.appempresariales.code;

import java.util.ArrayList;

public class CodeBreaker {
	
	private int numbersLength;
	private String secret;
	private ArrayList containerSuccesfull = new ArrayList();

	public void setSecret(int secret) {
		this.secret = String.valueOf(secret);
	}

	public void setNumbersLength(int numbersLength){
		this.numbersLength= numbersLength;
	}
	
	public String compare(int numGuess) {
		String key = String.valueOf(numGuess);
		String result = "";
		for (int i = 0; i < 4; i++) {
			if (secret.charAt(i) == key.charAt(i)) {
				result += "X";
				containerSuccesfull.add(secret.charAt(i));

			}
		}
		for (int i = 0; i < key.length(); i++) {

			if (!containerSuccesfull.contains(key.charAt(i))) {
				if (secret.charAt(i) != key.charAt(i)) {
					if (secret.contains(String.valueOf(key.charAt(i)))) {
						result += "_";
					}
				}
			}
		}
		return result;
	}

	public boolean isPositiveInt(String str) {
		try {
			int i = Integer.parseInt(str);
			if (i >= 0) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}

	
	
}
