package principal;

import java.util.Scanner;

public class Menu {

	public static int menu() throws Exception {
		Scanner leer = new Scanner(System.in);

		System.out.println("****** Almácen ******");
		System.out.println("1- Calcular precio de todas las bebidas");
		System.out.println("2- Calcular precio total de una marca de bebida");
		System.out.println("3- Calcular precio total de una estantería");
		System.out.println("4- Agregar producto");
		System.out.println("5- Eliminar un producto");
		System.out.println("6- Mostrar información");
		System.out.println("7- Salir");

		return leer.nextInt();
	}
}
