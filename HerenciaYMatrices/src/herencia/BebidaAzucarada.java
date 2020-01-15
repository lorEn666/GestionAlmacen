package herencia;

public final class BebidaAzucarada extends Producto {

	private double porcentajeAzucar;
	private boolean promocion;

	public BebidaAzucarada(String nombre, String identificador, double litros, double precio, String marca,
			double porcentajeAzucar, boolean promocion) {
		super(nombre, identificador, litros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}

	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(int porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public double getPrecio() {
		if (promocion) {
			return super.getPrecio() * 0.9;
		} else {
			return super.getPrecio();
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Porcentaje de azúcar: " + porcentajeAzucar + " Promocion: " + promocion;
	}

}