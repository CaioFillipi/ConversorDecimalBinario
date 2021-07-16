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
		System.out.println("--Press 0 to exit\n");
		
		Scanner scan = new Scanner(System.in);
		Conversor convert = new Conversor();
		
		System.out.println("Informe o número a ser convertido: ");
		int number = 0;
		
		try {
			number = scan.nextInt();
		}catch (Exception e) {
			System.out.println("Valor inválido!");
			System.exit(0);
		}
		
		
		while(number != 0) {
		
			System.out.println("Número Decimal: "+number);
			System.out.println("Número Binário: "+convert.convertDecimalForBinary(number)+"\n");
			System.out.println("--Press 0 to exit\n");

			System.out.println("Informe o número a ser convertido: ");
			
			try {
				number = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Valor inválido!");
				System.exit(0);
			}
		}

	}

}
