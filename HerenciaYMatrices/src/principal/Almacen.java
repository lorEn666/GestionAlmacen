package principal;

import java.util.Scanner;

import herencia.Producto;

public class Almacen {
	
	private Producto[][] mEstanteria;
	
	public Almacen() {
		mEstanteria = new Producto[4][4];
	}

	public void calculaPrecioDeTodasLasBebidas() {

		double precioTotal = 0;

		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] != null) {
					precioTotal += mEstanteria[i][j].getPrecio();
				}
			}
		}

		System.out.println(precioTotal);
	}

	public void agregarProducto() {

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] == null) {
					
				}
			}
		}
	}
}
