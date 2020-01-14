package principal;

import herencia.AguaMineral;
import herencia.Producto;

public class Main {

	public static void main(String[] args) {

		int opc = 0;
		Almacen estante = new Almacen();
		
		do {
			try {
				switch (opc = Menu.menu()) {
				case 1:
					estante.calculaPrecioDeTodasLasBebidas();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					estante.agregarProducto();
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					System.exit(0);
				}
			} catch (Exception e) {
				System.err.println("Inserte un dato válido.");
			}
		} while (true);
	}

}
