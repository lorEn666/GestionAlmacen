package herencia;

public final class AguaMineral extends Producto {

	private String origen;

	public AguaMineral(String nombre, String identificador, double litros, double precio, String marca, String origen) {
		super(nombre, identificador, litros, precio, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return super.toString() + " Origen: " + origen;
	}

}