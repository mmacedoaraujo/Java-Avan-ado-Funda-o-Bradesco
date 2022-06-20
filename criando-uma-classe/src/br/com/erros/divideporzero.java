package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divideporzero {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Número: ");

			int a = s.nextInt();
			System.out.println("Divisor: ");

			int b = s.nextInt();
			System.out.println(a / b);
		} catch (InputMismatchException e1) {
			System.err.println("Erro de InputMismatchException capturado!");

		} catch (Throwable e2) {
			System.err.println("Erro de ArithmaticException capturado!");
		} finally {
			System.err.println("Finally executado...");
		}

	}
}
