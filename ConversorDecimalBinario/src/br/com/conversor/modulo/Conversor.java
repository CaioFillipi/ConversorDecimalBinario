package br.com.conversor.modulo;

public class Conversor {
	
	public String convertDecimalForBinary(int value) {
		StringBuffer binaryValue = new StringBuffer();
		
		while(value > 0) {
			int convertedValue =value%2;
			value /= 2;
			binaryValue.append(convertedValue);
		}
		return binaryValue.reverse().toString();
	}

}
