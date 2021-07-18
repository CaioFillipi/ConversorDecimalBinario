package br.com.conversor.modulo;

public class Conversor {

	public String convertDecimalForBinary(int value) {
		StringBuffer binaryValue = new StringBuffer();

		while (value > 0) {
			int convertedValue = value % 2;
			value /= 2;
			binaryValue.append(convertedValue);
		}
		return binaryValue.reverse().toString();
	}

	public int convertBinaryForDecimal(int value) {
		String number = String.valueOf(value);
		String validateValue = String.valueOf(value);
		int decimalValue = 0;
		int expoente = number.length();
	
		
		for (int i = 0; i < validateValue.length(); i++) {
			char validValue = validateValue.charAt(i);
			
			if(validValue != '0' && validValue != '1') {
				throw new IllegalArgumentException("Valor informado inválido!");
			}
		}
		
		for (int i = 0; i < number.length(); i++) {
			char numberConverted = number.charAt(i);
			expoente -= 1;
			if(numberConverted == '1') {
				decimalValue += Math.pow(2,expoente) ;
			}
		}
		
		return decimalValue;
	}

}
