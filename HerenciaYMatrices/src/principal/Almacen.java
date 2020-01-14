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

	public void agregarProducto() {

		ruptura: for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria[i].length; j++) {
				if (mEstanteria[i][j] == null) {
					System.out.println(
							"¿El producto que desea introducir es agua mineral o bebida azucarada? (Agua/Bebida)");
					try {
						Scanner leer = new Scanner(System.in);
						if (leer.next().toUpperCase().equals("AGUA")) {
							mEstanteria[i][j] = new AguaMineral(mEstanteria[i][j].getNombre(),
									mEstanteria[i][j].getIdentificadorAt(), mEstanteria[i][j].getLitros(),
									mEstanteria[i][j].getPrecioAt(), mEstanteria[i][j].getMarca(),
									mEstanteria[i][j].getOrigen());
						}

						if (String.valueOf(leer).toUpperCase().equals("BEBIDA")) {
							mEstanteria[i][j] = new BebidaAzucarada(mEstanteria[i][j].getNombre(),
									mEstanteria[i][j].getIdentificadorAt(), mEstanteria[i][j].getLitros(),
									mEstanteria[i][j].getPrecioAt(), mEstanteria[i][j].getMarca(),
									mEstanteria[i][j].getPorcentajeDeAzucar(), mEstanteria[i][j].getPromocion());
						}
						
						for (int j2 = 0; j2 < mEstanteria.length; j2++) {
							for (int k = 0; k < mEstanteria[j2].length; k++) {
								if (mEstanteria[i][j].getIdentificador()
										.equals(mEstanteria[j2][k].getIdentificador())) {
									mEstanteria[i][j] = null;
									System.err.println("Ya se ha registrado un producto con el mismo identificador.");
									break ruptura;
								}
							}
						}
					} catch (Exception e) {
						System.err.println("Dato introducido no es correcto.");
						break ruptura;
					}
				}
			}
		}
	}
}
