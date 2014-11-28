package co.udea.appempresariales.code;

import java.util.ArrayList;

public class CodeBreaker {

	private int numbersLength;
	private String secret;
	private ArrayList containerSuccesfull = new ArrayList();

	// guarda el número a adivinar
	public void setSecret(int secret) {
		this.secret = String.valueOf(secret);
	}

	// método para comparar número entrante con el secret
	public String compare(int numGuess) {
		String key = String.valueOf(numGuess);
		String result = "";

		// segmento para revisar si el número coincide en posición
		for (int i = 0; i < 4; i++) {
			if (secret.charAt(i) == key.charAt(i)) {
				result += "X";
				// si existe un número en la posición se agrega a este arreglo
				// para que haga
				// la distinción y no lo registre dos veces
				containerSuccesfull.add(secret.charAt(i));

			}
		}

		// segmento para revisar si el número se encuentra en cualquier posición
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

	// solo se van a recibir números positivos
	public boolean isPositiveInt(int value) {
		if (value > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValid(String str) {
		// método para verificar si es un entero
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
