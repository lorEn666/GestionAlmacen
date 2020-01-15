package principal;

import herencia.AguaMineral;
import herencia.Producto;

public class Main {

	public static void main(String[] args) {

		int opc;
		Almacen estante = new Almacen();
		
		do {
			try {
				switch (opc = Menu.menu()) {
				case 1:
					estante.calculaPrecioDeTodasLasBebidas();
					break;
				case 2:
					estante.calculaPrecioDeUnaMarca();
					break;
				case 3:
					estante.calculaPrecioDeUnaEstanteria();
					break;
				case 4:
					estante.agregarProducto();
					break;
				case 5:
					estante.eliminarProducto();
					break;
				case 6:
					estante.mostrarInformacionDeLosProductos();
					break;
				case 7:
					System.exit(0);
				}
			} catch (Exception e) {
				System.err.println("Error. Inserte un dato v�lido.");
			}
		} while (true);
	}

}