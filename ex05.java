package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um texto qualquer: ");
		String text = scanner.nextLine().toUpperCase();		
		System.out.println(text);
	}

}
