package br.com.conversor.main;

import java.util.Scanner;

import br.com.conversor.modulo.Conversor;

public class Main {

	public static void main(String[] args) {
		System.out.println("			////////////////////////////////////");
		System.out.println("			||                            	  ||");
		System.out.println("			||                                ||");
		System.out.println("			||   Convert Decimal for Binary   ||");
		System.out.println("			||                            	  ||");
		System.out.println("			||                           	  ||");
		System.out.println("			////////////////////////////////////\n");

		System.out.println("--Pressione 'b' binario para decimal\n");
		System.out.println("--Pressione 'd' decimal para binario\n");

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tipo de conversão:");
		String scanOperation = scan.nextLine();

		Conversor convert = new Conversor();

		while (scanOperation.equals("b") || scanOperation.equals("d")) {
			int number = 0;
			System.out.println("Informe o número a ser convertido: ");
			
			try {
				number = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Valor inválido!");
			}
			
			if (scanOperation.equals("b")) {
				
					System.out.println("Número Binário: " + number);
					System.out.println("Número Decimal: " + convert.convertBinaryForDecimal(number) + "\n");

			} else if (scanOperation.equals("d")) {

					System.out.println("Número Decimal: " + number);
					System.out.println("Número Binário: " + convert.convertDecimalForBinary(number) + "\n");
			}
			
			System.out.println("--Pressione 'b' binario para decimal");
			System.out.println("--Pressione 'd' decimal para binario\n");
			System.out.println("Informe o tipo de conversão:");
			scanOperation = scan.next();
		}
	}

}
