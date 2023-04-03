package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para inverter");
		String ch = sc.nextLine();
		
		char c[] = ch.toCharArray();
		
		if(c.length == 0) System.out.println("Você não digitou nenhum número");
		
		for (int i=c.length-1; i >=0; i-- ) {
			
			System.out.print( c[i] );
		}
		
		
		
		sc.close();
	}

}
