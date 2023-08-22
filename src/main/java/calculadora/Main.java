package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale brasilLocale = new Locale("pt", "BR");
        Locale.setDefault(brasilLocale);


		String opcao;
		double n1, n2, resultado;
		boolean continua = true;
		
		escrever("-----Calculadora em Java-----");
		n1 = lerDouble("Digite o primeiro numero: ");
		n2 = lerDouble("Digite o segundo numero: ");	
		
		resultado = menuOperadores(n1, n2);				
		escrever(Double.toString(resultado));		
		do {									
			opcao = lerString("Deseja continuar a Operacao? S ou N").toUpperCase();
			
			if (opcao.equals("N")) {
				continua = false;
				escrever("Finalizado!");
			}
			else if (opcao.equals("S")){
				n2 = lerDouble("Digite o numero: ");
				resultado = menuOperadores(resultado, n2);
				escrever(Double.toString(resultado));		
			}
			else {
				escrever ("Opcao Invalida!");
			}
			
		} while(continua);

	}
	
	public static double menuOperadores (double n1, double n2) {
		String opcao;
		opcao = lerString("Digite o operador: (+, -, *, /)");
		
		if (opcao.equals("+")) {
			return somar(n1, n2);
		} 
		
		else if (opcao.equals("-")) {
			return subtrair(n1, n2);
		}
		
		else if(opcao.equals("*")) {
			return multiplicar(n1, n2);
		}
		
		else if(opcao.equals("/")){	
			return dividir(n1, n2);	
		}
		else {
			escrever("Operador Inválido!" );
			menuOperadores(n1, n2);
			
		}
		return n1;

	}
	
	public static double lerDouble(String msg) {
		Scanner sc = new Scanner(System.in);
		escrever(msg);
		return sc.nextDouble();		
	}
	
	public static String lerString(String msg) {
		Scanner sc = new Scanner(System.in);
		escrever(msg);
		return sc.next();
	}
	
	public static void escrever(String msg) {
		System.out.println(msg);
	}
	
	
	public static double somar(double n1, double n2) {
		return n1+n2;
	}
	
	public static double subtrair(double n1, double n2) {
		return n1-n2;
	}
	
	public static double  multiplicar(double n1, double n2) {
		return n1*n2;
	}
	
	public static double dividir(double n1, double n2) {
		return n1/n2;
	}

}
