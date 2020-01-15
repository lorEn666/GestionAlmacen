package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import herencia.AguaMineral;
import herencia.BebidaAzucarada;
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

	private boolean validaId(String id) {
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] != null && mEstanteria[i][j].getIdentificador().equals(id)) {
					System.err.println("Ya existe un producto registrado con ese ID.");
					return true;
				}
			}
		}
		return false;
	}

	private boolean buscaHueco() {
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] == null) {
					return true;
				}
			}
		}
		return false;
	}

	private void registraAgua(String id) throws Exception {
		Scanner leerString = new Scanner(System.in);
		Scanner leerDouble = new Scanner(System.in);

		ruptura: for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] == null) {
					System.out.println("Inserte NOMBRE, LITROS, PRECIO, MARCA y ORIGEN del agua a registrar:");
					mEstanteria[i][j] = new AguaMineral(leerString.nextLine(), id, leerDouble.nextDouble(),
							leerDouble.nextDouble(), leerString.nextLine(), leerString.nextLine());
					System.out.println("Producto registrado con éxito.");
					break ruptura;
				}
			}
		}
	}

	private void registraBebida(String id) throws Exception {
		Scanner leerString = new Scanner(System.in);
		Scanner leerDouble = new Scanner(System.in);

		ruptura: for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] == null) {
					System.out.println(
							"Inserte NOMBRE, LITROS, PRECIO, MARCA y PORCENTAJE DE AZÚCAR de la bebida a registrar:");
					mEstanteria[i][j] = new BebidaAzucarada(leerString.nextLine(), id, leerDouble.nextDouble(),
							leerDouble.nextDouble(), leerString.nextLine(), leerDouble.nextDouble(),
							productoConPromocion());
					System.out.println("Producto registrado con éxito.");
					break ruptura;
				}
			}
		}
	}

	private boolean productoConPromocion() {
		Scanner leer = new Scanner(System.in);
		System.out.println(
				"Si el producto cuenta con promoción introduzca S. Cualquier otro dato considerará que el producto no dispone de promoción alguna.");
		if (leer.nextLine().toUpperCase().trim().charAt(0) == 'S') {
			return true;
		}
		return false;
	}

	public void agregarProducto() throws Exception {
		Scanner leer = new Scanner(System.in);
		String id, tipoProducto;

		if (buscaHueco()) {
			do {
				System.out.println("Inserte ID del producto que desea registrar:");
				id = leer.nextLine();
			} while (validaId(id));

			System.out.println("¿Desea registrar agua mineral o bebida azucarada? (Agua/Bebida)");
			tipoProducto = leer.next().toUpperCase().trim();

			if (tipoProducto.equals("AGUA")) {
				registraAgua(id);
			}

			if (tipoProducto.equals("BEBIDA")) {
				registraBebida(id);
			}
		} else {
			System.err.println("Almacén lleno. No se pueden registrar más productos.");
		}
	}

	public void mostrarInformacionDeLosProductos() {
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] != null) {
					System.out.println("Fila " + i + " Columna " + j + "\n" + mEstanteria[i][j]);
				}
			}
		}
	}
}
